package figura;

public class What {	
	public static void whatWrite(String forma) {	
		boolean sravn1 = forma.equals("Q");	
		if (sravn1==true) {  
			Circle circle = new Circle ();
			circle.opros();
		}
		 sravn1 = forma.equals("T");	
			if (sravn1==true) {  
				Triangle tirangle = new Triangle ();
				tirangle.opros();
			}
			 sravn1 = forma.equals("4");	
				if (sravn1==true) {  
					Square square = new Square();
					square.opros();
				}
				 sravn1 = forma.equals("P");	
					if (sravn1==true) {  
						Rectangle rectangle = new Rectangle ();
						rectangle.opros();
					}					
	}
}