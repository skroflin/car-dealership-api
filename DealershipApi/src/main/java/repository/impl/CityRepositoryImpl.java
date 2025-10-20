package repository.impl;

import model.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
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
        String query =
                """
                select * from city
                """;
        List<City> allCities = template.query(query, new BeanPropertyRowMapper<City>(City.class));
        return allCities;
    }

    @Override
    public City getCityById(long id) {
        String query =
                """
                select * from city where city_id = ?
                """;
        City city = template.queryForObject(query, BeanPropertyRowMapper.newInstance(City.class), id);
        return city;
    }

    @Override
    public int addCity(City city) {
        String query =
                """
                insert into city(name, longitude, latitude) values (?, ?, ?)
                """;
        return template.update(query, city.getName(), city.getLongitude(), city.getLatitude());
    }
}
