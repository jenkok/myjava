package figura;
import java.util.Scanner;
public class Figura {
	public static void main(String[] args) {
		while(true) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter the name of the shape");
		System.out.println("Q for circle");
		System.out.println("T for triangle");
		System.out.println("4 for square");
		System.out.println("P for rectangle");
		String  forma = in.nextLine();		
			What.whatWrite(forma);
		
	     }
	}
}


