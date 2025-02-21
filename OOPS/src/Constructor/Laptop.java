package Constructor;

public class Laptop {
	private  int id;
	private String model;
	private String brand;
	private Double price;
	private String processor;
	private String memory;
	private String storage;
	// parameterised constructor
	public Laptop(int id,String model,String brand, Double price,String processor,String memory, String storage)
	{
		this.id=id;
		this.model=model;
		this.brand=brand;
		this.price=price;
		this.processor=processor;
		this.memory=memory;
		this.storage=storage;
	}
	//getter & setter
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	public String getMemory() {
		return memory;
	}
	public void setMemory(String memory) {
		this.memory = memory;
	}
	public String getStorage() {
		return storage;
	}
	public void setStorage(String storage) {
		this.storage = storage;
	}
	@Override
	public String toString() {
		return "Laptop [id=" + id + ", model=" + model + ", brand=" + brand + ", price=" + price + ", processor="
				+ processor + ", memory=" + memory + ", storage=" + storage + "]";
	}

}
