package ConstructorsinJava;

public class ConstructorCar {
	String CarName;
	int CarPrice;
	String CarEngine;
	String CarModelNumber;
	
	public ConstructorCar(String CarName, int CarPrice,String CarEngine,String CarModelNumber) {
		this.CarName=CarName;
		this.CarPrice=CarPrice;
		this.CarEngine=CarEngine;
		this.CarModelNumber=CarModelNumber;
		System.out.println(CarName + " " + CarPrice+" "+ CarEngine + " " + CarModelNumber) ;
	}
	 
	

	public static void main(String[] args) {
		ConstructorCar obj=new ConstructorCar("BMW",10,"Automatic","120a");
		ConstructorCar obj1=new ConstructorCar("Audi",10,"Automatic","A10");
		ConstructorCar obj2=new ConstructorCar("Honda",10,"Automatic","JAZA");
		//System.out.println(obj.CarName +" "+ obj.CarPrice +" "+ obj.CarEngine +" "+ obj.CarModelNumber);
		//System.out.println(obj1.CarName +" "+ obj1.CarPrice +" "+ obj1.CarEngine +" "+ obj1.CarModelNumber);
		//System.out.println(obj2.CarName +" "+ obj2.CarPrice +" "+ obj2.CarEngine +" "+ obj2.CarModelNumber);
		

	}

}
