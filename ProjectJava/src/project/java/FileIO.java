package project.java;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileIO {
	
	public static void IO() {
		String nameFile = "5-5-2561";
		String path = "D:/code/Project/";
		String qc = nameFile+".txt";
		
		File f = new File(path+nameFile+".txt");
		System.out.println(f.getName());
		if(f.canExecute()) {
			
			System.out.println("OK");
			try {
				FileWriter w = new FileWriter(f,true);
				BufferedWriter br = new BufferedWriter(w);
				br.newLine();
				br.append("testtttt2");
				
				br.close();
				
				System.out.println("write complate.2");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else {
			try {
				FileWriter w = new FileWriter(f);
				BufferedWriter br = new BufferedWriter(w);
				
				br.append("hello word.");
				br.newLine();
				br.close();
				
				System.out.println("write complate.");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	}
}
