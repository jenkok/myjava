package Calc;

import java.util.ArrayList;

public class Result {
	static ArrayList<Double>  numbers = new ArrayList();
	static ArrayList <String> func = new ArrayList();
	static int nom=0;
	static int del=0;
	static double res;
	public static void podshet (double x, String com) {	
	    numbers.add(x);	
		func.add(com);
		if (com=="=") { 
			sdvig("*");
			sdvig("/");
			sdvig("-");
			sdvig("+");
			System.out.println(numbers.get(0));
			//numbers.removeAll(numbers);
			//func.removeAll(func);
			
		}
	}
	private static void sdvig (String znak) {	
		for (int i=0; i<func.size();) {
			while (func.get(i)==znak) {			
				switch (func.get(i)) {
				case "*": res=numbers.get(i)*numbers.get(i+1);	
					break;
				case "/": res=numbers.get(i)/numbers.get(i+1);
					break;
				case "-": res=numbers.get(i)-numbers.get(i+1);
                   break;
				case "+": res=numbers.get(i)+numbers.get(i+1);
				   break;
				}		
					numbers.set(i+1,res);	
					int g = func.size();
					for(int j=i; j<g-1;j++) {
						numbers.set(j, numbers.get(j+1));
						func.set(j, func.get(j+1));
					}	
				}
			i++;
		}	
	}
}
