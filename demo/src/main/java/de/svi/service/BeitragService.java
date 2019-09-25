/*
 * Created on 04.08.2019
 *
 * Dimensions - Versionierung
 * $Workfile: %PM% $
 * $Revision: %PR% $
 * $Date: %Date% $
 * $Author: %Author% $
 * 
 * (c) Copyright SV Informatik GmbH 2010
 */

package de.svi.service;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentSkipListMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import de.svi.data.dto.BeitragDTO;

/**
 * Zweck dieser Klasse: <br>
 * (Hier Zweck eintragen - bis zu 2 Zeilen).
 * <p>
 * Angewandte Pattern: <br>
 * (Hier Pattern nennen)
 * <p>
 * Zusammenhaenge / Partnerklassen <br>
 * (Hier erlaeutern)
 * <p>
 * Abgrenzung zu anderen Klassen <br>
 * (Hier erlaeutern)
 * <p>
 * Weitere Informationen <br>
 * (Hier auffuehren)
 * 
 * @author N0008295
 */
@Service
public class BeitragService {
  
  /**
   * Logger fuer BeitragService anlegen
   */
  private static final Logger LOGGER = LoggerFactory.getLogger(BeitragService.class);
  // Map als Datenbank-Simulation:
  private Map<Instant, BeitragDTO> beitragPool = new ConcurrentSkipListMap<Instant, BeitragDTO>();
  
  public void neuenBeitragSpeichern(BeitragDTO beitrag) {
    LOGGER.info(beitrag.toString());
    DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).withLocale(Locale.GERMAN).withZone(ZoneId.systemDefault());
    beitrag.setDate(formatter.format(Instant.now()));
    beitragPool.put(Instant.now(), beitrag);
  }
  
  public List<BeitragDTO> getAlleBeitraege() {
    // TODO sort reverse order
    return new ArrayList(beitragPool.values());
  }
  
}
