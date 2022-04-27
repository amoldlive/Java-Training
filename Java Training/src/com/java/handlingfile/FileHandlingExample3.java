package com.java.handlingfile;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandlingExample3 {
	public static void main(String[] args)  {

		// create a file
		String filePath="C:\\Users\\Amol D\\Desktop\\MyFolder\\MyFile.txt";
		File myFile = new File(filePath);
		
		//writter
		FileWriter fileWriter;
		
		try {
			//create a file if not exist
			if(!myFile.exists()) {
				myFile.createNewFile();
			}
			
			//by default false
			fileWriter=new FileWriter(myFile,true);
			
			for(int i=1;i<=10;i++) {
				fileWriter.write(i+" \t ");
			}
			fileWriter.write(" \n ");
			
			fileWriter.flush();
			fileWriter.close();
			System.out.println("Data written into file");
		}catch (IOException e) {
			System.out.println("Exception in file processing");
		}
		
	}
}
