import java.util.Scanner;

public class sum {
	public static void main (String [] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("введите х");
		boolean h = in.hasNextInt(); 
	    if (h==true) {
	    	int x = in.nextInt();		
	    	System.out.println("введите y");
	    	h = in.hasNextInt(); 	
	    	if (h==true) {		    	
	    		int y = in.nextInt();
	    		int z = x+y;
	    		System.out.println("x+y="+z);
	    	}
	    	else{
		    	System.out.println("WTF?!1&");
		    }
	    }	
	    else{
	    	System.out.println("Это же не число!?%*?№@");
	    }
	}	
}

