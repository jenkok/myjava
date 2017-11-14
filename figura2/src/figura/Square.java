package figura;

public class Square  implements Ploshad{

	@Override
	public double s(double storonaA, double storonaB, double storonaC) {	
		return storonaA*storonaA;
	}

	@Override
	public double p(double storonaA, double storonaB, double storonaC) {
		
		return storonaA*4;
	}

	@Override
	public void opros() {
		System.out.println("write first point of side (x,y)");
		String square1 = in1.nextLine();
		String[] side1 = square1.split(",");
		int x1=0;
		int y1=0;
		try {
	        x1 = Integer.parseInt(side1[0]);
	        y1 = Integer.parseInt(side1[1]);
		} 
		catch (NumberFormatException e) {  
	        System.err.println("Неверный формат строки!");  
	    }       
		    
		
		System.out.println("write poin of side (x,y)");
		String square2 = in1.nextLine();
		String[] side2 = square2.split(",");
		int x2=0;
		int y2=0;
		try {
	        x2 = Integer.parseInt(side2[0]);
	        y2 = Integer.parseInt(side2[1]);
	    } catch (NumberFormatException e) {  
	        System.err.println("Неверный формат строки!");  
	    }
		
		double  r = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
		
		System.out.println("ploshad="+s(r, 0, 0)); 
		System.out.println("perimetr="+p(r, 0, 0));
		
	}

}
