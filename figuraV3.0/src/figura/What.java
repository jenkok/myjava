package figura;

public class What {	
	public static void whatWrite(String forma) {	
		UserIO user = new UserIO();
		boolean sravn1 = forma.equals("Q");	
		if (sravn1==true) {  					
			user.cir();				
		}
		 sravn1 = forma.equals("T");	
			if (sravn1==true) {  
				user.tr();
			}
			 sravn1 = forma.equals("4");	
				if (sravn1==true) {  
					user.qad();	
				}
				 sravn1 = forma.equals("P");	
					if (sravn1==true) {  
						user.pr();
					}					
	}
}