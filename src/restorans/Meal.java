package restorans;

public class Meal extends Dish implements FastPreperable{

	public Meal(String name){
		super(name);
	}
	
	public Meal(String name, double price, boolean insist, double mark) {
		super(name, price, insist, mark);
	}
	
	

}
