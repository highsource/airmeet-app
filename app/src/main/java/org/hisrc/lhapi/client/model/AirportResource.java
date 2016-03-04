package org.hisrc.lhapi.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hisrc.lhapi.client.model.Airports;







public class AirportResource   {
  
  private Airports airports = null;

  
  /**
   **/
  public AirportResource airports(Airports airports) {
    this.airports = airports;
    return this;
  }
  
  @JsonProperty("Airports")
  public Airports getAirports() {
    return airports;
  }
  public void setAirports(Airports airports) {
    this.airports = airports;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AirportResource airportResource = (AirportResource) o;
    return Objects.equals(this.airports, airportResource.airports);
  }

  @Override
  public int hashCode() {
    return Objects.hash(airports);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AirportResource {\n");
    
    sb.append("    airports: ").append(toIndentedString(airports)).append("\n");
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



