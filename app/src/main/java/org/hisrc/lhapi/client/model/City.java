package org.hisrc.lhapi.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hisrc.lhapi.client.model.AirportCodes;
import org.hisrc.lhapi.client.model.Names;
import org.hisrc.lhapi.client.model.Position;







public class City   {
  
  private String cityCode = null;
  private String countryCode = null;
  private Position position = null;
  private Names names = null;
  private AirportCodes airports = null;

  
  /**
   **/
  public City cityCode(String cityCode) {
    this.cityCode = cityCode;
    return this;
  }
  
  
  @JsonProperty("CityCode")
  public String getCityCode() {
    return cityCode;
  }
  public void setCityCode(String cityCode) {
    this.cityCode = cityCode;
  }

  
  /**
   **/
  public City countryCode(String countryCode) {
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
  public City position(Position position) {
    this.position = position;
    return this;
  }
  
  @JsonProperty("Position")
  public Position getPosition() {
    return position;
  }
  public void setPosition(Position position) {
    this.position = position;
  }

  
  /**
   **/
  public City names(Names names) {
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

  
  /**
   **/
  public City airports(AirportCodes airports) {
    this.airports = airports;
    return this;
  }
  
  @JsonProperty("Airports")
  public AirportCodes getAirports() {
    return airports;
  }
  public void setAirports(AirportCodes airports) {
    this.airports = airports;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    City city = (City) o;
    return Objects.equals(this.cityCode, city.cityCode) &&
        Objects.equals(this.countryCode, city.countryCode) &&
        Objects.equals(this.position, city.position) &&
        Objects.equals(this.names, city.names) &&
        Objects.equals(this.airports, city.airports);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cityCode, countryCode, position, names, airports);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class City {\n");
    
    sb.append("    cityCode: ").append(toIndentedString(cityCode)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    airports: ").append(toIndentedString(airports)).append("\n");
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



