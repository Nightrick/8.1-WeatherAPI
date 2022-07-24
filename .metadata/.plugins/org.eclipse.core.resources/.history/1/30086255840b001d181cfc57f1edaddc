package co.grandcircus.WeatherAPI;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherApiService {
	
	//Rest template called to correspond with REST API
	private RestTemplate request = new RestTemplate();
	
	public WeatherResponse getWeather() {
		String url = "https://forecast.weather.gov/MapClick.php?lat=42.3831&lon=-83.1022&FcstType=json";
		WeatherResponse response = request.getForObject(url, WeatherResponse.class);
		return response;
	}
	
	//public List<WeatherValue>

}
