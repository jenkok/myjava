package Klkwc;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;


import java.lang.reflect.*;

public class Cashe {
	static ArrayList<Double>  numbers = new ArrayList<>();
	static ArrayList<String>  f = new ArrayList<>();
	static int i=0;
	static LinkedHashMap  cashTwo = new LinkedHashMap(); 
	static ArrayList<Virajenie>  cashOne = new ArrayList<>(5);
	static double result;
	
	public static double newObj (double x,double y, String com) {
		 
		/*numbers.add(t);
		 f.add(com);
		 i++;
		 if (i==2) {
			 com="=";
		 }*/
		 //if (com=="=") {
		 Virajenie v = new Virajenie(x, y, com);	
		 int index = cashOne.indexOf(v);		
		 System.out.println(cashOne.size());		
		 System.out.println("arrayset="+index);
			if (index==-1) {
				if (cashOne.size()<5) {
					Result r = new Result();
					v.res= r.result(x, y, com);
					cashOne.add(v);
					result=v.res;
				}
				else {
			Object pro = cashTwo.get(v.hashCode());
				System.out.println("hashset1="+cashTwo.size());
				if (pro==null) {
					
					Result r = new Result();
					v.res= r.result(x, y, com);
					cashTwo.put(v.hashCode(),v);
					result=v.res;
				}
				else {
					System.out.println(cashOne.get(4).hashCode());
					cashTwo.put(cashOne.get(4).hashCode(),cashOne.get(4));
					cashOne.add(4, (Virajenie) pro);
					result=cashOne.get(4).res;
				}
			   }
			}
			else {
				if (index!=0) {
					Object buf = cashOne.get(index-1); 		
					result=cashOne.get(index).res;
					cashOne.set(index-1, cashOne.get(index));
					cashOne.add(index, (Virajenie) buf);	
			    }
				else {
					result=cashOne.get(index).res;
				}	
			}		
		numbers.clear();
		f.clear();
	//}
		return result;
}
}