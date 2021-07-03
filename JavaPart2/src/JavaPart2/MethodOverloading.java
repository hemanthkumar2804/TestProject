package JavaPart2;

public class MethodOverloading {

	public static void main(String[] args) {
		// Method Overloading: With same method name and different input parameters or
		// arguments
		// We can write method inside method
		// we can overload main method

		MethodOverloading obj = new MethodOverloading();
		obj.add();
		obj.add(10);
		obj.add(20, 5);
		obj.add("Chirasmi Hemanth");

	}

	public void add() {
		System.out.println("--Zero Parameters--");
	}

	public void add(int a) {
		System.out.println("--One Parameters--");
		System.out.println(a);
	}

	public void add(int b, int c) {
		System.out.println("--Two Parameters--");
		System.out.println(b + c);
	}

	public void add(String s) {
		System.out.println("--One Parameter with diffrent data type--");
		System.out.println(s);
	}

	public static void main(int a) {

	}

	public static void main(int x, int y) {

	}

}
