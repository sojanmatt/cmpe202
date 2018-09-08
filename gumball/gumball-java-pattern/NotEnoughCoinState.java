
public class NotEnoughCoinState implements State {
    GumballMachine gumballMachine;
 
    public NotEnoughCoinState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
	public void insertQuarter() {
		System.out.println("You inserted a quarter");
		gumballMachine.setState(gumballMachine.getHasQuarterState());
	}
	
	public void insertCoins(int coins) {
		
		
		if(gumballMachine.getMachineType()==1) {
			
			
			if(coins%25==0) {
				gumballMachine.setState(gumballMachine.getHasQuarterState());
			}
			else {
				System.out.println("Please insert quarters only");
				gumballMachine.setState(gumballMachine.getNotEnoughCoinState());
			}
			
			
		}
		if(gumballMachine.getMachineType()==2) {
			
			gumballMachine.total_amount+=coins;
			
			if(coins%25==0 && gumballMachine.total_amount>=25) {
				gumballMachine.setState(gumballMachine.getHasQuarterState());
			}
			else {
				System.out.println("Please insert quarters only");
				gumballMachine.setState(gumballMachine.getNotEnoughCoinState());
			}
			
			
		}
		
			if(gumballMachine.getMachineType()==3) {
			
			gumballMachine.total_amount+=coins;
			if( gumballMachine.total_amount>=50) {
				gumballMachine.setState(gumballMachine.getHasQuarterState());
			}
			else {
				System.out.println("Not enough coins");
				gumballMachine.setState(gumballMachine.getNotEnoughCoinState());
			}
			
			
		}
		
		
		//System.out.println("You inserted a quarter");
		
	}
	
 
	public void ejectQuarter() {
		System.out.println("You haven't inserted a quarter");
	}
 
	public void turnCrank() {
		System.out.println("You turned, but there's no quarter");
	 }
 
	public void dispense() {
		System.out.println("You need to pay first");
	} 
 
	public String toString() {
		return "waiting for quarter";
	}
}