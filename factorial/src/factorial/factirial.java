package factorial;

import java.util.Scanner;

public class factirial {
	public static void main (String [] args) {
		    Scanner in = new Scanner(System.in);
		    System.out.println("������� ����� n");
		    boolean h = in.hasNextInt(); 
		    if (h==true) {
		    	int n = in.nextInt();
		    	Factorial fact = new Factorial();
		    	System.out.println(fact.factorial(n));
		    }
		    else {
		    System.out.println("��� �� �����");
		    }
	}
}


