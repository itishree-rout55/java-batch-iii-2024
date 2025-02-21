package Constructor;

public class Car {
	private String brand;
	private String model;
	
	public Car(String brand,String model) {
		System.out.println("parameterised constructor is called !");
		this.brand=brand;
		this.model=model;
	}
	public void show() {
		System.out.println("[Brand : "+brand+" , model : "+model+"]");
	}

}
