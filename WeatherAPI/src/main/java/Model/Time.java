package Model;

import java.util.List;

public class Time {
	
	private List<String> startPeriodName;
	private List<String> startValidTime;
	private List<String> temperatureLabel;
	
	public List<String> getStartValidTime() {
		return startValidTime;
	}

	public void setStartValidTime(List<String> startValidTime) {
		this.startValidTime = startValidTime;
	}

	public List<String> getTemperatureLabel() {
		return temperatureLabel;
	}

	public void setTemperatureLabel(List<String> temperatureLabel) {
		this.temperatureLabel = temperatureLabel;
	}

	public List<String> getStartPeriodName() {
		return startPeriodName;
	}

	public void setStartPeriodName(List<String> startPeriodName) {
		this.startPeriodName = startPeriodName;
	}

}
