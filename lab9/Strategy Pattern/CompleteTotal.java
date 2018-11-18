
import java.util.List;

public class CompleteTotal implements TotalStrategy{

	@Override
	public int calculate(List<Integer> values) throws Exception {
		int result=0;
		for (int e :values) {
			result+=e;
		}
		return result;
		
		
	}

}
