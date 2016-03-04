package org.hisrc.lhapi.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import org.hisrc.lhapi.client.model.Airport;







public class Airports   {
  
  private List<Airport> airport = new ArrayList<Airport>();

  
  /**
   **/
  public Airports airport(List<Airport> airport) {
    this.airport = airport;
    return this;
  }
  
  @JsonProperty("Airport")
  public List<Airport> getAirport() {
    return airport;
  }
  public void setAirport(List<Airport> airport) {
    this.airport = airport;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Airports airports = (Airports) o;
    return Objects.equals(this.airport, airports.airport);
  }

  @Override
  public int hashCode() {
    return Objects.hash(airport);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Airports {\n");
    
    sb.append("    airport: ").append(toIndentedString(airport)).append("\n");
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



