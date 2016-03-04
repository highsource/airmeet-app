package org.hisrc.lhapi.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;







public class Carrier   {
  
  private String airlineID = null;
  private Integer flightNumber = null;

  
  /**
   **/
  public Carrier airlineID(String airlineID) {
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
  public Carrier flightNumber(Integer flightNumber) {
    this.flightNumber = flightNumber;
    return this;
  }
  
  @JsonProperty("FlightNumber")
  public Integer getFlightNumber() {
    return flightNumber;
  }
  public void setFlightNumber(Integer flightNumber) {
    this.flightNumber = flightNumber;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Carrier carrier = (Carrier) o;
    return Objects.equals(this.airlineID, carrier.airlineID) &&
        Objects.equals(this.flightNumber, carrier.flightNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(airlineID, flightNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Carrier {\n");
    
    sb.append("    airlineID: ").append(toIndentedString(airlineID)).append("\n");
    sb.append("    flightNumber: ").append(toIndentedString(flightNumber)).append("\n");
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



