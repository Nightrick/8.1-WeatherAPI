package co.grandcircus.WeatherAPI;

import java.util.List;

//Start at innermost value to avoid errors
//No annotation required
public class WeatherValue {
	
	private String areaDescription;
	private String currentObservationName;
	private String currentObservationDate;
	private String currentObersvationTemp;
	private List<String> weatherText;

	public String getAreaDescription() {
		return areaDescription;
	}
	public void setAreaDescription(String areaDescription) {
		this.areaDescription = areaDescription;
	}
	public String getCurrentObservationName() {
		return currentObservationName;
	}
	public void setCurrentObservationName(String currentObservationName) {
		this.currentObservationName = currentObservationName;
	}
	public String getCurrentObservationDate() {
		return currentObservationDate;
	}
	public void setCurrentObservationDate(String currentObservationDate) {
		this.currentObservationDate = currentObservationDate;
	}
	public String getCurrentObersvationTemp() {
		return currentObersvationTemp;
	}
	public void setCurrentObersvationTemp(String currentObersvationTemp) {
		this.currentObersvationTemp = currentObersvationTemp;
	}
	public List<String> getWeatherText() {
		return weatherText;
	}
	public void setWeatherText(List<String> weatherText) {
		this.weatherText = weatherText;
	}
	
	
	
	
}
