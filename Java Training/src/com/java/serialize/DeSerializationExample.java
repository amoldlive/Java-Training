package com.java.serialize;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DeSerializationExample {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		//Byte-stream to object
		File file=new File("C:\\Users\\Amol D\\Desktop\\MyFolder\\Game.txt");
		
		FileInputStream fis=new FileInputStream(file);
		ObjectInputStream ois=new ObjectInputStream(fis);

		Game gameState=(Game) ois.readObject();
		System.out.println("State Of My Game : "+gameState.toString());
		
		ois.close();
		fis.close();
		
	}
}
