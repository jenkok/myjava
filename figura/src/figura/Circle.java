package figura;

public class Circle  implements Ploshad{

	
	@Override
	public int s(int storonaA, int storonaB, int storonaC) {
		
		return (int) (storonaA*storonaA*P);
	}

	@Override
	public int p(int storonaA, int storonaB, int storonaC) {
		// TODO Auto-generated method stub
		return (int) (2*storonaA*P);
	}

	@Override
	public void opros() {
		System.out.println("write r");
		String radius = in1.nextLine();
		int r=0;
		try {
	        r = Integer.parseInt(radius);	       
	    } catch (NumberFormatException e) {  
	        System.err.println("Неверный формат строки!");  
	    }       
		System.out.println("ploshad="+s(r, 0, 0)); 
		System.out.println("perimetr="+p(r, 0, 0));
	}

}
