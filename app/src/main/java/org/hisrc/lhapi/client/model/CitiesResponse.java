package org.hisrc.lhapi.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hisrc.lhapi.client.model.CityResource;







public class CitiesResponse   {
  
  private CityResource cityResource = null;

  
  /**
   **/
  public CitiesResponse cityResource(CityResource cityResource) {
    this.cityResource = cityResource;
    return this;
  }
  
  @JsonProperty("CityResource")
  public CityResource getCityResource() {
    return cityResource;
  }
  public void setCityResource(CityResource cityResource) {
    this.cityResource = cityResource;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CitiesResponse citiesResponse = (CitiesResponse) o;
    return Objects.equals(this.cityResource, citiesResponse.cityResource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cityResource);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CitiesResponse {\n");
    
    sb.append("    cityResource: ").append(toIndentedString(cityResource)).append("\n");
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



