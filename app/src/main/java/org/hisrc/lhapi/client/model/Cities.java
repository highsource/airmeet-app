package org.hisrc.lhapi.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import org.hisrc.lhapi.client.model.City;







public class Cities   {
  
  private List<City> city = new ArrayList<City>();

  
  /**
   **/
  public Cities city(List<City> city) {
    this.city = city;
    return this;
  }
  
  @JsonProperty("City")
  public List<City> getCity() {
    return city;
  }
  public void setCity(List<City> city) {
    this.city = city;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cities cities = (Cities) o;
    return Objects.equals(this.city, cities.city);
  }

  @Override
  public int hashCode() {
    return Objects.hash(city);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cities {\n");
    
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
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



