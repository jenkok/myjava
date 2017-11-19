package figura;

public class Proverka {
	
	
	Circle o = new Circle ();
	
	
	public static boolean povCirc(Object obj) {
		boolean res=false;
		Object [] pr = new Object  [100];	
		for ( int i=0; i<100; i++) {
			if(pr[i]==null) {
				pr [i] = obj;	
				System.out.println(i);
				break;
			}
			else {
				i++;
			}
			
		/*int has = pr[i].hashCode();
		System.out.println(i);	
		for (int j=0; j<i;) {
				boolean tr = o.equals(pr[j]);			
				if (tr==true) {
				res = true;
				}
				System.out.println(i);
			}
			System.out.println(i);	*/
		}
		return res;
    }
}	


	
