package ua.lviv.lgs.service.impl;

import java.util.Date;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ua.lviv.lgs.dao.CarDAO;
import ua.lviv.lgs.model.Car;
import ua.lviv.lgs.model.User;
import ua.lviv.lgs.service.CarService;

@Service
public class CarServiceImpl implements CarService {
	@Autowired
	private CarDAO dao;

	@Transactional
	public void newCar(Car car) {
		dao.save(car);
	}

	@Transactional
	public void deleteCar(Car car) {
		dao.delete(car);
	}

	
	public Iterable<Car> getAllCar() {
		
		return dao.findAll();
	}

	
	public Iterable<Car> getAllCarSortedByPrice() {
		Iterable<Car> allCar = dao.findAll();
		
		return null;
	}

	@Override
	public Iterable<Car> getAllCarSortedByYear() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Car> getAllCarSortedByBrand() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Car> getAllCarSortedByClass() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Car editCar(Integer id, Car car) {
		Car newCar = dao.findOne(id);
		newCar.setBrand(car.getBrand());
		newCar.setClassCar(car.getClassCar());
		newCar.setColor(car.getColor());
		newCar.setEngineVolume(car.getEngineVolume());
		newCar.setModel(car.getModel());
		newCar.setPrice(car.getPrice());
		newCar.setStatus(car.getStatus());
		newCar.setTrasmision(car.getTrasmision());
		newCar.setYear(car.getYear());
		return dao.save(newCar);
	}

	@Override
	public Car editCarStatus(Integer id, Car car) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Car> getAllAvailibleCar(Date startDate, Date endDate) {
		Set<Car> cars =  new TreeSet<Car>();
	Iterable<Car> findAll = dao.findAll();
	for (Car car : findAll) {
		if(startDate.after(car.getEndDate())&endDate.before(car.getStartDate())){
			cars.add(car);
		}
	}
		return cars;
	}

	@Override
	public Car bookingCar(Date startDate, Date endDate, User user, Car car) {
		if(startDate.after(car.getEndDate())&endDate.before(car.getStartDate())){
			car.setStartDate(startDate);
			car.setEndDate(endDate);
			car.setStatus(0);
		}
		return car;
	}

}
