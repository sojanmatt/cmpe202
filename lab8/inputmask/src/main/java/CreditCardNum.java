import java.util.ArrayList;

/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CreditCardNum extends CardDecorator implements IDisplayComponent, IKeyEventHandler {
	
	private IKeyEventHandler chain;
	private IKeyEventHandler nextHandler;
	private String number = "";
	
	private int cardnocount = 0;
	
	private CardDecorator carddecorator = new CardDecorator();


	public void setNext(IKeyEventHandler next) {
		this.nextHandler = next;
	}

	public String display() {
		if (number.equals(""))
			return "[4444 4444 4444 4444]" + "  ";
		else {
		
			return "[" + carddecorator.getDetails(number) + "]" + "  ";
		}
	}

	public void key(String ch, int cnt) 
	
	{
		if ( cardnocount <16 &&!ch.equalsIgnoreCase("x")) {
			number += ch ;
			cardnocount++;
			System.out.println("cardcount"+cardnocount);
		}
		
		else if(ch.equalsIgnoreCase("x")&&cnt <16&&number.length()>0) {
			number=number.substring(0,number.length()-1);
			cardnocount--;
			
		}
		
	else if ( nextHandler != null )
		nextHandler.key(ch, cnt) ;
		}

	public void addSubComponent(IDisplayComponent c) {


	}

	

	
	
	

}