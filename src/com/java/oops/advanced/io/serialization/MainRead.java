package com.java.oops.advanced.io.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class MainRead {

	public static void main(String[] args) {

		String path = "C:\\Users\\suman\\eclipse-workspace\\Java B8\\notes\\student.txt";

		File file = new File(path);
		if (!file.exists()) {
			System.out.println("File not existing");
			return;
		}

		if (file.exists()) {
			try (FileInputStream fis = new FileInputStream(path); ObjectInputStream ois = new ObjectInputStream(fis);) {

				Student s = (Student) ois.readObject();
				System.out.println(s);
				s.readuniversityName();

			} catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("File not existing");
		}

	}

}
