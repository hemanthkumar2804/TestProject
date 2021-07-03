package JavaPart3;

public class ConstructoreforCar {
	String name;
	int price;
	String engine;

	public ConstructoreforCar(String name, int price, String engine) {
		this.name = name;
		this.price = price;
		this.engine = engine;

	}

	public static void main(String[] args) {

		ConstructoreforCar obj = new ConstructoreforCar("BMW", 900000, "Automatic");
		ConstructoreforCar obj1 = new ConstructoreforCar("Tata", 800000, "Automatic");
		ConstructoreforCar obj2 = new ConstructoreforCar("Maruthi", 700000, "Automatic");
		ConstructoreforCar obj3 = new ConstructoreforCar("Honda", 600000, "Automatic");
		System.out.println(obj.name + " " + obj.price + " " + obj.engine);
		System.out.println(obj1.name + " " + obj1.price + " " + obj1.engine);
		System.out.println(obj2.name + " " + obj2.price + " " + obj2.engine);
		System.out.println(obj3.name + " " + obj3.price + " " + obj3.engine);

	}

}
