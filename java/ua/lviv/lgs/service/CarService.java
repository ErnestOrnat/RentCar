package ua.lviv.lgs.service;

import java.util.Date;

import ua.lviv.lgs.model.Car;
import ua.lviv.lgs.model.User;

public interface CarService {

	public void newCar (Car car);
	public void deleteCar(Car car);
	public Iterable<Car> getAllCar();
	public Iterable<Car> getAllCarSortedByPrice();
	public Iterable<Car> getAllCarSortedByYear();
	public Iterable<Car> getAllCarSortedByBrand();
	public Iterable<Car> getAllCarSortedByClass();
	public Iterable<Car> getAllAvailibleCar(Date startDate, Date endDate);
	public Car editCar(Integer id, Car car);
	public Car editCarStatus(Integer id, Car car);
	public Car bookingCar(Date startDate, Date endDate, User user, Car car);
	
}
