package JavaPart3;

public class TestCar {

	public static void main(String[] args) {

		// Method Overriding: If the same method is present in parent class and child
		// class with same number of parameters or arguments then preference will be
		// given to child class is called as method
		// overriding
		// Static Polymorphism or compile time Polymorphism: at the compile time it will
		// decide which method to call
		Tata t = new Tata();
		t.Start();
		t.Stop();
		t.Refuel();
		t.SportsMode();

		System.out.println(" **************** ");

		Car c = new Car();
		c.Start();
		c.Stop();
		c.Refuel();

		// Dynamic Polymorphism or Run time Polymorphism: child class object can be
		// refereed to parent class reference variable.
		// Top Casting
		Car c1 = new Tata();
		c1.Start();
		c1.Stop();
		c1.Refuel();

		// Down Casting//If parent class object is refereed to child class reference
		// variable it will give ClassCastException
		Tata t1 = (Tata) new Car();// ClassCastException
		t1.Start();

	}

}
