import java.util.List;

public class OddTotal implements TotalStrategy{

	@Override
	public int calculate(List<Integer> values) throws Exception {
		int result=0;
		for (int e :values) {
			if(e%2!=0)
			result+=e;
		}
		return result;
		
		
	}

}
