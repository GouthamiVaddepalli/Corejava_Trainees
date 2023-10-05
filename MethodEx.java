package corejava;

public class MethodEx {

	public void displayMsg() { // instance method /deafult method

		System.out.println("this is display msg");

	}

	public void show(String name, float marks) { // instance parameterrized method

		System.out.println("this is show of method");

		System.out.println("marks : " + "  " + name + "  " + marks);

	}

	public static String sayHello() {
		return "Hello"; // static method

	}

	public static void main(String[] args) {

		MethodEx obj = new MethodEx();

		obj.displayMsg();
		obj.show("anjali", 96.5f);

		System.out.println(MethodEx.sayHello());

	}

}
