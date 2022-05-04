package com.java.serialize;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//Serialization : Object to Byte Stream
class Game implements Serializable{
	int bullets;
	String Step;
	
	public Game(int bullets, String step) {
		super();
		this.bullets = bullets;
		Step = step;
	}

	@Override
	public String toString() {
		return "Game [bullets=" + bullets + ", Step=" + Step + "]";
	}
}
public class SerializationExample {
	public static void main(String[] args) throws IOException {
		
		//implements serializable
		Game game=new Game(3, "step-5");	
		
		
		//writeObject() method of ObjectOutputStream class
		File file=new File("C:\\Users\\Amol D\\Desktop\\MyFolder\\Game.txt");
		file.createNewFile();
		
		FileOutputStream fos=new FileOutputStream(file);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(game);
		
		oos.flush();
		oos.close();
		fos.flush();
		fos.close();
		System.out.println("Save Successfully - state of game");
	}
}
