package com.corejava.files;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("sample1.txt");

		fw.write(98);
		fw.write("Gouthami \n Anjali");
		fw.write("\n");
		char ch[] = { 'a', 'b', 'c' };
		fw.write(ch);
		fw.write("\n");
		fw.flush();
		fw.close();
	}

}
