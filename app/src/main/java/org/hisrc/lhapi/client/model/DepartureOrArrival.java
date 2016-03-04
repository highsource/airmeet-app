package org.hisrc.lhapi.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hisrc.lhapi.client.model.DateTimeObject;
import org.hisrc.lhapi.client.model.LocalDateTimeObject;
import org.hisrc.lhapi.client.model.Terminal;
import org.hisrc.lhapi.client.model.TimeStatus;







public class DepartureOrArrival   {
  
  private String airportCode = null;
  private LocalDateTimeObject scheduledTimeLocal = null;
  private DateTimeObject scheduledTimeUTC = null;
  private LocalDateTimeObject actualTimeLocal = null;
  private DateTimeObject actualTimeUTC = null;
  private LocalDateTimeObject estimatedTimeLocal = null;
  private DateTimeObject estimatedTimeUTC = null;
  private TimeStatus timeStatus = null;
  private Terminal terminal = null;

  
  /**
   **/
  public DepartureOrArrival airportCode(String airportCode) {
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
  public DepartureOrArrival scheduledTimeLocal(LocalDateTimeObject scheduledTimeLocal) {
    this.scheduledTimeLocal = scheduledTimeLocal;
    return this;
  }
  
  @JsonProperty("ScheduledTimeLocal")
  public LocalDateTimeObject getScheduledTimeLocal() {
    return scheduledTimeLocal;
  }
  public void setScheduledTimeLocal(LocalDateTimeObject scheduledTimeLocal) {
    this.scheduledTimeLocal = scheduledTimeLocal;
  }

  
  /**
   **/
  public DepartureOrArrival scheduledTimeUTC(DateTimeObject scheduledTimeUTC) {
    this.scheduledTimeUTC = scheduledTimeUTC;
    return this;
  }
  
  @JsonProperty("ScheduledTimeUTC")
  public DateTimeObject getScheduledTimeUTC() {
    return scheduledTimeUTC;
  }
  public void setScheduledTimeUTC(DateTimeObject scheduledTimeUTC) {
    this.scheduledTimeUTC = scheduledTimeUTC;
  }

  
  /**
   **/
  public DepartureOrArrival actualTimeLocal(LocalDateTimeObject actualTimeLocal) {
    this.actualTimeLocal = actualTimeLocal;
    return this;
  }
  
  @JsonProperty("ActualTimeLocal")
  public LocalDateTimeObject getActualTimeLocal() {
    return actualTimeLocal;
  }
  public void setActualTimeLocal(LocalDateTimeObject actualTimeLocal) {
    this.actualTimeLocal = actualTimeLocal;
  }

  
  /**
   **/
  public DepartureOrArrival actualTimeUTC(DateTimeObject actualTimeUTC) {
    this.actualTimeUTC = actualTimeUTC;
    return this;
  }
  
  @JsonProperty("ActualTimeUTC")
  public DateTimeObject getActualTimeUTC() {
    return actualTimeUTC;
  }
  public void setActualTimeUTC(DateTimeObject actualTimeUTC) {
    this.actualTimeUTC = actualTimeUTC;
  }

  
  /**
   **/
  public DepartureOrArrival estimatedTimeLocal(LocalDateTimeObject estimatedTimeLocal) {
    this.estimatedTimeLocal = estimatedTimeLocal;
    return this;
  }
  
  @JsonProperty("EstimatedTimeLocal")
  public LocalDateTimeObject getEstimatedTimeLocal() {
    return estimatedTimeLocal;
  }
  public void setEstimatedTimeLocal(LocalDateTimeObject estimatedTimeLocal) {
    this.estimatedTimeLocal = estimatedTimeLocal;
  }

  
  /**
   **/
  public DepartureOrArrival estimatedTimeUTC(DateTimeObject estimatedTimeUTC) {
    this.estimatedTimeUTC = estimatedTimeUTC;
    return this;
  }
  
  @JsonProperty("EstimatedTimeUTC")
  public DateTimeObject getEstimatedTimeUTC() {
    return estimatedTimeUTC;
  }
  public void setEstimatedTimeUTC(DateTimeObject estimatedTimeUTC) {
    this.estimatedTimeUTC = estimatedTimeUTC;
  }

  
  /**
   **/
  public DepartureOrArrival timeStatus(TimeStatus timeStatus) {
    this.timeStatus = timeStatus;
    return this;
  }
  
  @JsonProperty("TimeStatus")
  public TimeStatus getTimeStatus() {
    return timeStatus;
  }
  public void setTimeStatus(TimeStatus timeStatus) {
    this.timeStatus = timeStatus;
  }

  
  /**
   **/
  public DepartureOrArrival terminal(Terminal terminal) {
    this.terminal = terminal;
    return this;
  }
  
  @JsonProperty("Terminal")
  public Terminal getTerminal() {
    return terminal;
  }
  public void setTerminal(Terminal terminal) {
    this.terminal = terminal;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DepartureOrArrival departureOrArrival = (DepartureOrArrival) o;
    return Objects.equals(this.airportCode, departureOrArrival.airportCode) &&
        Objects.equals(this.scheduledTimeLocal, departureOrArrival.scheduledTimeLocal) &&
        Objects.equals(this.scheduledTimeUTC, departureOrArrival.scheduledTimeUTC) &&
        Objects.equals(this.actualTimeLocal, departureOrArrival.actualTimeLocal) &&
        Objects.equals(this.actualTimeUTC, departureOrArrival.actualTimeUTC) &&
        Objects.equals(this.estimatedTimeLocal, departureOrArrival.estimatedTimeLocal) &&
        Objects.equals(this.estimatedTimeUTC, departureOrArrival.estimatedTimeUTC) &&
        Objects.equals(this.timeStatus, departureOrArrival.timeStatus) &&
        Objects.equals(this.terminal, departureOrArrival.terminal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(airportCode, scheduledTimeLocal, scheduledTimeUTC, actualTimeLocal, actualTimeUTC, estimatedTimeLocal, estimatedTimeUTC, timeStatus, terminal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepartureOrArrival {\n");
    
    sb.append("    airportCode: ").append(toIndentedString(airportCode)).append("\n");
    sb.append("    scheduledTimeLocal: ").append(toIndentedString(scheduledTimeLocal)).append("\n");
    sb.append("    scheduledTimeUTC: ").append(toIndentedString(scheduledTimeUTC)).append("\n");
    sb.append("    actualTimeLocal: ").append(toIndentedString(actualTimeLocal)).append("\n");
    sb.append("    actualTimeUTC: ").append(toIndentedString(actualTimeUTC)).append("\n");
    sb.append("    estimatedTimeLocal: ").append(toIndentedString(estimatedTimeLocal)).append("\n");
    sb.append("    estimatedTimeUTC: ").append(toIndentedString(estimatedTimeUTC)).append("\n");
    sb.append("    timeStatus: ").append(toIndentedString(timeStatus)).append("\n");
    sb.append("    terminal: ").append(toIndentedString(terminal)).append("\n");
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



