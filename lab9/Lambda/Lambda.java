import java.util.*;
import java.util.function.Predicate;;

public class Lambda {
	public static void main(String[] args)
	{
		List<Integer> data = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		TotalCalculator total=new TotalCalculator(); 
		System.out.println("Total sum");
		System.out.println(total.calculate(data, e->true));
		System.out.println("Even sum");
		System.out.println(total.calculate(data,e->e%2==0));
		System.out.println("odd Sum");
		System.out.println(total.calculate(data,e->e%2!=0));
	}
}
