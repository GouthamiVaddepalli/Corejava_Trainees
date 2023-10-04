package corejava;

public class VariableEx {

	static String city = "hyd"; // static global variable

	long contact = 98542123555L; // instance

	public static void main(String[] args) {

		String name = "anjali"; // local variables

		char gender = 'f';

		int age = 25;

		System.out.println(name);
		
		System.out.println(gender);

		System.out.println(age); // printing the local variables

		System.out.println(VariableEx.city); // accessing static variable

		VariableEx obj = new VariableEx(); // creating an object

		System.out.println(obj.contact); // accessing the instance properties

	}

}
