package com.scahill2_test;

import java.io.IOException;
import java.nio.file.*;
import java.util.List;
public class example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		MyClass mc = new MyClass();
		mc.myMethod();
		
		try {
			loadFile("file.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e);
		}
		

	}

	static void loadFile(String fileName) throws IOException {
		Path file = FileSystems.getDefault().getPath("./", fileName);
		List<String> lines = Files.readAllLines(file);
		/*
		for (int i =0; i<lines.size();i++) {
			System.out.println(lines.get(i));
		}*/
		
		//lines.forEach((str)->System.out.println(str));
		
		lines.forEach(System.out::println);
	}
}
