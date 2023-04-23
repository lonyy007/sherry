package task4;

public class Car {
	private String make;
	private String model;
	private String color;
	
	public Car(String make, String model, String color) {
		this.make=make;
		this.model=model;
		this.color=color;
	}



	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}


	@Override
	public String toString() {
		return String.format("Car{make:%s,model:%s,color:%s}",this.make,this.model,this.color);
	}
}
