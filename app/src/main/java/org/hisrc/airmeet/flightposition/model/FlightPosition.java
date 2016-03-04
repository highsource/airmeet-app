package org.hisrc.airmeet.flightposition.model;

import java.util.Objects;

import org.hisrc.airmeet.flight.model.FlightId;
import org.joda.time.LocalDate;

public class FlightPosition {

	private String flightNumber;
	private LocalDate departureDate;
	private String icao24 = null;
	private String callsign = null;
	private String originCountry = null;
	private Long lastPositionUpdate = null;
	private Long lastVelocityUpdate = null;
	private Double latitude = null;
	private Double longitude = null;
	private Double altitude = null;
	private Boolean isOnGround = null;
	private Double velocity = null;
	private Double heading = null;
	private Double verticalRate = null;
	private FlightPositionType flightPositionType = FlightPositionType.UNKNOWN;

	public FlightPosition() {
	}

	/*public FlightPosition(FlightId flightId, State state) {
		setFlightNumber(flightId.getFlightNumber());
		setDepartureDate(flightId.getDepartureDate());
		setIcao24(state.getIcao24());
		setCallsign(state.getCallsign());
		setOriginCountry(state.getOriginCountry());
		final Long lastPositionUpdate = state.getLastPositionUpdate();
		setLastPositionUpdate(lastPositionUpdate == null ? null : lastPositionUpdate.longValue() * 1000);
		final Long lastVelocityUpdate = state.getLastVelocityUpdate();
		setLastVelocityUpdate(lastVelocityUpdate == null ? null : lastVelocityUpdate.longValue() * 1000);
		setLatitude(state.getLatitude());
		setLongitude(state.getLongitude());
		setAltitude(state.getAltitude());
		setIsOnGround(state.getIsOnGround());
		setVelocity(state.getVelocity());
		setHeading(state.getHeading());
		setVerticalRate(state.getVerticalRate());
		setFlightPositionType(FlightPositionType.ACTUAL);
	}*/

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

	public String getIcao24() {
		return icao24;
	}

	public void setIcao24(String icao24) {
		this.icao24 = icao24;
	}

	public String getCallsign() {
		return callsign;
	}

	public void setCallsign(String callsign) {
		this.callsign = callsign;
	}

	public String getOriginCountry() {
		return originCountry;
	}

	public void setOriginCountry(String originCountry) {
		this.originCountry = originCountry;
	}

	public Long getLastPositionUpdate() {
		return lastPositionUpdate;
	}

	public void setLastPositionUpdate(Long lastPositionUpdate) {
		this.lastPositionUpdate = lastPositionUpdate;
	}

	public Long getLastVelocityUpdate() {
		return lastVelocityUpdate;
	}

	public void setLastVelocityUpdate(Long lastVelocityUpdate) {
		this.lastVelocityUpdate = lastVelocityUpdate;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Double getAltitude() {
		return altitude;
	}

	public void setAltitude(Double altitude) {
		this.altitude = altitude;
	}

	public Boolean getIsOnGround() {
		return isOnGround;
	}

	public void setIsOnGround(Boolean isOnGround) {
		this.isOnGround = isOnGround;
	}

	public Double getVelocity() {
		return velocity;
	}

	public void setVelocity(Double velocity) {
		this.velocity = velocity;
	}

	public Double getHeading() {
		return heading;
	}

	public void setHeading(Double heading) {
		this.heading = heading;
	}

	public Double getVerticalRate() {
		return verticalRate;
	}

	public void setVerticalRate(Double verticalRate) {
		this.verticalRate = verticalRate;
	}

	public FlightPositionType getFlightPositionType() {
		return flightPositionType;
	}

	public void setFlightPositionType(FlightPositionType flightPositionType) {
		this.flightPositionType = flightPositionType;
	}

	@Override
	public int hashCode() {
		return Objects.hash(icao24, callsign, originCountry, lastPositionUpdate, lastVelocityUpdate, latitude,
				longitude, altitude, isOnGround, velocity, heading, verticalRate, flightPositionType);
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		FlightPosition states = (FlightPosition) o;

		return true && Objects.equals(icao24, states.icao24) && Objects.equals(callsign, states.callsign)
				&& Objects.equals(originCountry, states.originCountry)
				&& Objects.equals(lastPositionUpdate, states.lastPositionUpdate)
				&& Objects.equals(lastVelocityUpdate, states.lastVelocityUpdate)
				&& Objects.equals(latitude, states.latitude) && Objects.equals(longitude, states.longitude)
				&& Objects.equals(altitude, states.altitude) && Objects.equals(isOnGround, states.isOnGround)
				&& Objects.equals(velocity, states.velocity) && Objects.equals(heading, states.heading)
				&& Objects.equals(verticalRate, states.verticalRate)
				&& Objects.equals(flightPositionType, states.flightPositionType);

	}

}
