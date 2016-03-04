package org.hisrc.airmeet.flight.model;

import org.hisrc.airmeet.flightposition.model.FlightPositionType;
import org.hisrc.lhapi.client.model.DepartureOrArrival;
import org.hisrc.lhapi.client.model.Flight;
import org.hisrc.lhapi.client.model.FlightStatus;
import org.hisrc.lhapi.client.model.TimeStatus;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;

public class FlightInfoSummary {

	private String flightNumber;
	private LocalDate departureDate;
	private FlightStatus.CodeEnum flightStatus;

	private String departureAirportCode;
	private String departureCity;
	private LocalDateTime std;
	private LocalDateTime atd;
	private LocalDateTime etd;
	private TimeStatus.CodeEnum tsd;

	private String arrivalAirportCode;
	private String arrivalCity;
	private LocalDateTime sta;
	private LocalDateTime ata;
	private LocalDateTime eta;
	private TimeStatus.CodeEnum tsa;

	private Double longitude;
	private Double latitude;
	private Boolean isOnGround;
	private Double heading;
	private FlightPositionType flightPositionType;

	public FlightInfoSummary(FlightInfo flightInfo) {
		final Flight flight = flightInfo.getFlight();
		final FlightId flightId = new FlightId(flight);
		setFlightNumber(flightId.getFlightNumber());
		setDepartureDate(flightId.getDepartureDate());
		if (flight.getFlightStatus() != null) {
			setFlightStatus(flight.getFlightStatus().getCode());
		}

		if (flight.getDeparture() != null) {
			final DepartureOrArrival departure = flight.getDeparture();
			setDepartureAirportCode(departure.getAirportCode());
			if (departure.getActualTimeLocal() != null) {
				setAtd(departure.getActualTimeLocal().getDateTime());
			}
			if (departure.getEstimatedTimeLocal() != null) {
				setEtd(departure.getEstimatedTimeLocal().getDateTime());
			}
			if (departure.getScheduledTimeLocal() != null) {
				setStd(departure.getScheduledTimeLocal().getDateTime());
			}
			if (departure.getTimeStatus() != null) {
				setTsd(departure.getTimeStatus().getCode());
			}
		}
		if (flightInfo.getDepartureCity() != null && flightInfo.getDepartureCity().getNames() != null
				&& flightInfo.getDepartureCity().getNames().getName() != null) {
			setDepartureCity(flightInfo.getDepartureCity().getNames().getName().getValue());
		}

		if (flight.getArrival() != null) {
			final DepartureOrArrival arrival = flight.getArrival();
			setArrivalAirportCode(arrival.getAirportCode());
			if (arrival.getActualTimeLocal() != null) {
				setAta(arrival.getActualTimeLocal().getDateTime());
			}
			if (arrival.getEstimatedTimeLocal() != null) {
				setEta(arrival.getEstimatedTimeLocal().getDateTime());
			}
			if (arrival.getScheduledTimeLocal() != null) {
				setSta(arrival.getScheduledTimeLocal().getDateTime());
			}
			if (arrival.getTimeStatus() != null) {
				setTsd(arrival.getTimeStatus().getCode());
			}
		}
		if (flightInfo.getArrivalCity() != null && flightInfo.getArrivalCity().getNames() != null
				&& flightInfo.getArrivalCity().getNames().getName() != null) {
			setArrivalCity(flightInfo.getArrivalCity().getNames().getName().getValue());
		}
		if (flightInfo.getFlightPosition() != null) {
			setLongitude(flightInfo.getFlightPosition().getLongitude());
			setLatitude(flightInfo.getFlightPosition().getLatitude());
			setHeading(flightInfo.getFlightPosition().getHeading());
			setIsOnGround(flightInfo.getFlightPosition().getIsOnGround());
			setFlightPositionType(flightInfo.getFlightPosition().getFlightPositionType());
		}
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public LocalDate getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(LocalDate departureDate) {
		this.departureDate = departureDate;
	}

	public String getDepartureAirportCode() {
		return departureAirportCode;
	}

	public void setDepartureAirportCode(String departureAirportCode) {
		this.departureAirportCode = departureAirportCode;
	}

	public String getDepartureCity() {
		return departureCity;
	}

	public void setDepartureCity(String departureCity) {
		this.departureCity = departureCity;
	}

	public LocalDateTime getStd() {
		return std;
	}

	public void setStd(LocalDateTime std) {
		this.std = std;
	}

	public LocalDateTime getAtd() {
		return atd;
	}

	public void setAtd(LocalDateTime atd) {
		this.atd = atd;
	}

	public LocalDateTime getEtd() {
		return etd;
	}

	public void setEtd(LocalDateTime etd) {
		this.etd = etd;
	}

	public String getArrivalAirportCode() {
		return arrivalAirportCode;
	}

	public void setArrivalAirportCode(String arrivalAirportCode) {
		this.arrivalAirportCode = arrivalAirportCode;
	}

	public String getArrivalCity() {
		return arrivalCity;
	}

	public void setArrivalCity(String arrivalCity) {
		this.arrivalCity = arrivalCity;
	}

	public LocalDateTime getSta() {
		return sta;
	}

	public void setSta(LocalDateTime sta) {
		this.sta = sta;
	}

	public LocalDateTime getAta() {
		return ata;
	}

	public void setAta(LocalDateTime ata) {
		this.ata = ata;
	}

	public LocalDateTime getEta() {
		return eta;
	}

	public void setEta(LocalDateTime eta) {
		this.eta = eta;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Boolean getIsOnGround() {
		return isOnGround;
	}

	public void setIsOnGround(Boolean isOnGround) {
		this.isOnGround = isOnGround;
	}

	public Double getHeading() {
		return heading;
	}

	public void setHeading(Double heading) {
		this.heading = heading;
	}

	public FlightPositionType getFlightPositionType() {
		return flightPositionType;
	}

	public void setFlightPositionType(FlightPositionType flightPositionType) {
		this.flightPositionType = flightPositionType;
	}

	public FlightStatus.CodeEnum getFlightStatus() {
		return flightStatus;
	}

	public void setFlightStatus(FlightStatus.CodeEnum flightStatus) {
		this.flightStatus = flightStatus;
	}

	public TimeStatus.CodeEnum getTsd() {
		return tsd;
	}

	public void setTsd(TimeStatus.CodeEnum tsd) {
		this.tsd = tsd;
	}

	public TimeStatus.CodeEnum getTsa() {
		return tsa;
	}

	public void setTsa(TimeStatus.CodeEnum tsa) {
		this.tsa = tsa;
	}

}
