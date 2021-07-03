package JavaPart2;

public class StaticandNonStatic {

	// Non Static Variable
	int a = 10;
	// Static Variable
	static int b = 20;

	public static void main(String[] args) {
		// How access static variables and methods
		// 1. Directly by name
		System.out.println(b);
		div(20, 10);
		// 2. Calling by classname
		System.out.println(StaticandNonStatic.b);
		StaticandNonStatic.div(40, 10);

		// How to access NonStatic methods
		// By Creating Objects
		StaticandNonStatic obj = new StaticandNonStatic();
		System.out.println(obj.a);
		obj.sum(10, 20);

	}

	// Non static method
	public void sum(int x, int y) {
		System.out.println("--Non Static Method--");
		int z = x + y;
		System.out.println("Add of tow number is: " + z);
	}

	// Static Method
	public static void div(int c, int d) {
		System.out.println("--Static Method--");
		int e = c / d;
		System.out.println("Div of two number is: " + e);

	}

}
