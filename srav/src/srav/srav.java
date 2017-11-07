package srav;

import java.util.Scanner;

public class srav {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Введите первую строку");
		String  n = in.nextLine();		
		System.out.println("введите вторую строку");
		String  f = in.nextLine();
		Boolean s = n.equals(f);
		if (s==true) {
			System.out.println("Строки одинаковы");	
		}
		else {
			System.out.println("Есть отличия");
		}
	}

}
