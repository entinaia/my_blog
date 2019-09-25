/*
 * Created on 01.08.2019
 *
 * Dimensions - Versionierung
 * $Workfile: %PM% $
 * $Revision: %PR% $
 * $Date: %Date% $
 * $Author: %Author% $
 * 
 * (c) Copyright SV Informatik GmbH 2010
 */

package de.svi.controllers;

import java.util.List;
import java.util.Map.Entry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.svi.data.dto.BeitragDTO;
import de.svi.service.BeitragService;

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
@CrossOrigin(origins = { "*" })
@RestController
@RequestMapping("/demo")
public class DemoController {
  
  @Autowired
  BeitragService beitragService;
  
  /**
   * Logger fuer DemoController anlegen
   */
  private static final Logger LOGGER = LoggerFactory.getLogger(DemoController.class);
  
  @GetMapping(value = "/data")
  public ResponseEntity<List<BeitragDTO>> getAllPosts() {
    
    return new ResponseEntity<>(beitragService.getAlleBeitraege(), HttpStatus.OK);
    
  }
  
  @GetMapping(value = "/test")
  public ResponseEntity<String> getTestString() {
    
    for (Entry<String, String> envvar : System.getenv().entrySet()) {
      System.out.println((envvar.getKey() + ": " + envvar.getValue()));
    }
    
    return new ResponseEntity<>("Hello there, I am running :0)", HttpStatus.OK);
    
  }
  
  @PostMapping(value = "/neu/")
  public ResponseEntity<BeitragDTO> addNewPost(@RequestBody BeitragDTO neuerBeitrag) {
    beitragService.neuenBeitragSpeichern(neuerBeitrag);
    return new ResponseEntity<>(neuerBeitrag, HttpStatus.OK);
    
  }
  
  // @PostMapping(value = "/init/")
  // public ResponseEntity<VerwaltungDTO> init(@RequestBody KontextDTO kontext) {
  // VerwaltungDTO result = arbeitgeberVerwaltungReadService.init();
  // return new ResponseEntity<>(result, HttpStatus.OK);
  // }
  
}
