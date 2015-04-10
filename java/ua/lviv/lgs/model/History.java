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
	@Column
	private Reservation reserv;

	public History() {

	}

	public History(Car car, User user, Reservation reserv) {
		
		this.car = car;
		this.user = user;
		this.reserv = reserv;
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

	public Reservation getReserv() {
		return reserv;
	}

	public void setReserv(Reservation reserv) {
		this.reserv = reserv;
	}

	@Override
	public String toString() {
		return "History [id=" + id + ", car=" + car + ", user=" + user
				+ ", reserv=" + reserv + "]";
	}
	

}
