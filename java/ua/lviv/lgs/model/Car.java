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
	private int condition; // 1-вільна 0 - зайнта -1 - ремонт

	public Car() {

	}

	public Car(String brand, String model, int year, String color,
			double engineVolume, String trasmision, int price, int condition) {
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.color = color;
		this.engineVolume = engineVolume;
		this.trasmision = trasmision;
		this.price = price;
		this.condition = condition;
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

	public int getCondition() {
		return condition;
	}

	public void setCondition(int condition) {
		this.condition = condition;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", brand=" + brand + ", model=" + model
				+ ", year=" + year + ", color=" + color + ", engineVolume="
				+ engineVolume + ", trasmision=" + trasmision + ", price="
				+ price + ", condition=" + condition + "]";
	}

}
