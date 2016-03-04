package org.hisrc.lhapi.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hisrc.lhapi.client.model.AirlineResource;







public class AirlinesResponse   {
  
  private AirlineResource airlineResource = null;

  
  /**
   **/
  public AirlinesResponse airlineResource(AirlineResource airlineResource) {
    this.airlineResource = airlineResource;
    return this;
  }
  
  @JsonProperty("AirlineResource")
  public AirlineResource getAirlineResource() {
    return airlineResource;
  }
  public void setAirlineResource(AirlineResource airlineResource) {
    this.airlineResource = airlineResource;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AirlinesResponse airlinesResponse = (AirlinesResponse) o;
    return Objects.equals(this.airlineResource, airlinesResponse.airlineResource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(airlineResource);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AirlinesResponse {\n");
    
    sb.append("    airlineResource: ").append(toIndentedString(airlineResource)).append("\n");
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



