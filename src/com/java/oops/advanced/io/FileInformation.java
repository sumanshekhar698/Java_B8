package com.java.oops.advanced.io;

import java.io.File;
import java.io.IOException;

public class FileInformation {

	public static void main(String[] args) throws IOException {

		String path = "C:\\Users\\suman\\eclipse-workspace\\Java B8\\notes\\sampel.txt";
		String path2 = "C:\\Users\\suman\\eclipse-workspace\\Java B8\\notes";

		File file = new File(path);
		File file2 = new File(path2);

		System.out.println(file.exists());
		if (file.exists()) {
			System.out.println("Path : " + file.getAbsolutePath());
			System.out.println("Name : " + file.getName());
			System.out.println("Name : " + file.getCanonicalPath());
			System.out.println("R permission :" + file.canRead());
			System.out.println("W permission :" + file.canWrite());
			System.out.println("Size :" + file.getTotalSpace() + " bytes");
			System.out.println("Hidden :" + file.isHidden());
		}

		
		System.out.println(file2.isDirectory());
	}
	


}
