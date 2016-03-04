package org.hisrc.lhapi.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hisrc.lhapi.client.model.Names;
import org.hisrc.lhapi.client.model.OtherIDs;







public class Airline   {
  
  private OtherIDs otherIDs = null;
  private String airlineID = null;
  private String airlineIDICAO = null;
  private Names names = null;

  
  /**
   **/
  public Airline otherIDs(OtherIDs otherIDs) {
    this.otherIDs = otherIDs;
    return this;
  }
  
  @JsonProperty("OtherIDs")
  public OtherIDs getOtherIDs() {
    return otherIDs;
  }
  public void setOtherIDs(OtherIDs otherIDs) {
    this.otherIDs = otherIDs;
  }

  
  /**
   **/
  public Airline airlineID(String airlineID) {
    this.airlineID = airlineID;
    return this;
  }
  
  @JsonProperty("AirlineID")
  public String getAirlineID() {
    return airlineID;
  }
  public void setAirlineID(String airlineID) {
    this.airlineID = airlineID;
  }

  
  /**
   **/
  public Airline airlineIDICAO(String airlineIDICAO) {
    this.airlineIDICAO = airlineIDICAO;
    return this;
  }
  
  @JsonProperty("AirlineID_ICAO")
  public String getAirlineIDICAO() {
    return airlineIDICAO;
  }
  public void setAirlineIDICAO(String airlineIDICAO) {
    this.airlineIDICAO = airlineIDICAO;
  }

  
  /**
   **/
  public Airline names(Names names) {
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

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Airline airline = (Airline) o;
    return Objects.equals(this.otherIDs, airline.otherIDs) &&
        Objects.equals(this.airlineID, airline.airlineID) &&
        Objects.equals(this.airlineIDICAO, airline.airlineIDICAO) &&
        Objects.equals(this.names, airline.names);
  }

  @Override
  public int hashCode() {
    return Objects.hash(otherIDs, airlineID, airlineIDICAO, names);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Airline {\n");
    
    sb.append("    otherIDs: ").append(toIndentedString(otherIDs)).append("\n");
    sb.append("    airlineID: ").append(toIndentedString(airlineID)).append("\n");
    sb.append("    airlineIDICAO: ").append(toIndentedString(airlineIDICAO)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
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



