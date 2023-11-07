package corejava;

public class CommandlineArgsEx {

	public static void main(String[] args) {//10 20 Gouthami 2.5 true
		
       int i = Integer.parseInt(args[0]);
       int j = Integer.parseInt(args[1]);
       int sum = i + j;
       
       String name = args[2];
       float f = Float.parseFloat(args[3]);
       boolean b = Boolean.parseBoolean(args[4]);
       
       System.out.println("addition of number : "  + sum);
       System.out.println("name is : " + name);
       System.out.println("float is " + f);
       System.out.println("Bollean value is : " + b);
	}

}
