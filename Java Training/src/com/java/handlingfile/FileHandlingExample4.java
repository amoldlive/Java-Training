package com.java.handlingfile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileHandlingExample4 {
	public static void main(String[] args) throws IOException  {
		
		String filePath="C:\\Users\\Amol D\\Desktop\\MyFolder\\Contact Details.txt";
		File file=new File(filePath);
		
		if(file.exists()) {
			char[] data=new char[1000];
			FileReader fileReader=new FileReader(file);
			fileReader.read(data);
			
			System.out.println(data);
		}else {
			System.out.println("File Not Found At Location");
		}
	}
}
