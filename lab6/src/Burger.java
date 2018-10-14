package fiveguys;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Burger extends BurgerComponent{
	
	ArrayList burgerComponents= new ArrayList<>();
	String burgername;
	String meat;
	double price;
	ArrayList topbuncomponents= new ArrayList<String>();
	ArrayList bottombuncomponents= new ArrayList<>();
	ArrayList meatcomponents= new ArrayList<String>();
	public Burger(String newburgername) {
	burgername=newburgername;
		
		setBurgerPrice(newburgername);
	}
	public void setBurgerPrice(String burgername) {
		switch(burgername)
		{
		case("LBC"):
		{
			this.price=9.14;
			this.meat="Bacon";
		}
		case("LCB"):
		{
			this.price=7.14;
			
		}
		
		}
		
	}
	
	public String getBurgerName() {return this.burgername;}
	//public String getBurgerName() {return this.burgername;}
	
	public void add(BurgerComponent newburgercomponent) {
		burgerComponents.add(newburgercomponent);
	}
	
	public BurgerComponent getComponent(int componentid) {
		return (BurgerComponent)burgerComponents.get(componentid);
	}
	
	public void displayCustomerSlip()
	{
		Iterator burgeriterator=burgerComponents.iterator();
		System.out.println(getBurgerName()+"              ");
		System.out.println("{{{ "+this.meat+" }}}");
		while(burgeriterator.hasNext()){
			BurgerComponent burgerinfo=(BurgerComponent) burgeriterator.next(); 
			burgerinfo.displayCustomerSlip(); 
		}
		System.out.println("Sub Total:"+"                "+"$"+this.price);
		
		
		
		
		
	}
	
	public void displayPackingSlip()
	{
		String topping;
		Iterator burgeriterator1=burgerComponents.iterator();
		System.out.println(getBurgerName()+"              ");
		
		while(burgeriterator1.hasNext()){
			BurgerComponent burgerinfo=(BurgerComponent) burgeriterator1.next(); 
			topping =burgerinfo.getburgercontent();
			
			if(topping.contains("-"))
				meatcomponents.add(topping);
			else
				topbuncomponents.add(topping);
			
			
		}
		Collections.sort(topbuncomponents);
		for (int i=0;i<topbuncomponents.size();i++)
		{
			System.out.println(topbuncomponents.get(i));
			
			
		}
		for (int i=0;i<meatcomponents.size();i++)
		{
			System.out.println(meatcomponents.get(i));
			
			
		}
		System.out.println("{{{ "+this.meat+" }}}");
		
		
	}
	
	
	
	
	
	

}
