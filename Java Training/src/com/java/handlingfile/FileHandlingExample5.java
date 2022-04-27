package com.java.handlingfile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileHandlingExample5 {
	public static void main(String[] args) throws IOException  {
		
		String filePath="C:\\Users\\Amol D\\Desktop\\MyFolder\\Contact Details.txt";
		File file=new File(filePath);
		
		if(file.exists()) {
			Scanner scanner=new Scanner(file);
			while(scanner.hasNextLine()) {
				System.out.println(scanner.nextLine());
			}
		}else {
			System.out.println("File Not Found At Location");
		}
	}
}
