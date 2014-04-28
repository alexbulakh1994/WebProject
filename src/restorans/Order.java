package restorans;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Order {
	private  double payment;
	private boolean postage;
	

	public boolean isPostage() {
		return postage;
	}

	public void setPostage(boolean postage) {
		this.postage = postage;
	}

	public double getPayment() {
		return payment;
	}

	public void setPayment(double payment) {
		this.payment = payment;
	}
	
	public void putTo_Order(){
		
	}
	
	public static boolean FoodSearch(Map<Integer, Meal> map, String OrderFood){
		
		Iterator<Map.Entry<Integer, Meal>> iterator = map.entrySet().iterator();

		while (iterator.hasNext()) {
		  Map.Entry<Integer, Meal> entry = iterator.next();
		  
		  if (entry.getValue().getName().equals(OrderFood)) {
		    return true;
		  }
		}
		return false; 
		

	}
	
	public static void main(String args[]) throws NotFindDishException{
			
		List<Restoran> restorans=new ArrayList<Restoran>();
		for(int i=0;i<3;i++){
			restorans.add(new Restoran("Restoran"+ i));	
		}
		
		for(int i=0;i<2;i++){
			System.out.println(restorans.get(i).getName());	
		}
		
		Map<Integer, Meal> database = new Hashtable<Integer, Meal>(); 
		
		// menu restoran0 
		database.put(1, new Meal("soup"));
		database.put(2, new Meal("rise"));
		database.put(3, new Meal("bread"));
		database.put(4, new Meal("boil potatoes"));
		database.put(5, new Meal("salat"));
		database.put(6, new Meal("fry potatoes"));
		database.put(7, new Meal("borsch"));
		
		//menu restoran1
		database.put(8, new Meal("barilla"));
		database.put(9, new Meal("Olivier salad"));
		database.put(10, new Meal("bread"));
		database.put(11, new Meal("boil potatoes"));
		database.put(12, new Meal("salat"));
		
		
		//menu restoran2
		database.put(13, new Meal("barilla"));
		database.put(14, new Meal("Olivier salad"));
		database.put(15, new Meal("bread"));
		database.put(16, new Meal("fry potatoes"));
		database.put(17, new Meal("borsh"));
		database.put(18, new Meal("jelly"));
		
		
		
		if(FoodSearch(database, "soup")){
			System.out.println("Order make successful");
		}else{
			System.out.println("Fail");
			throw new NotFindDishException();
		}
		if(FoodSearch(database, "vinigret"))
			System.out.println("Order make successful");
		else{
			System.out.println("Fail");
			throw new NotFindDishException();
				
		}
	}
	

}
