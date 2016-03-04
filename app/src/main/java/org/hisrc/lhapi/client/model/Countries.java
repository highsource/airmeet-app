package org.hisrc.lhapi.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import org.hisrc.lhapi.client.model.Country;







public class Countries   {
  
  private List<Country> country = new ArrayList<Country>();

  
  /**
   **/
  public Countries country(List<Country> country) {
    this.country = country;
    return this;
  }
  
  @JsonProperty("Country")
  public List<Country> getCountry() {
    return country;
  }
  public void setCountry(List<Country> country) {
    this.country = country;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Countries countries = (Countries) o;
    return Objects.equals(this.country, countries.country);
  }

  @Override
  public int hashCode() {
    return Objects.hash(country);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Countries {\n");
    
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
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



