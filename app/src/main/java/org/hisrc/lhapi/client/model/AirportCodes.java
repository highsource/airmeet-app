package org.hisrc.lhapi.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;







public class AirportCodes   {
  
  private List<String> airportCode = new ArrayList<String>();

  
  /**
   **/
  public AirportCodes airportCode(List<String> airportCode) {
    this.airportCode = airportCode;
    return this;
  }
  
  @JsonProperty("AirportCode")
  public List<String> getAirportCode() {
    return airportCode;
  }
  public void setAirportCode(List<String> airportCode) {
    this.airportCode = airportCode;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AirportCodes airportCodes = (AirportCodes) o;
    return Objects.equals(this.airportCode, airportCodes.airportCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(airportCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AirportCodes {\n");
    
    sb.append("    airportCode: ").append(toIndentedString(airportCode)).append("\n");
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



