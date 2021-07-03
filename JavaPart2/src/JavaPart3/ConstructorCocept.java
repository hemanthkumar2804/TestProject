package JavaPart3;

public class ConstructorCocept {
	String name;
	int age;

	public ConstructorCocept() {
		System.out.println("Default Constructor");
	}

	public ConstructorCocept(int i) {
		System.out.println("One Parameter Constructor");
		System.out.println(i);

	}

	public ConstructorCocept(int i, int j) {
		System.out.println("Two Parameter Constructor");
		System.out.println("Values of i and j is: " + i + " & " + j);

	}

	public ConstructorCocept(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public static void main(String[] args) {
		ConstructorCocept obj = new ConstructorCocept();
		ConstructorCocept obj1 = new ConstructorCocept(10);
		ConstructorCocept obj2 = new ConstructorCocept(10, 20);
		ConstructorCocept obj3 = new ConstructorCocept("Chirasmi Hemanth", 2);
		System.out.println("Name : " + obj3.name + " Age : " + obj3.age);
		

	}

}
