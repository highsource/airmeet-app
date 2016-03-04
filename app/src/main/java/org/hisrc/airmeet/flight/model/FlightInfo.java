package org.hisrc.airmeet.flight.model;

import org.hisrc.airmeet.flightposition.model.FlightPosition;
import org.hisrc.lhapi.client.model.AircraftSummary;
import org.hisrc.lhapi.client.model.Airline;
import org.hisrc.lhapi.client.model.Airport;
import org.hisrc.lhapi.client.model.City;
import org.hisrc.lhapi.client.model.Country;
import org.hisrc.lhapi.client.model.Flight;

public class FlightInfo {

	private Flight flight;
	private Country departureCountry;
	private City departureCity;
	private Airport departureAirport;
	private Country arrivalCountry;
	private City arrivalCity;
	private Airport arrivalAirport;
	private Airline marketingAirline;
	private Airline operatingAirline;
	private AircraftSummary aircraftSummary;
	private FlightPosition flightPosition;

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	public Country getDepartureCountry() {
		return departureCountry;
	}

	public void setDepartureCountry(Country departureCountry) {
		this.departureCountry = departureCountry;
	}

	public City getDepartureCity() {
		return departureCity;
	}

	public void setDepartureCity(City departureCity) {
		this.departureCity = departureCity;
	}

	public Airport getDepartureAirport() {
		return departureAirport;
	}

	public void setDepartureAirport(Airport departureAirport) {
		this.departureAirport = departureAirport;
	}

	public Country getArrivalCountry() {
		return arrivalCountry;
	}

	public void setArrivalCountry(Country arrivalCountry) {
		this.arrivalCountry = arrivalCountry;
	}

	public City getArrivalCity() {
		return arrivalCity;
	}

	public void setArrivalCity(City arrivalCity) {
		this.arrivalCity = arrivalCity;
	}

	public Airport getArrivalAirport() {
		return arrivalAirport;
	}

	public void setArrivalAirport(Airport arrivalAirport) {
		this.arrivalAirport = arrivalAirport;
	}

	public Airline getMarketingAirline() {
		return marketingAirline;
	}

	public void setMarketingAirline(Airline marketingAirline) {
		this.marketingAirline = marketingAirline;
	}

	public Airline getOperatingAirline() {
		return operatingAirline;
	}

	public void setOperatingAirline(Airline operationAirline) {
		this.operatingAirline = operationAirline;
	}

	public AircraftSummary getAircraftSummary() {
		return aircraftSummary;
	}

	public void setAircraftSummary(AircraftSummary aircraftSummary) {
		this.aircraftSummary = aircraftSummary;
	}

	public FlightPosition getFlightPosition() {
		return flightPosition;
	}

	public void setFlightPosition(FlightPosition flightPosition) {
		this.flightPosition = flightPosition;
	}
}
