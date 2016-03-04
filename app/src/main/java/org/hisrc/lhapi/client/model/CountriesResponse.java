package org.hisrc.lhapi.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hisrc.lhapi.client.model.CountryResource;







public class CountriesResponse   {
  
  private CountryResource countryResource = null;

  
  /**
   **/
  public CountriesResponse countryResource(CountryResource countryResource) {
    this.countryResource = countryResource;
    return this;
  }
  
  @JsonProperty("CountryResource")
  public CountryResource getCountryResource() {
    return countryResource;
  }
  public void setCountryResource(CountryResource countryResource) {
    this.countryResource = countryResource;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CountriesResponse countriesResponse = (CountriesResponse) o;
    return Objects.equals(this.countryResource, countriesResponse.countryResource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countryResource);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CountriesResponse {\n");
    
    sb.append("    countryResource: ").append(toIndentedString(countryResource)).append("\n");
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



