package com.java.filehandling;

import java.io.File;
import java.io.IOException;

public class FileHandlingExample1 {
	public static void main(String[] args) {

		// create a file
		String filePath="C:\\Users\\Amol D\\Desktop\\MyFolder\\MyFile.txt";
		File myFile = new File(filePath);
		try {
			// true / false
			boolean isFileCreated = myFile.createNewFile();
			if (isFileCreated) {
				System.out.println("New file is created....");
			} else {
				System.out.println("File is already present at location..");
			}
		} catch (IOException e) {
			System.out.println("Exception while creating new file "+e);
		}

	}
}
