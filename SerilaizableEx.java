package com.corejava.files;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerilaizableEx {

	public static void main(String[] args) throws IOException {
		Employee emp = new Employee(100, "Gouthami", 500000, "software engineer");

		FileOutputStream out = new FileOutputStream("employess.txt");
		ObjectOutputStream obj = new ObjectOutputStream(out);
		obj.writeObject(emp);

		System.out.println("employee saved sucuessfully");
	}

}
