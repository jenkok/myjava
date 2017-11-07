package stroka;
import java.util.Scanner;

public class stroka {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("¬ведите строку");
		String  n = in.nextLine();
		char[] str = n.toCharArray();		  
		for(int i = str.length-1 ; i>=0; i--){
			System.out.print(str[i]);
		}	  
	}
}
