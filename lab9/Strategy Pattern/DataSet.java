
import java.util.*;

public class DataSet {

	private List<Integer> data;
	private TotalStrategy strategy;
	private int FinalTotal = 0;

	public DataSet()

	{
		strategy = new CompleteTotal();
		data = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
	}

	public void calculateTotal() {
		try {
			FinalTotal = strategy.calculate(data);
			System.out.println(strategy.toString());
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	public void display() {
	//	for (int i = 0; i < 12; i++)
			System.out.println(FinalTotal);
	}

	public void resetData() {
	//	for (int i = 0; i < data.size(); i++)
			//sortedList[i] = data.get(i);
	//	System.out.println("Data Reset Done!");
	}

	public void changeStrategy(TotalStrategy s) {
		strategy = s;
	}

}
