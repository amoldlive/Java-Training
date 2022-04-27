package com.java.handlingfile;

import java.io.File;
import java.io.IOException;

public class FileHandlingExample2 {
	public static void main(String[] args) {

		// create a file
		String filePath="C:\\Users\\Amol D\\Desktop\\MyFolder\\MyFile.txt";
		File myFile = new File(filePath);
		
		//file is present or not
		System.out.println("is File Present : "+myFile.exists());
		
		//file name
		System.out.println("File Name : "+myFile.getName());
		
		//file path
		System.out.println("File Path : "+myFile.getAbsolutePath());
		
		//file readable
		System.out.println("is File readable : "+myFile.canRead());
		
		//file writable
		System.out.println("is File Writable : "+myFile.canWrite());
			
		

	}
}
