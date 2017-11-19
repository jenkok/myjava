package figura;

public class Square  implements Ploshad{
	
	double storonaA;
	
	@Override
	public double p() {
		double per = 4*storonaA;
		return per;
		
	}

	@Override
	public double s() {
		double aria = storonaA*storonaA;
		return aria;
	}

}
