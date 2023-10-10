package com.java.advance.io.serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class MainDeSerialization {

	public static void main(String[] args) {
		String path = "C:\\Users\\suman\\eclipse-workspace\\Java B8\\notes\\demo.txt";

		try (FileInputStream fis = new FileInputStream(path); ObjectInputStream ois = new ObjectInputStream(fis);) {
			Student st1 =(Student) ois.readObject();
			System.out.println(st1);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
