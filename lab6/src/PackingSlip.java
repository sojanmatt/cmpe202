package fiveguys;

public class PackingSlip implements IPrintStrategy {

	@Override
	public void print(BurgerComponent burger) {
	burger.displayPackingSlip();
	
	}

}
