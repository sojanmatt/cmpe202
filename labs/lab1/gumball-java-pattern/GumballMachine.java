public class GumballMachine {
 
	State soldOutState;
	State noQuarterState;
	State hasQuarterState;
	State soldState;
	State hasRequiredCoins;
	State notEnoughCoins;
	State hasEnoughCoins;
 
	State state = soldOutState;
	int count = 0;
	
	int gum_machine=0;
	int total_amount=0;
	int coin=0;
	
 
	public GumballMachine(int numberGumballs) {
		soldOutState = new SoldOutState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);

		this.count = numberGumballs;
 		if (numberGumballs > 0) {
			state = noQuarterState;
			
		} 
	}
	
	
	public GumballMachine(int numberGumballs, int gum_machine) {
		soldOutState = new SoldOutState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);
		
		notEnoughCoins=new NotEnoughCoinState(this);
		hasEnoughCoins=new HasRequiredCoinState(this);

		this.count = numberGumballs;
 		if (numberGumballs > 0) {
			//state = noQuarterState;
			state=notEnoughCoins;
		} 
 		
 		this.gum_machine=gum_machine;
	}
 
	public void insertQuarter() {
		state.insertQuarter();
	}
	
	public void insertCoins(int coins) {
		state.insertCoins( coins);
	}
 
	public void ejectQuarter() {
		state.ejectQuarter();
	}
 
	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}

	void setState(State state) {
		this.state = state;
	}
 
	void releaseBall() {
		System.out.println("A gumball comes rolling out the slot...");
		if (count != 0) {
			count = count - 1;
		}
	}
 
	int getCount() {
		return count;
	}
 
	void refill(int count) {
		this.count = count;
		state = noQuarterState;
	}

    public State getState() {
        return state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }
    
    int getMachineType() {
    	return gum_machine;
    }
    
    public State getNotEnoughCoinState() {
        return notEnoughCoins;
    }
 
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nMighty Gumball, Inc.");
		result.append("\nJava-enabled Standing Gumball Model #2004");
		result.append("\nInventory: " + count + " gumball");
		if (count != 1) {
			result.append("s");
		}
		result.append("\n");
		result.append("Machine is " + state + "\n");
		return result.toString();
	}
}
