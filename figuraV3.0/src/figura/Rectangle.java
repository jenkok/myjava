package figura;

public class Rectangle implements Ploshad {

	double storonaA;
	double storonaB;
	double storonaC;
	
	@Override
	public double s() {	
		
		return  (storonaA*storonaB*P);
	}

	@Override
	public double p() {
		return (storonaA+storonaB)*2;
	}
    
	public boolean ninty() {
		boolean prov;
		double diagonal =  Math.sqrt(storonaA*storonaA+storonaB*storonaB);
		if (diagonal==storonaC) {	
		prov = true;
		}
		else {
		prov = false;	
		}
		return prov;
	}
}

