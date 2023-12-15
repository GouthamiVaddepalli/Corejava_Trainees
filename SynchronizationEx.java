package com.corejava.threads;

class First {

	public  synchronized void display(String msg) throws InterruptedException {

		System.out.print("[ " + msg);
		

			Thread.sleep(3000);

		
		System.out.println("]");

	}

}

class Second extends Thread {

	String msg;
	First fobj; // has - a realationship

	Second(First fobj, String msg) {

		this.fobj = fobj;
		this.msg = msg;
		this.start();
	}

	public void run() {
		try {
			fobj.display(msg);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

public class SynchronizationEx {

	public static void main(String[] args) throws InterruptedException {

		First fnew = new First();

		Second ss = new Second(fnew, "Welcome");
		
			ss.join();
		
		Second ss1 = new Second(fnew, "New");
		   ss1.join();
		Second ss2 = new Second(fnew, "Java Programmer ");

	}
}
