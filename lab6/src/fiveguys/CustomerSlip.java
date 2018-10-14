package fiveguys;

public class CustomerSlip implements IPrintStrategy {

	
	@Override
	public void print(BurgerComponent burger) {
		
		
		burger.displayCustomerSlip();
		
	}

}
