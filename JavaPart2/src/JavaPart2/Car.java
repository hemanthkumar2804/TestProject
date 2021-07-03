package JavaPart2;

public class Car {
	
	//Global Variables or Class Variables
	String CarName;
	String CarModel;

	public static void main(String[] args) {
		//new Car(): New object
		//a,b,c: Object reference variable
		//using new keyword we will create new object
		Car a = new Car();
		Car b = new Car();
		Car c = new Car();
		a.CarName="Tata";
		a.CarModel="Nexon";
		b.CarName="Maruti Suzuki";
		b.CarModel="Baleno Zeta";
		c.CarName="Mahindra";
		c.CarModel="Kia";
		System.out.println(a.CarName);
		System.out.println(a.CarModel);
		System.out.println(b.CarName);
		System.out.println(b.CarModel);
		System.out.println(c.CarName);
		System.out.println(c.CarModel);
				

	}

}
