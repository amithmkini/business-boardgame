package com.it306.test;

/**
 * This class is under testing. This class is used to create the
 * cells and assign them to their respective cells.
 * 
 * @author Amith Kini
 */

import java.io.*;
import java.util.ArrayList;

public class CellBuilder {
	
	String filename = "class.txt";
	public ArrayList<Object> cellList = new ArrayList<Object>();
	
	public ArrayList<Object> read() {
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
		
		
		return cellList;
	}
}
