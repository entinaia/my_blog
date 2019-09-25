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

package de.svi.data.dto;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
public class BeitragDTO {
  
  /**
   * Logger fuer BeitragDTO anlegen
   */
  private static final Logger LOGGER = LoggerFactory.getLogger(BeitragDTO.class);
  
  private String userId;
  private String id;
  private String titel;
  private String body;
  private String date;
  
  /**
   * 
   */
  public BeitragDTO() {
  }
  
  /**
   * @return the userId
   */
  public String getUserId() {
    return userId;
  }
  
  /**
   * @param userId the userId to set
   */
  public void setUserId(String userId) {
    this.userId = userId;
  }
  
  /**
   * @return the id
   */
  public String getId() {
    return id;
  }
  
  /**
   * @param id the id to set
   */
  public void setId(String id) {
    this.id = id;
  }
  
  /**
   * @return the titel
   */
  public String getTitel() {
    return titel;
  }
  
  /**
   * @param titel the titel to set
   */
  public void setTitel(String titel) {
    this.titel = titel;
  }
  
  /**
   * @return the body
   */
  public String getBody() {
    return body;
  }
  
  /**
   * @param body the body to set
   */
  public void setBody(String body) {
    this.body = body;
  }
  
  /**
   * @return the date
   */
  public String getDate() {
    return date;
  }
  
  /**
   * @param string the date to set
   */
  public void setDate(String string) {
    this.date = string;
  }
  
  /*
   * (non-Javadoc)
   * 
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    return "BeitragDTO [userId=" + userId + ", id=" + id + ", titel=" + titel + ", body=" + body + ", date=" + date + "]";
  }
  
  /*
   * (non-Javadoc)
   * 
   * @see java.lang.Object#hashCode()
   */
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((body == null) ? 0 : body.hashCode());
    result = prime * result + ((date == null) ? 0 : date.hashCode());
    result = prime * result + ((id == null) ? 0 : id.hashCode());
    result = prime * result + ((titel == null) ? 0 : titel.hashCode());
    result = prime * result + ((userId == null) ? 0 : userId.hashCode());
    return result;
  }
  
  /*
   * (non-Javadoc)
   * 
   * @see java.lang.Object#equals(java.lang.Object)
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    BeitragDTO other = (BeitragDTO) obj;
    if (body == null) {
      if (other.body != null)
        return false;
    } else if (!body.equals(other.body))
      return false;
    if (date == null) {
      if (other.date != null)
        return false;
    } else if (!date.equals(other.date))
      return false;
    if (id == null) {
      if (other.id != null)
        return false;
    } else if (!id.equals(other.id))
      return false;
    if (titel == null) {
      if (other.titel != null)
        return false;
    } else if (!titel.equals(other.titel))
      return false;
    if (userId == null) {
      if (other.userId != null)
        return false;
    } else if (!userId.equals(other.userId))
      return false;
    return true;
  }
  
}
