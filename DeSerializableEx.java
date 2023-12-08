package com.corejava.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializableEx {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream out = new FileInputStream("employess.txt");
		ObjectInputStream obj = new ObjectInputStream(out);
		Employee emp = (Employee) obj.readObject();
		System.out.println(emp);
	}

}
