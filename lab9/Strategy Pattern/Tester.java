import java.util.*;

public class Tester {
	  public static void main( String[] args)
	    {
	        DataSet dataset = new DataSet() ; // defaults to BubbleSort
	        dataset.display();
	        dataset.calculateTotal();
	        dataset.display();
	       // dataset.resetData();
	      //  dataset.display();
	        dataset.changeStrategy( new OddTotal() );
	        dataset.calculateTotal();
	        dataset.display();
	      //  dataset.resetData();
	     //   dataset.display();
	        dataset.changeStrategy( new EvenTotal() );
	        dataset.calculateTotal();
	        dataset.display();
	    }
	

}
