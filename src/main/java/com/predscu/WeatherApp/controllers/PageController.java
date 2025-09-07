package com.predscu.WeatherApp.controllers;

import com.predscu.WeatherApp.dto.WeatherResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

@Controller
public class PageController {
    @Value("${weather.api.key}")
    private String apiKey;

    @GetMapping(path = "/")
    public String getIndex() {
        return "index";
    }

    @GetMapping(path = "/weather")
    public String getWeather(@RequestParam(defaultValue = "Bucharest") String city, Model model) {
        String apiUrl = "http://api.weatherapi.com/v1/current.json?" +
                        "key=" + apiKey + "&q=" + city;
        RestTemplate restTemplate = new RestTemplate();
        WeatherResponse weatherResponse = restTemplate.getForObject(apiUrl, WeatherResponse.class);
        if (weatherResponse == null) {
            return "redirect:/";
        }
        model.addAttribute("city", city);
        model.addAttribute("temperature", weatherResponse.getCurrent().getTempC());
        model.addAttribute("feelslike", weatherResponse.getCurrent().getFeelslikeC());
        model.addAttribute("description", weatherResponse.getCurrent().getCondition().getText());
        model.addAttribute("icon", "https:" + weatherResponse.getCurrent().getCondition().getIcon());
        return "weather";
    }
}
