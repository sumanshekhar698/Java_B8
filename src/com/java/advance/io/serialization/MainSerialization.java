package com.java.advance.io.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class MainSerialization {

	public static void main(String[] args) {
		String path = "C:\\Users\\suman\\eclipse-workspace\\Java B8\\notes\\demo.txt";

		Student s1 = new Student(8737, 1, "Tim Horton");
		System.out.println(s1);
		Student.uniName = "DU";

		try (FileOutputStream fos = new FileOutputStream(path); ObjectOutputStream oos = new ObjectOutputStream(fos);) {

			oos.writeObject(s1);
			oos.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
