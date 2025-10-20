package repository.impl;

import model.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import repository.CityRepository;

import java.util.List;

@Repository
public class CityRepositoryImpl implements CityRepository {

    @Autowired
    JdbcTemplate template;

    @Override
    public List<City> getAllCities() {
        return List.of();
    }

    @Override
    public City getCityById(long id) {
        return null;
    }

    @Override
    public int addCity(City city) {
        return 0;
    }
}
