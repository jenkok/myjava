package figura;

import java.util.Scanner;


public class UserIO {
	Scanner in = new Scanner(System.in);
	boolean rezz;	
	public int i;
	public void cir() {
		Circle circle = new Circle ();
		//Proverka prov = new Proverka ();
		System.out.println("write first point (x,y)");
		String radius = in.nextLine();		
		uncoder code = new uncoder();
	    code.uncod1(radius);
		System.out.println("write second point");
		String radiusp = in.nextLine();
		code.uncod1(radiusp);
		circle.storonaA=code.storA;
		System.out.println(circle.hashCode());
		rezz=Proverka.povCirc(circle);
		System.out.println(rezz);
		//if (rezz==true) {
		//	System.out.println("this is copy past");
		//}
		System.out.println(circle.s());
		//System.out.println(circle.p());
	}
	public void qad() {
		Square sq = new Square ();
		System.out.println("write first point (x,y)");
		String radius = in.nextLine();		
		uncoder code = new uncoder();
	    code.uncod1(radius);
		System.out.println("write second point");
		String radiusp = in.nextLine();
		code.uncod1(radiusp);
		sq.storonaA=code.storA;
		System.out.println(sq.s());
		System.out.println(sq.p());
	}
	public void tr() {
		Triangle tri = new Triangle ();
		uncoder code = new uncoder();
		System.out.println("write first point (x,y)");
		String versh = in.nextLine();		
	    code.uncod2(versh);
		System.out.println("write second point");
		String versh2 = in.nextLine();
		code.uncod2(versh2);
		System.out.println("write third point");
		String versh3 = in.nextLine();
		code.uncod2(versh3);
		tri.storonaA=code.storA;
		tri.storonaB=code.storB;
		tri.storonaC=code.storC;
		System.out.println(tri.s());
		System.out.println(tri.p());
	}
	public void pr() {
		Rectangle prm = new Rectangle ();
		uncoder code = new uncoder();
		System.out.println("write first point (x,y)");
		String versh = in.nextLine();		
	    code.uncod2(versh);
		System.out.println("write second point");
		String versh2 = in.nextLine();
		code.uncod2(versh2);
		System.out.println("write third point");
		String versh3 = in.nextLine();
		code.uncod2(versh3);
		prm.storonaA=code.storA;
		prm.storonaB=code.storB;
		prm.storonaC=code.storC;
		System.out.println(prm.s());
		System.out.println(prm.p());
		if (prm.ninty()==false) {
			System.out.println("this is not rectangle");
		}
	}
}