package Clc;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


    public class Cashe   {
	int i=0;
	private FileWriter writer;	
	public void file (String f) {
		// создаем объекты для файлов, которые находятся в каталоге
		File file1 = new File("C:\\Users\\1\\eclipse-workspace\\Calculate", "log.txt");
		i++;
		try {
			writer = new FileWriter(file1, true);
		    writer.write(f);
		    writer.append('\n');
		    if (i==3) {
		    	 writer.write("text");
		    }
		    
		    writer.flush();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
