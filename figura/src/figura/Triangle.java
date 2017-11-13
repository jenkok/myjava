package figura;

public class Triangle implements Ploshad{

	@Override
	public int s(int storonaA, int storonaB, int storonaC) {
		int halfP=(storonaA+storonaB+storonaC)/2;		
		return (int) Math.sqrt(halfP*(halfP-storonaA)*(halfP-storonaB)*(halfP-storonaC));
	}

	@Override
	public int p(int storonaA, int storonaB, int storonaC) {
		return storonaA+storonaB+storonaC;
	}

	@Override
	public void opros() {
		System.out.println("write storona A");
		String stor1 = in1.nextLine();
		int stA=0;
		try {
			stA = Integer.parseInt(stor1);	        
	    } catch (NumberFormatException e) {  
	        System.err.println("Неверный формат строки!");  
	    }       
		System.out.println("write storona B");
		String stor2 = in1.nextLine();
		int stB=0;
		try {
			stB = Integer.parseInt(stor2);	       
	    } catch (NumberFormatException e) {  
	        System.err.println("Неверный формат строки!");  
	    }      
		System.out.println("write storonaA");
		String stor3 = in1.nextLine();
		int stC=0;
		try {
			stA = Integer.parseInt(stor3);	          
	    } catch (NumberFormatException e) {  
	        System.err.println("Неверный формат строки!");  
	    }      	
		System.out.println("ploshad="+s(stA, stB, stC)); 
		System.out.println("perimetr="+p(stA, stB, stC));
	}

}
