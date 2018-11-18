import java.util.List;
import java.util.function.Predicate;

public class TotalCalculator {

	int result=0;
	public int calculate(List<Integer> values, Predicate<Integer> criteria)
	{
		int result=values.stream().filter(criteria).reduce(0, Integer::sum);
		return result;
	}
}
