package figura;

public class Square  implements Ploshad{

	@Override
	public int s(int storonaA, int storonaB, int storonaC) {		
		return storonaA*storonaA;
	}

	@Override
	public int p(int storonaA, int storonaB, int storonaC) {
		
		return storonaA*4;
	}

	@Override
	public void opros() {
		System.out.println("write storonu kvadrata");
		String storona = in1.nextLine();
		int r=0;
		try {
	        r = Integer.parseInt(storona);	       
	    } catch (NumberFormatException e) {  
	        System.err.println("Неверный формат строки!");  
	    }       
		System.out.println("ploshad="+s(r, 0, 0)); 
		System.out.println("perimetr="+p(r, 0, 0));
		
	}

}
