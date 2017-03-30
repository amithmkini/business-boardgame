package com.it306.test;

import java.io.*;

public class CellBuilder {
	
	String filename = "class.txt";
	
	public void CellBulider() {
		
	}
	
	public void read() {
		String line = null;
		try {
			FileReader filer = new FileReader(filename);
			BufferedReader bReader = new BufferedReader(filer);
			
			while ((line=bReader.readLine()) != null) {
				System.out.println(line);
			}
			bReader.close();
		} catch (FileNotFoundException ex) {
			System.out.println("Unable to open!");
		} catch (IOException ex) {
			System.out.println("Error!");
		}
	}
}
