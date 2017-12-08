package Klkwc;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;


public class Log {
	private static int i;
	private static int j=0;	
	private static FileWriter writer;	
	public static void file (String f, int s) {
		// создаем объекты для файлов, которые находятся в каталоге
		File file1 = new File("C:\\Users\\1\\eclipse-workspace\\KLCwithcashe", "log.txt");
		i=i+s;
		System.out.println(i);
		try {
			writer = new FileWriter(file1, true);
		    writer.write("\n"+f);   
		    writer.close();
		
		    if (i==9) {
				String n="log"+Integer.toString(j)+".txt";	
				File f1 = new File("C:\\Users\\1\\eclipse-workspace\\KLCwithcashe", n);
				file1.renameTo(f1);
				j=j+1;
				i=0;
			}
		    
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
		
		
}


