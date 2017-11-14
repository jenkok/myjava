package figura;

public class Triangle implements Ploshad{

	@Override
	public double s(double storonaA, double storonaB, double storonaC) {	
		double halfP = (storonaA+storonaB+storonaC)/2;		
		return Math.sqrt(halfP*(halfP-storonaA)*(halfP-storonaB)*(halfP-storonaC));
	}

	@Override
	public double p(double storonaA, double storonaB, double storonaC) {
		return storonaA+storonaB+storonaC;
	}

	@Override
	public void opros() {
		System.out.println("write first vertex (x,y)");
		String tr1 = in1.nextLine();
		String[] vertex1 = tr1.split(",");
		int x1=0;
		int y1=0;
		try {
	        x1 = Integer.parseInt(vertex1[0]);
	        y1 = Integer.parseInt(vertex1[1]);
		} 
		catch (NumberFormatException e) {  
	        System.err.println("Неверный формат строки!");  
	    }       
		    
		
		System.out.println("write poin of circle (x,y)");
		String tr2 = in1.nextLine();
		String[] vertex2 = tr2.split(",");
		int x2=0;
		int y2=0;
		try {
	        x2 = Integer.parseInt(vertex2[0]);
	        y2 = Integer.parseInt(vertex2[1]);
	    } catch (NumberFormatException e) {  
	        System.err.println("Неверный формат строки!");  
	    }  
	    
		System.out.println("write poin of circle (x,y)");
		String tr3 = in1.nextLine();
		String[] vertex3 = tr3.split(",");
		int x3=0;
		int y3=0;
		try {
	        x3 = Integer.parseInt(vertex3[0]);
	        y3 = Integer.parseInt(vertex3[1]);
	    } catch (NumberFormatException e) {  
	        System.err.println("Неверный формат строки!");  
	    }  
		
		double  stA =  Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
		double  stB =  Math.sqrt((x2-x3)*(x2-x3)+(y2-y3)*(y2-y3));
		double  stC =  Math.sqrt((x3-x1)*(x3-x1)+(y3-y1)*(y3-y1));
		System.out.println(stA); 
		System.out.println(stB); 
		System.out.println(stC); 
		
		System.out.println("ploshad="+s(stA, stB, stC)); 
		System.out.println("perimetr="+p(stA, stB, stC));
	}

}
