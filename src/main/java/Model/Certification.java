package Model;

public class Certification {
	private String name; 
	private double price; 
	
	
	public Certification(String s, double d) {
		setName(s);
		setPrice(d);
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
