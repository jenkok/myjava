package Klkwc;

public class Result {

	public double result(double x, double y, String fun) {
		double r=0;
		switch (fun) {
		case "*": r=x*y;	
			break;
		case "/": r=x/y;
			break;
		case "-": r=x-y;
           break;
		case "+": r=x+y;
		   break;
		}
		return r;
	}
}
