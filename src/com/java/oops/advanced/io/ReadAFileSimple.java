package com.java.oops.advanced.io;

import java.io.File;
import java.util.Scanner;

public class ReadAFileSimple {

	public static void main(String[] args) {

		String path = "C:\\Users\\suman\\eclipse-workspace\\Java B8\\notes\\sampel.txt";
		File file = new File(path);

		int counter = 0;
		if (file.exists()) {
			try (Scanner sc = new Scanner(file);) {
				while (sc.hasNextLine()) {
					String line = sc.nextLine();
					System.out.println(line);
					++counter;

				}
				System.out.println(counter);

			} catch (Exception e) {
				// TODO: handle exception
			}
		} else {
			System.out.println("File not existing");
		}

	}

}
