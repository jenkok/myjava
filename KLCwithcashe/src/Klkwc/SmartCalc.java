package Klkwc;

import java.util.ArrayList;

public class SmartCalc {
	
		private static ArrayList<Double>  numbers = new ArrayList();
		private static ArrayList <String> func = new ArrayList();
		private static double res;
		public static double result;
		
		public static double podshet (double x, String com) {	
		    numbers.add(x);	
			func.add(com);
			if (com=="=") { 
				sdvig("*");
				sdvig("/");
				sdvig("-");
				sdvig("+");
				result = numbers.get(0);
				System.out.println(numbers.get(0));
				numbers.clear();
				func.clear();
				//numbers.removeAll(numbers);
				//func.removeAll(func);
				
			}
			return result;
		}
		private static void sdvig (String znak) {	
			for (int i=0; i<func.size();) {
				while (func.get(i)==znak) {			
					switch (func.get(i)) {
					case "*": res=Cashe.newObj(numbers.get(i),numbers.get(i+1), znak);	
						break;
					case "/": res=Cashe.newObj(numbers.get(i),numbers.get(i+1), znak);
						break;
					case "-": res=Cashe.newObj(numbers.get(i),numbers.get(i+1), znak);
	                   break;
					case "+": res=Cashe.newObj(numbers.get(i),numbers.get(i+1), znak);
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

