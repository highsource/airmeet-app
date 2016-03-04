package org.hisrc.lhapi.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hisrc.lhapi.client.model.Countries;







public class CountryResource   {
  
  private Countries countries = null;

  
  /**
   **/
  public CountryResource countries(Countries countries) {
    this.countries = countries;
    return this;
  }
  
  @JsonProperty("Countries")
  public Countries getCountries() {
    return countries;
  }
  public void setCountries(Countries countries) {
    this.countries = countries;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CountryResource countryResource = (CountryResource) o;
    return Objects.equals(this.countries, countryResource.countries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CountryResource {\n");
    
    sb.append("    countries: ").append(toIndentedString(countries)).append("\n");
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



