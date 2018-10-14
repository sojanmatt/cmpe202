package fiveguys;

public class Toppings extends BurgerComponent{
	String toppingname;
	int price;
	
	public Toppings(String topping,int cost) {
		this.toppingname=topping;
		
		this.price=cost;
	}
	
	public String gettoppingName() {return this.toppingname;}
	public int getprice() {return this.price;}
	
	public void displayCustomerSlip() {
		System.out.println(gettoppingName());
		
		
	}
	
	
	public String getburgercontent() {return this.toppingname;}

	
	
}
