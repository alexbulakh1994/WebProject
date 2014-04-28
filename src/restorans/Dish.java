package restorans;

public class Dish {
	
	private double price;
	private boolean insist;
	private double mark;
	private String name;
	
	
	public Dish(String name){
		this.name=name;
	}
	
	public Dish(String name, double price, boolean insist, double mark) {
		this.price = price;
		this.insist = insist;
		this.mark = mark;
		this.name=name;
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
	public boolean isInsist() {
		return insist;
	}
	public void setInsist(boolean insist) {
		this.insist = insist;
	}
	public double getMark() {
		return mark;
	}
	public void setMark(double mark) {
		this.mark = mark;
	}
	
	
}
