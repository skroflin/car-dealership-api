package controller;

import model.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import repository.CityRepository;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CityController {
    @Autowired
    CityRepository cityRepository;

    @GetMapping("/cities")
    public List<City> getAllCities() {
        return cityRepository.getAllCities();
    }

    @GetMapping("/city/{id}")
    public City getCityById(@PathVariable("id") int id) {
        return cityRepository.getCityById(id);
    }

    @PostMapping("/city")
    public int addCity(@RequestBody City city) {
        return cityRepository.addCity(city);
    }
}
