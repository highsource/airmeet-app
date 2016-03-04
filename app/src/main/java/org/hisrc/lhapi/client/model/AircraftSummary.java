package org.hisrc.lhapi.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hisrc.lhapi.client.model.Comments;
import org.hisrc.lhapi.client.model.MediaLinks;
import org.hisrc.lhapi.client.model.Names;







public class AircraftSummary   {
  
  private Names names = null;
  private String aircraftCode = null;
  private String airlineEquipCode = null;
  private MediaLinks mediaLinks = null;
  private Comments comments = null;

  
  /**
   **/
  public AircraftSummary names(Names names) {
    this.names = names;
    return this;
  }
  
  @JsonProperty("Names")
  public Names getNames() {
    return names;
  }
  public void setNames(Names names) {
    this.names = names;
  }

  
  /**
   **/
  public AircraftSummary aircraftCode(String aircraftCode) {
    this.aircraftCode = aircraftCode;
    return this;
  }
  
  @JsonProperty("AircraftCode")
  public String getAircraftCode() {
    return aircraftCode;
  }
  public void setAircraftCode(String aircraftCode) {
    this.aircraftCode = aircraftCode;
  }

  
  /**
   **/
  public AircraftSummary airlineEquipCode(String airlineEquipCode) {
    this.airlineEquipCode = airlineEquipCode;
    return this;
  }
  
  @JsonProperty("AirlineEquipCode")
  public String getAirlineEquipCode() {
    return airlineEquipCode;
  }
  public void setAirlineEquipCode(String airlineEquipCode) {
    this.airlineEquipCode = airlineEquipCode;
  }

  
  /**
   **/
  public AircraftSummary mediaLinks(MediaLinks mediaLinks) {
    this.mediaLinks = mediaLinks;
    return this;
  }
  
  @JsonProperty("MediaLinks")
  public MediaLinks getMediaLinks() {
    return mediaLinks;
  }
  public void setMediaLinks(MediaLinks mediaLinks) {
    this.mediaLinks = mediaLinks;
  }

  
  /**
   **/
  public AircraftSummary comments(Comments comments) {
    this.comments = comments;
    return this;
  }
  
  @JsonProperty("Comments")
  public Comments getComments() {
    return comments;
  }
  public void setComments(Comments comments) {
    this.comments = comments;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AircraftSummary aircraftSummary = (AircraftSummary) o;
    return Objects.equals(this.names, aircraftSummary.names) &&
        Objects.equals(this.aircraftCode, aircraftSummary.aircraftCode) &&
        Objects.equals(this.airlineEquipCode, aircraftSummary.airlineEquipCode) &&
        Objects.equals(this.mediaLinks, aircraftSummary.mediaLinks) &&
        Objects.equals(this.comments, aircraftSummary.comments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(names, aircraftCode, airlineEquipCode, mediaLinks, comments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AircraftSummary {\n");
    
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    aircraftCode: ").append(toIndentedString(aircraftCode)).append("\n");
    sb.append("    airlineEquipCode: ").append(toIndentedString(airlineEquipCode)).append("\n");
    sb.append("    mediaLinks: ").append(toIndentedString(mediaLinks)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}



