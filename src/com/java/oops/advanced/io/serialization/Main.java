package com.java.oops.advanced.io.serialization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) {

		String uniName = "Delhi University";
		Student.universityName = uniName;

		String path = "C:\\Users\\suman\\eclipse-workspace\\Java B8\\notes\\student.txt";

		File file = new File(path);
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		Student student = new Student(78, "Balwinder Singh", 790);
		System.out.println(student);
		student.readuniversityName();

		if (file.exists()) {
			try (FileOutputStream fos = new FileOutputStream(path);
					ObjectOutputStream oos = new ObjectOutputStream(fos);) {
				oos.writeObject(student);
				oos.flush();

			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("File not existing");
		}

	}

}
