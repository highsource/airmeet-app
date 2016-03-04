package org.hisrc.lhapi.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.hisrc.lhapi.client.model.Distance;
import org.hisrc.lhapi.client.model.Names;
import org.hisrc.lhapi.client.model.Position;







public class Airport   {
  
  private String airportCode = null;
  private String cityCode = null;
  private String countryCode = null;
  private Position position = null;


  public enum LocationTypeEnum {
    AIRPORT("Airport"),
    RAILWAYSTATION("RailwayStation"),
    BUSSTATION("BusStation");

    private String value;

    LocationTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private LocationTypeEnum locationType = null;
  private Names names = null;
  private Distance distance = null;

  
  /**
   **/
  public Airport airportCode(String airportCode) {
    this.airportCode = airportCode;
    return this;
  }
  
  @JsonProperty("AirportCode")
  public String getAirportCode() {
    return airportCode;
  }
  public void setAirportCode(String airportCode) {
    this.airportCode = airportCode;
  }

  
  /**
   **/
  public Airport cityCode(String cityCode) {
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
  public Airport countryCode(String countryCode) {
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
  public Airport position(Position position) {
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
  public Airport locationType(LocationTypeEnum locationType) {
    this.locationType = locationType;
    return this;
  }
  
  @JsonProperty("LocationType")
  public LocationTypeEnum getLocationType() {
    return locationType;
  }
  public void setLocationType(LocationTypeEnum locationType) {
    this.locationType = locationType;
  }

  
  /**
   **/
  public Airport names(Names names) {
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
  public Airport distance(Distance distance) {
    this.distance = distance;
    return this;
  }
  
  @JsonProperty("Distance")
  public Distance getDistance() {
    return distance;
  }
  public void setDistance(Distance distance) {
    this.distance = distance;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Airport airport = (Airport) o;
    return Objects.equals(this.airportCode, airport.airportCode) &&
        Objects.equals(this.cityCode, airport.cityCode) &&
        Objects.equals(this.countryCode, airport.countryCode) &&
        Objects.equals(this.position, airport.position) &&
        Objects.equals(this.locationType, airport.locationType) &&
        Objects.equals(this.names, airport.names) &&
        Objects.equals(this.distance, airport.distance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(airportCode, cityCode, countryCode, position, locationType, names, distance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Airport {\n");
    
    sb.append("    airportCode: ").append(toIndentedString(airportCode)).append("\n");
    sb.append("    cityCode: ").append(toIndentedString(cityCode)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    locationType: ").append(toIndentedString(locationType)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
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



