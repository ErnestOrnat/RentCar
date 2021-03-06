package ua.lviv.lgs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class History {
	@Id
	@GeneratedValue
	private int id;
	@Column
	private Car car;
	@Column
	private User user;


	public History() {

	}

	public History(Car car, User user) {
		
		this.car = car;
		this.user = user;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}



	@Override
	public String toString() {
		return "History [id=" + id + ", car=" + car + ", user=" + user
				+ "]";
	}
	

}
