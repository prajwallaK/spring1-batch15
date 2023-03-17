package model;

public class Car {
	
	String name;
	String model; 
	String price;
	
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Car(String name, String model, String price) {
		super();
		this.name = name;
		this.model = model;
		this.price = price;
	}
	
	
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car [name=" + name + ", model=" + model + ", price=" + price + "]";
	}
	
	
	
	

}
