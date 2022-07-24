package co.grandcircus.WeatherAPI;

import com.fasterxml.jackson.annotation.JsonProperty;

import Model.CurrentObservation;
import Model.Data;
import Model.Time;
import Model.WeatherLocation;

public class WeatherResponse {
	
	@JsonProperty("time")
	private Time time;
	
	@JsonProperty("location")
	private WeatherLocation location;
	
	@JsonProperty("currentobservation")
	private CurrentObservation currentObservation;
	
	@JsonProperty("data")
	private Data data;
	
	
	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	public WeatherLocation getLocation() {
		return location;
	}

	public void setLocation(WeatherLocation location) {
		this.location = location;
	}

	public CurrentObservation getCurrentObservation() {
		return currentObservation;
	}

	public void setCurrentObservation(CurrentObservation currentObservation) {
		this.currentObservation = currentObservation;
	}

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

}
