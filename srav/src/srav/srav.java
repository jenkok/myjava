package srav;

import java.util.Scanner;

public class srav {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("������� ������ ������");
		String  n = in.nextLine();		
		System.out.println("������� ������ ������");
		String  f = in.nextLine();
		Boolean s = n.equals(f);
		if (s==true) {
			System.out.println("������ ���������");	
		}
		else {
			System.out.println("���� �������");
		}
	}

}
