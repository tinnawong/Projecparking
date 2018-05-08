package project.java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIO {
	
	static String checkIn=null;
	
	public static void writerCheckin () {
		String today="12/5/2561|12:28";
		String thisyear="2018";
		String id="1234";
		String license="gt 238";
		String no="0001";
		
		
		String nameFile = "check in "+thisyear;
		String path = "D:/code/Project/";
		String qc = nameFile+".txt";
		
		File f = new File(path+nameFile+".txt");
		
		
		System.out.println(f.getName());
		if(f.canExecute()) {
			
			System.out.println("OK");
			try {
				FileWriter w = new FileWriter(f,true);
				BufferedWriter br = new BufferedWriter(w);
				br.append(""+no+"|"+id+"|"+license+"|"+today+"|"+"-1");
				br.newLine();
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
				
				br.append(""+no+"|"+id+"|"+license+"|"+today+"|"+"-1");
				br.newLine();
				br.close();
				
				System.out.println("write complate.");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	}
	
	public static void showcheck () {
		
	}
	
	
	public static void writerCheckout () {
		String today="12/5/2561|12:28";
		String id="1234";
		String license="gt 238";
		String no="0001";
		
		String nameFile = "check out 5-5-2561";
		String path = "D:/code/Project/";
		String qc = nameFile+".txt";
		
		File f = new File(path+nameFile+".txt");
		
		
		System.out.println(f.getName());
		if(f.canExecute()) {
			
			System.out.println("OK");
			try {
				FileWriter w = new FileWriter(f,true);
				BufferedWriter br = new BufferedWriter(w);
				br.append(""+no+"|"+id+"|"+license+"|"+today+"|"+"-1");
				br.newLine();
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
				
				br.append(""+no+"|"+id+"|"+license+"|"+today+"|"+"-1");
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
