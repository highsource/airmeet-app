package org.hisrc.lhapi.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hisrc.lhapi.client.model.Names;







public class Country   {
  
  private String countryCode = null;
  private String zoneCode = null;
  private Names names = null;

  
  /**
   **/
  public Country countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }
  
  @JsonProperty("CountryCode")
  public String getCountryCode() {
    return countryCode;
  }
  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  
  /**
   **/
  public Country zoneCode(String zoneCode) {
    this.zoneCode = zoneCode;
    return this;
  }
  
  @JsonProperty("ZoneCode")
  public String getZoneCode() {
    return zoneCode;
  }
  public void setZoneCode(String zoneCode) {
    this.zoneCode = zoneCode;
  }

  
  /**
   **/
  public Country names(Names names) {
    this.names = names;
    return this;
  }
  
  @JsonProperty("Names")
  public Names getNames() {
    return names;
  }
  public void setNames(Names names) {
    this.names = names;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Country country = (Country) o;
    return Objects.equals(this.countryCode, country.countryCode) &&
        Objects.equals(this.zoneCode, country.zoneCode) &&
        Objects.equals(this.names, country.names);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countryCode, zoneCode, names);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Country {\n");
    
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    zoneCode: ").append(toIndentedString(zoneCode)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
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



