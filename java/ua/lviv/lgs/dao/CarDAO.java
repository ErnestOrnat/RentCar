package ua.lviv.lgs.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ua.lviv.lgs.model.Car;

@Repository
public interface CarDAO extends
		CrudRepository<Car, Integer> {

}
