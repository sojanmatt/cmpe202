/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CreditCardExp extends Slash implements IDisplayComponent, IKeyEventHandler {

	private IKeyEventHandler nextHandler;
	private String date = "";
	private int expcount = 0;
	private Slash sl = new Slash();

	public void setNext(IKeyEventHandler next) {
		this.nextHandler = next;
	}

	public String display() {
		if (date.equals(""))
			return "[MM/YY]" + "  ";
		else
			return "[" + sl.getDetails(date) + "]" + "  ";
	}

	public void key(String ch, int cnt) {
		System.out.println("inside if=gnorecase  "+ch);
		// if ( cnt >= 17 && cnt <= 20 ) {
		if (cnt >= 17 && expcount<4 &&!ch.equalsIgnoreCase("x")) {

			System.out.println("exp ");
			date += ch;
			expcount++;
		} 
		
		
		else if (cnt >= 16&&cnt < 20&&ch.equalsIgnoreCase("x")&&date.length()>0) {
			

			date = date.substring(0, date.length() - 1);
			expcount--;
		} else if (nextHandler != null)
			nextHandler.key(ch, cnt);
	}

	public void addSubComponent(IDisplayComponent c) {
		// date+=c.display();
	}

}