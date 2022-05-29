package com.java.filehandling;

import java.io.File;
import java.io.IOException;

public class FileHandlingExample7 {
	public static void main(String[] args) throws IOException {

		String filePath="C:\\Users\\Amol D\\Desktop\\MyFolder\\Old\\Contact Details.txt";
		File file =new File(filePath);
		
		if(file.exists()) {
			//delete the file
			//true/false
			//file deleted -true else false
			boolean status=file.delete();
			System.out.println("is File Deleted : "+status);
		}else {
			System.out.println("File Not Found At Location");
		}
		
	}
}
