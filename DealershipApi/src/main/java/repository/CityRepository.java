package repository;

import model.City;

import java.util.List;

public interface CityRepository {
    List<City> getAllCities();
    City getCityById(long id);
    int addCity(City city);
}
