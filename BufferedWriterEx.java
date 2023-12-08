package com.corejava.files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterEx {

	public static void main(String[] args) throws IOException {
		FileWriter  fw = new FileWriter("sample3.txt");
		BufferedWriter bw  = new BufferedWriter(fw);
		bw.write(100);
		bw.newLine();
		bw.write('G');
		bw.newLine();
		bw.write("Anjali");
		bw.newLine();
		char ch[] = {'c','d' ,'f'};
		bw.write(ch);
		bw.flush();
		bw.close();
		fw.close();
	}

}
