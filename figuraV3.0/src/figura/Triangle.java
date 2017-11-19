package figura;

public class Triangle implements Ploshad{

	double storonaA;
	double storonaB;
	double storonaC;
	@Override
	public double s() {	
		double halfP = (storonaA+storonaB+storonaC)/2;		
		
		return Math.sqrt(halfP*(halfP-storonaA)*(halfP-storonaB)*(halfP-storonaC));
	}

	@Override
	public double p() {
		return storonaA+storonaB+storonaC;
	}
}
	
