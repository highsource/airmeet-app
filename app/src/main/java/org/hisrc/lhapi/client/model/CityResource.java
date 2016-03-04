package org.hisrc.lhapi.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hisrc.lhapi.client.model.Cities;







public class CityResource   {
  
  private Cities cities = null;

  
  /**
   **/
  public CityResource cities(Cities cities) {
    this.cities = cities;
    return this;
  }
  
  @JsonProperty("Cities")
  public Cities getCities() {
    return cities;
  }
  public void setCities(Cities cities) {
    this.cities = cities;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CityResource cityResource = (CityResource) o;
    return Objects.equals(this.cities, cityResource.cities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CityResource {\n");
    
    sb.append("    cities: ").append(toIndentedString(cities)).append("\n");
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



