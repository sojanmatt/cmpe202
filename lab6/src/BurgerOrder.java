package fiveguys;

public class BurgerOrder {
	public static void main(String[] args) {
		IPrintStrategy customerslip =new CustomerSlip()  ;
		IPrintStrategy packingslip =new  PackingSlip();
		
		BurgerComponent LittleBaconCheeseBurger=new Burger("LBC");
		
		LittleBaconCheeseBurger.add(new Toppings("Lettuce", 1));
		LittleBaconCheeseBurger.add(new Toppings("Tomato", 1));
		LittleBaconCheeseBurger.add(new Toppings("->G Onion", 2));
		LittleBaconCheeseBurger.add(new Toppings("->Jala Grilled", 2));
	
		customerslip.print(LittleBaconCheeseBurger);
		System.out.println("-----------------------");
		packingslip.print(LittleBaconCheeseBurger);
		
		
		

		
		
		
	}

}
