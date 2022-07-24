package co.grandcircus.WeatherAPI;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import Model.WeatherLocation;

@Service
public class WeatherApiService {
	
	//Rest template called to correspond with REST API
	private RestTemplate request = new RestTemplate();
	
	public String getAreaDescription() {
		String url = "https://forecast.weather.gov/MapClick.php?lat=42.3831&lon=-83.1022&FcstType=json";
		WeatherLocation  response = request.getForObject(url, WeatherResponse.class).getLocation();
		return response.getAreaDescription();
	}
	
	public List<String> getTimeStart() {
		String url = "https://forecast.weather.gov/MapClick.php?lat=42.3831&lon=-83.1022&FcstType=json";
		List<String>  response = request.getForObject(url, WeatherResponse.class).getTime().getStartPeriodName();
		return response;
	}
	
	public List<String> getTimeDataText() {
		String url = "https://forecast.weather.gov/MapClick.php?lat=42.3831&lon=-83.1022&FcstType=json";
		List<String>  response = request.getForObject(url, WeatherResponse.class).getData().getText();
		return response;
	}
	
	public String getCurrentObservationName() {
		String url = "https://forecast.weather.gov/MapClick.php?lat=42.3831&lon=-83.1022&FcstType=json";
		String response = request.getForObject(url, WeatherResponse.class).getCurrentObservation().getName();
		
		return response;
	}
	
	public int getCurrentObservationTemp() {
		String url = "https://forecast.weather.gov/MapClick.php?lat=42.3831&lon=-83.1022&FcstType=json";
		int response = request.getForObject(url, WeatherResponse.class).getCurrentObservation().getTemp();
		return response;
	}
	
	public int getCurrentObservationDewp() {
		String url = "https://forecast.weather.gov/MapClick.php?lat=42.3831&lon=-83.1022&FcstType=json";
		int response = request.getForObject(url, WeatherResponse.class).getCurrentObservation().getDewp();
		return response;
	}
	


}
