package corejava;

public class AddMethodEx {
	
	public int add(int a , int b) { // instance method/ default method
		return a+b;
		
		
	}

	public static void main(String[] args) {
		
		System.out.println("addition of 2 numbers");
		
		AddMethodEx method = new AddMethodEx();
		
	System.out.println(method.add(5, 10));
		
	
	System.out.println(method.add(10, 50));
	System.out.println(method.add(75, 125));
	
	System.out.println(method.add(85, 10));
	
	
	
	}

}
