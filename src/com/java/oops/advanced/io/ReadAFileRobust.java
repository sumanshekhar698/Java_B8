package com.java.oops.advanced.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadAFileRobust {

	public static void main(String[] args) {

		String path = "C:\\Users\\suman\\eclipse-workspace\\Java B8\\notes\\sampel.txt";
		File file = new File(path);

		if (file.exists()) {
			try (FileInputStream fis = new FileInputStream(path);) {
				int readChar = 0;
				while ((readChar = fis.read()) != -1) {
					System.out.print((char)readChar);

				}

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}

	}

}
