package figura;

public class Rectangle implements Ploshad {

	@Override
	public int s(int storonaA, int storonaB, int storonaC) {
		
		return (int) (storonaA*storonaB*P);
	}

	@Override
	public int p(int storonaA, int storonaB, int storonaC) {
		return storonaA+storonaB;
	}

	@Override
	public void opros() {
		System.out.println("write length");
		String l = in1.nextLine();
		int length =0;
		try {
			length = Integer.parseInt(l);	       
	    } catch (NumberFormatException e) {  
	        System.err.println("Неверный формат строки!");  
	    }       
		System.out.println("write width");
		String w = in1.nextLine();
		int width=0;
		try {
			width = Integer.parseInt(w);	       
	    } catch (NumberFormatException e) {  
	        System.err.println("Неверный формат строки!");  
	    }       
		System.out.println("ploshad="+s(length, width, 0)); 
		System.out.println("perimetr="+p(length, width, 0));
		
	}
	

}
