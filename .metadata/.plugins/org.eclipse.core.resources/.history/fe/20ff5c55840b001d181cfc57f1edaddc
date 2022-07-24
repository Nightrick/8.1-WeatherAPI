package co.grandcircus.WeatherAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WeatherController {
	
	@Autowired
	private WeatherApiService weatherService;
	
	@RequestMapping("/")
	public String homePage(Model model) {
		model.addAttribute("weather", weatherService.getWeather());
		return "home";
	}

}
