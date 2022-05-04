package com.java.filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileHandlingExample6 {
	public static void main(String[] args) throws IOException {

		String oldFilePath = "C:\\Users\\Amol D\\Desktop\\MyFolder\\Old\\Contact Details.txt";
		String newFilePath = "C:\\Users\\Amol D\\Desktop\\MyFolder\\New\\Contact Details.txt";
		
		File  oldFile=new File(oldFilePath);
		File  newFile=new File(newFilePath);
		
		FileWriter fileWriter=new FileWriter(newFile);
		
		if(oldFile.exists()) {
			//file read -- old folder
			
			if(!newFile.exists()) {
				newFile.createNewFile();
			}
			
			Scanner scanner=new Scanner(oldFile);
			
			while(scanner.hasNextLine()) {
				fileWriter.write(scanner.nextLine());
				fileWriter.write("\n");
			}
			
			scanner.close();
		}else {
			System.out.println("File Not Fount At Location");
		}
		
		fileWriter.flush();
		fileWriter.close();
		System.out.println("New File Created Successfully");
			
	}
}
