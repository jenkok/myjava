package figura;

public class Circle  implements Ploshad{

	
	@Override
	public double s(double storonaA, double storonaB, double storonaC) {
		
		return (storonaA*storonaA*P);
	}

	@Override
	public double p(double storonaA, double storonaB, double storonaC) {
		return (2*storonaA*P);
	}

	@Override
	public void opros() {
		System.out.println("write centr of circle (x,y)");
		String radius = in1.nextLine();
		String[] centr = radius.split(",");
		int x1=0;
		int y1=0;
		try {
	        x1 = Integer.parseInt(centr[0]);
	        y1 = Integer.parseInt(centr[1]);
		} 
		catch (NumberFormatException e) {  
	        System.err.println("Неверный формат строки!");  
	    }       
		    
		
		System.out.println("write poin of circle (x,y)");
		String radiusp = in1.nextLine();
		String[] point = radiusp.split(",");
		int x2=0;
		int y2=0;
		try {
	        x2 = Integer.parseInt(point[0]);
	        y2 = Integer.parseInt(point[1]);
	    } catch (NumberFormatException e) {  
	        System.err.println("Неверный формат строки!");  
	    }       
		
		double r = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
		
		System.out.println("ploshad="+s(r, 0, 0)); 
		System.out.println("perimetr="+p(r, 0, 0));
	}

}
