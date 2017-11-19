package figura;

public class Circle  implements Ploshad{

	double storonaA;

	public double p() {
		double per = 2*storonaA*Math.PI;
		return per;		
	}
	@Override
	public double s() {
		double aria = storonaA*storonaA*Math.PI;
		return aria;			
	}
	
	@Override
	public boolean equals11 (Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circle other = (Circle) obj;
		if (Double.doubleToLongBits(storonaA) != Double.doubleToLongBits(other.storonaA))
			return false;
		return true;
	}

	
	
}	
	
