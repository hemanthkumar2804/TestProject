package ConstructorsinJava;

public class ConstructorTestB extends ConstructorTestA {

	public ConstructorTestB() {
		super();
		// System.out.println("Child class Constructor");
	}

	public ConstructorTestB(int a) {
		super("hemanth");
		// System.out.println("One Child parameter constructos");

	}

	public ConstructorTestB(String name, int age) {
		super("Chirasmi", 2);

	}

	public static void main(String[] args) {
		ConstructorTestB obj = new ConstructorTestB();
		ConstructorTestB obj1 = new ConstructorTestB(10);
		ConstructorTestB obj2 = new ConstructorTestB("Sham", 28);

	}

}
