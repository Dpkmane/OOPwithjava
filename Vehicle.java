package exception;

//state(data members)  : registrationNo : int , color : String , price : double
public class Vehicle {
	private int registrationNo;
	private String color;
	private double price;

	public Vehicle(int registrationNo, String color, double price) {

		this.registrationNo = registrationNo;
		this.color = color;
		this.price = price;
	}


	@Override
	public String toString() {
		return "Vehicle [registrationNo=" + registrationNo + ", color=" + color + ", price=" + price + "]";
	}

	

	@Override
	public boolean equals(Object  anotherobj) {
		if (anotherobj instanceof Vehicle) {
			Vehicle V= (Vehicle)anotherobj;//downcasting
		return this.registrationNo == ((Vehicle)anotherobj).registrationNo && this.color.equals(V.color);
	}
		return false;
	}
	

	
   
	
	
}
