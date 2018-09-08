public class Main {

	public static void main(String[] args) {
		
//		GumballMachine gumballMachine = new GumballMachine(20,1);
//		GumballMachine gumballMachine = new GumballMachine(20,2);
		GumballMachine gumballMachine = new GumballMachine(20,3);

		/*****For Machine 1 *******/
//		gumballMachine.insertCoins(25);
//		gumballMachine.turnCrank();

		
		/*****For Machine 2 *******/
//		gumballMachine.insertQuarter( 25 );
//		gumballMachine.insertQuarter( 25 );
//		gumballMachine.turnCrank();
		
		
		/*****For Machine 3 *******/
		gumballMachine.insertCoins( 10 );
		gumballMachine.insertCoins( 25 );
		gumballMachine.insertCoins( 10 );
		gumballMachine.insertCoins( 10 );
		gumballMachine.turnCrank();
		

		
	}
}

