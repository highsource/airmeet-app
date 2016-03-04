package org.hisrc.airmeet.flight.model;

import java.io.Serializable;

import org.hisrc.airmeet.time.format.DateTimeFormatConstants;
import org.hisrc.lhapi.client.model.Flight;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class FlightId implements Serializable {

	private static final long serialVersionUID = 8160035310969338422L;
	private final String flightNumber;
	private final LocalDate departureDate;
	private final String departureDateAsString;

	public FlightId(Flight flight) {
		final LocalDateTime dateTime = flight.getDeparture().getScheduledTimeLocal().getDateTime();
		this.departureDate = dateTime.toLocalDate();
		this.departureDateAsString = DateTimeFormatConstants.DATE_FORMATTER.print(this.departureDate);
		this.flightNumber = String.format("%s%d", flight.getMarketingCarrier().getAirlineID(),
				flight.getMarketingCarrier().getFlightNumber());
	}

	public FlightId(String flightNumber, LocalDate departureDate) {
		this.flightNumber = flightNumber;
		this.departureDate = departureDate;
		this.departureDateAsString = DateTimeFormatConstants.DATE_FORMATTER.print(this.departureDate);
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public LocalDate getDepartureDate() {
		return departureDate;
	}

	@JsonIgnore
	public String getDepartureDateAsString() {
		return departureDateAsString;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((departureDate == null) ? 0 : departureDate.hashCode());
		result = prime * result + ((flightNumber == null) ? 0 : flightNumber.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		FlightId other = (FlightId) obj;
		if (departureDate == null) {
			if (other.departureDate != null) {
				return false;
			}
		} else if (!departureDate.equals(other.departureDate)) {
			return false;
		}
		if (flightNumber == null) {
			if (other.flightNumber != null) {
				return false;
			}
		} else if (!flightNumber.equals(other.flightNumber)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return String.format("%s-%s", flightNumber, DateTimeFormatConstants.DATE_FORMATTER.print(departureDate));
	}
}
