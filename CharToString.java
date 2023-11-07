package corejava;

public class CharToString {

	public static void main(String[] args) {
		char c = 'A';
		String s = "ab" + c; //conactination
		System.out.println(c);
		
		System.out.println(s);
		char c1 = '9';
		String s1 = Character.toString(c1); // toString()
		System.out.println(c1);
		System.out.println(s1);

	}

}
