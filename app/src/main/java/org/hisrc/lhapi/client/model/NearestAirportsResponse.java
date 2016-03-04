package org.hisrc.lhapi.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hisrc.lhapi.client.model.AirportResource;







public class NearestAirportsResponse   {
  
  private AirportResource nearestAirportResource = null;

  
  /**
   **/
  public NearestAirportsResponse nearestAirportResource(AirportResource nearestAirportResource) {
    this.nearestAirportResource = nearestAirportResource;
    return this;
  }
  
  @JsonProperty("NearestAirportResource")
  public AirportResource getNearestAirportResource() {
    return nearestAirportResource;
  }
  public void setNearestAirportResource(AirportResource nearestAirportResource) {
    this.nearestAirportResource = nearestAirportResource;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NearestAirportsResponse nearestAirportsResponse = (NearestAirportsResponse) o;
    return Objects.equals(this.nearestAirportResource, nearestAirportsResponse.nearestAirportResource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nearestAirportResource);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NearestAirportsResponse {\n");
    
    sb.append("    nearestAirportResource: ").append(toIndentedString(nearestAirportResource)).append("\n");
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



