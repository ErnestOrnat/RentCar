package ua.lviv.lgs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Car {
	@Id
	@GeneratedValue
	@Column(name = "car_id")
	private int id;
	@Column
	private String brand;
	@Column
	private String model;
	@Column
	private String classCar;
	@Column
	private int year;
	@Column
	private String color;
	@Column
	private double engineVolume;
	@Column
	private String trasmision;
	@Column
	private int price;
	@Column
	private int status; // 1-вільна 0 - зайнята -1 - ремонт
	
	private Reservation res;

	public Car() {

	}

	public Car(int id, String brand, String model, String classCar, int year,
			String color, double engineVolume, String trasmision, int price,
			int status, Reservation res) {
		this.brand = brand;
		this.model = model;
		this.classCar = classCar;
		this.year = year;
		this.color = color;
		this.engineVolume = engineVolume;
		this.trasmision = trasmision;
		this.price = price;
		this.status = status;
		this.res = res;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getClassCar() {
		return classCar;
	}

	public void setClassCar(String classCar) {
		this.classCar = classCar;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getEngineVolume() {
		return engineVolume;
	}

	public void setEngineVolume(double engineVolume) {
		this.engineVolume = engineVolume;
	}

	public String getTrasmision() {
		return trasmision;
	}

	public void setTrasmision(String trasmision) {
		this.trasmision = trasmision;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Reservation getRes() {
		return res;
	}

	public void setRes(Reservation res) {
		this.res = res;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", brand=" + brand + ", model=" + model
				+ ", classCar=" + classCar + ", year=" + year + ", color="
				+ color + ", engineVolume=" + engineVolume + ", trasmision="
				+ trasmision + ", price=" + price + ", status=" + status
				+ ", res=" + res + "]";
	}

}