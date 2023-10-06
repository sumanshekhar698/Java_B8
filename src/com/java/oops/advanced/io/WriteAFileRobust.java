package com.java.oops.advanced.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteAFileRobust {

	public static void main(String[] args) {

		String path = "C:\\Users\\suman\\eclipse-workspace\\Java B8\\notes\\sampel.txt";
		File file = new File(path);
		
		String msg = "Today is Big Billion day \n !!!";


		if (file.exists()) {
			try (FileOutputStream fos = new FileOutputStream(path);) {
				fos.write(msg.getBytes());
				
			} catch (IOException e) {
				e.printStackTrace();
			} 
		} else {
			System.out.println("File not existing");
		}

	}

}
