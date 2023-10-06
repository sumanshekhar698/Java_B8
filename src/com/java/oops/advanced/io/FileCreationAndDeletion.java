package com.java.oops.advanced.io;

import java.io.File;
import java.io.IOException;

public class FileCreationAndDeletion {

	public static void main(String[] args)  {

		String path = "C:\\Users\\suman\\eclipse-workspace\\Java B8\\notes\\demo.txt";
		String path2 = "C:\\Users\\suman\\eclipse-workspace\\Java B8\\notes";

		File file = new File(path);
		
		
		File file2 = new File(path2);

		System.out.println(file.exists());
		if (file.exists()) {
			System.out.println("Path : " + file.getAbsolutePath());
			System.out.println("Name : " + file.getName());
			try {
				System.out.println("Name : " + file.getCanonicalPath());
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("R permission :" + file.canRead());
			System.out.println("W permission :" + file.canWrite());
			System.out.println("Size :" + file.getTotalSpace() + " bytes");
			System.out.println("Hidden :" + file.isHidden());
		} else {
			boolean createNewFile;
			try {
				createNewFile = file.createNewFile();
				System.out.println("File created ?" + createNewFile);

			} catch (IOException e) {
				e.printStackTrace();
			}
			
			
		}
		
//		boolean delete = file.delete();
//		System.out.println("Deleted : "+delete);
		

		System.out.println(file2.isDirectory());
	}

}
