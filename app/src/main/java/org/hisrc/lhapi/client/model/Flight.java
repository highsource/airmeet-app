package org.hisrc.lhapi.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hisrc.lhapi.client.model.Carrier;
import org.hisrc.lhapi.client.model.DepartureOrArrival;
import org.hisrc.lhapi.client.model.Equipment;
import org.hisrc.lhapi.client.model.FlightStatus;




public class Flight   {
  
  private DepartureOrArrival departure = null;
  private DepartureOrArrival arrival = null;
  private Carrier marketingCarrier = null;
  private Carrier operatingCarrier = null;
  private Equipment equipment = null;
  private FlightStatus flightStatus = null;

  
  /**
   **/
  public Flight departure(DepartureOrArrival departure) {
    this.departure = departure;
    return this;
  }
  
  @JsonProperty("Departure")
  public DepartureOrArrival getDeparture() {
    return departure;
  }
  public void setDeparture(DepartureOrArrival departure) {
    this.departure = departure;
  }

  
  /**
   **/
  public Flight arrival(DepartureOrArrival arrival) {
    this.arrival = arrival;
    return this;
  }
  
  @JsonProperty("Arrival")
  public DepartureOrArrival getArrival() {
    return arrival;
  }
  public void setArrival(DepartureOrArrival arrival) {
    this.arrival = arrival;
  }

  
  /**
   **/
  public Flight marketingCarrier(Carrier marketingCarrier) {
    this.marketingCarrier = marketingCarrier;
    return this;
  }
  
  @JsonProperty("MarketingCarrier")
  public Carrier getMarketingCarrier() {
    return marketingCarrier;
  }
  public void setMarketingCarrier(Carrier marketingCarrier) {
    this.marketingCarrier = marketingCarrier;
  }

  
  /**
   **/
  public Flight operatingCarrier(Carrier operatingCarrier) {
    this.operatingCarrier = operatingCarrier;
    return this;
  }
  
  @JsonProperty("OperatingCarrier")
  public Carrier getOperatingCarrier() {
    return operatingCarrier;
  }
  public void setOperatingCarrier(Carrier operatingCarrier) {
    this.operatingCarrier = operatingCarrier;
  }

  
  /**
   **/
  public Flight equipment(Equipment equipment) {
    this.equipment = equipment;
    return this;
  }
  
  @JsonProperty("Equipment")
  public Equipment getEquipment() {
    return equipment;
  }
  public void setEquipment(Equipment equipment) {
    this.equipment = equipment;
  }

  
  /**
   **/
  public Flight flightStatus(FlightStatus flightStatus) {
    this.flightStatus = flightStatus;
    return this;
  }
  
  @JsonProperty("FlightStatus")
  public FlightStatus getFlightStatus() {
    return flightStatus;
  }
  public void setFlightStatus(FlightStatus flightStatus) {
    this.flightStatus = flightStatus;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Flight flight = (Flight) o;
    return Objects.equals(this.departure, flight.departure) &&
        Objects.equals(this.arrival, flight.arrival) &&
        Objects.equals(this.marketingCarrier, flight.marketingCarrier) &&
        Objects.equals(this.operatingCarrier, flight.operatingCarrier) &&
        Objects.equals(this.equipment, flight.equipment) &&
        Objects.equals(this.flightStatus, flight.flightStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(departure, arrival, marketingCarrier, operatingCarrier, equipment, flightStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Flight {\n");
    
    sb.append("    departure: ").append(toIndentedString(departure)).append("\n");
    sb.append("    arrival: ").append(toIndentedString(arrival)).append("\n");
    sb.append("    marketingCarrier: ").append(toIndentedString(marketingCarrier)).append("\n");
    sb.append("    operatingCarrier: ").append(toIndentedString(operatingCarrier)).append("\n");
    sb.append("    equipment: ").append(toIndentedString(equipment)).append("\n");
    sb.append("    flightStatus: ").append(toIndentedString(flightStatus)).append("\n");
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



