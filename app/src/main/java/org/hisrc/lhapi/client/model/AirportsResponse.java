package org.hisrc.lhapi.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hisrc.lhapi.client.model.AirportResource;







public class AirportsResponse   {
  
  private AirportResource airportResource = null;

  
  /**
   **/
  public AirportsResponse airportResource(AirportResource airportResource) {
    this.airportResource = airportResource;
    return this;
  }
  
  @JsonProperty("AirportResource")
  public AirportResource getAirportResource() {
    return airportResource;
  }
  public void setAirportResource(AirportResource airportResource) {
    this.airportResource = airportResource;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AirportsResponse airportsResponse = (AirportsResponse) o;
    return Objects.equals(this.airportResource, airportsResponse.airportResource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(airportResource);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AirportsResponse {\n");
    
    sb.append("    airportResource: ").append(toIndentedString(airportResource)).append("\n");
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



