package corejava;

public class NarrowingCastingEx {

	public static void main(String[] args) {
		float f = 25.5f;
		int i = (int)f;
		System.out.println(f);
		System.out.println(i);// narrowcastiing
		int a = 20050016;
		byte b = (byte)a; // lossy conversion
		System.out.println(a);
		System.out.println(b);

	}

}
