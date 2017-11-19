package figura;

public class uncoder {
	
	public double storA;
	public double storB;
	public double storC;
	int x1;
	int y1;
	int x2,x3;
	int y2,y3;
	int f=0;
	
	public void uncod1 (String str) {
		switch (f) {
		case 0:
	String[] centr = str.split(",");
		try {
			x1 = Integer.parseInt(centr[0]);
			y1 = Integer.parseInt(centr[1]);
		} 
		catch (NumberFormatException e) {  
			System.err.println("Неверный формат строки!");  
		}
			f++;
			break;
		case 1: 
			String[] centr2 = str.split(",");
			try {
				x2 = Integer.parseInt(centr2[0]);
				y2 = Integer.parseInt(centr2[1]);
			} 
			catch (NumberFormatException e) {  
				System.err.println("Неверный формат строки!");
			}
				f=0;
				storA = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
				break;		
			}
		}


	public void uncod2 (String str) {
		switch (f) {
		case 0:
	String[] centr = str.split(",");
		try {
			x1 = Integer.parseInt(centr[0]);
			y1 = Integer.parseInt(centr[1]);
		} 
		catch (NumberFormatException e) {  
			System.err.println("Неверный формат строки!");  
		}
			f++;
			break;
		case 1: 
			String[] centr2 = str.split(",");
			try {
				x2 = Integer.parseInt(centr2[0]);
				y2 = Integer.parseInt(centr2[1]);
			} 
			catch (NumberFormatException e) {  
				System.err.println("Неверный формат строки!");
			}
				f++;
				storA = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
				break;
		case 2: 
			String[] centr3 = str.split(",");
			try {
				x3 = Integer.parseInt(centr3[0]);
				y3 = Integer.parseInt(centr3[1]);
			} 
			catch (NumberFormatException e) {  
				System.err.println("Неверный формат строки!");
			}
				f=0;
				storB = Math.sqrt((x2-x3)*(x2-x3)+(y2-y3)*(y2-y3));
				storC = Math.sqrt((x3-x1)*(x3-x1)+(y3-y1)*(y3-y1));
				break;
		}	
	}
}
