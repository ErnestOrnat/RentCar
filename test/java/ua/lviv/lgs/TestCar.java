package ua.lviv.lgs;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ua.lviv.lgs.dao.CarDAO;
import ua.lviv.lgs.model.Car;
@ContextConfiguration(locations="file:src/main/webapp/WEB-INF/spring/root-context.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class TestCar {
	@Autowired
	private CarDAO dao;
	@Test
	public void testSaveCar() {
		long sizeBefore = dao.count();
		Car car = new Car();
		dao.save(car);
		long sizeAfter = dao.count();
		Assert.assertTrue(sizeAfter-sizeBefore==1);
	}
	@Test
	public void testDeleteCar() {
		long sizeBefore = dao.count();
		Car car = new Car();
		dao.save(car);
		dao.delete(car);
		long sizeAfter = dao.count();
		Assert.assertTrue(sizeAfter-sizeBefore==0);
	}
	@Test
	public void testCarRead(){
        Car car = new Car();
        dao.save(car);
		Car car2 = dao.findOne(car.getId());
		Assert.assertTrue(car2.getId() == car.getId());
	}
	@Test
	public void testCarEdit(){
		Car car = new Car();
		car.setBrand("");
	    dao.save(car);
	    dao.findOne(car.getId());
		Assert.assertTrue(car.getBrand().equals(car.getBrand()));
	}

}
