package JavaPart2;

public class methods {

	public static void main(String[] args) {
		methods obj = new methods();
		obj.test01();
		System.out.println("Addtion of two number is: " + obj.test02());
		System.out.println("String Value is: " + obj.test03());
		System.out.println("Division of two numbers is " + obj.test04(40, 10));

	}

	// No Input and No Output
	public void test01() {
		System.out.println("---Test01Method--");
	}

	// with No Input and with some output
	public int test02() {
		System.out.println("---Test02Method");
		int a = 10;
		int b = 20;
		int add = a + b;
		return add;
	}

	// with No Input and some output
	public String test03() {
		System.out.println("---Test03Method");
		String s = "Chirasmi Hemanth";
		return s;
	}

	public int test04(int x, int y) {
		System.out.println("---Test04Method");
		int z = x / y;
		return z;
	}

}
