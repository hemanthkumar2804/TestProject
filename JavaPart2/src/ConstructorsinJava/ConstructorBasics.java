package ConstructorsinJava;

public class ConstructorBasics {
	String name;
	int age;
	
	public ConstructorBasics() {
		System.out.println("Zero parameters constructor");
	}
	public ConstructorBasics(int a) {
		System.out.println("One Parameter constructor");
		System.out.println(a);
	}
	public ConstructorBasics(int a, int b) {
		System.out.println("Two parameter constructor");
		System.out.println(a +" "+ b);
	}
	public ConstructorBasics(String name,int age) {
		this.name=name;//this.class variable=local variable
		this.age=age;//this.class variable=local variable
		System.out.println(name +" "+ age);
	}

	public static void main(String[] args) {
		ConstructorBasics obj= new ConstructorBasics();
		ConstructorBasics obj1 =new ConstructorBasics(10);
		ConstructorBasics obj2 =new ConstructorBasics(10,20);
		ConstructorBasics obj3=new ConstructorBasics("Hemanth",36);
		System.out.println(obj3.name +" "+ obj3.age);
		
		

	}

}
