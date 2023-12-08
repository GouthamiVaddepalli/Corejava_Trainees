package com.corejava.files;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterEx {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("sample4.txt");
		PrintWriter pw = new PrintWriter(fw);
		pw.println(100);
		pw.println(true);
		pw.println("Gouthami");
		pw.println("Anjali");
		pw.println('j');
		pw.flush();
		pw.close();
		fw.close();
		

	}

}
