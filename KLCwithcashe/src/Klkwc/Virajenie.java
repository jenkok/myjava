package Klkwc;

import java.util.ArrayList;

public class Virajenie {
	
	private double x;
	private double y;
	private String fun;
	public double res;
	
	Virajenie (double x, double y, String fun ){
		this.x = x;
		this.y = y;
		this.fun=fun;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fun == null) ? 0 : fun.hashCode());
		long temp;
		temp = Double.doubleToLongBits(x);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(y);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Virajenie other = (Virajenie) obj;
		if (fun == null) {
			if (other.fun != null)
				return false;
		} else if (!fun.equals(other.fun))
			return false;
		if (Double.doubleToLongBits(x) != Double.doubleToLongBits(other.x))
			return false;
		if (Double.doubleToLongBits(y) != Double.doubleToLongBits(other.y))
			return false;
		return true;
	}

	
	
}
