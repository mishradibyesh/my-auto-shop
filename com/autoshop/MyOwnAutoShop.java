package com.autoshop;
//super class
class Car{
	private int speed;
	private double regularPrice;
	private String color;
	// constructor
	public Car(int speed, double regularPrice, String color) {
		this.speed = speed;
		this.regularPrice = regularPrice;
		this.color = color;
	}
	public double getSalePrice() {
		return regularPrice;
	}
}


// Truck 
class Truck extends Car {
	private int weight;
	//constructor
	public Truck(int speed, double regularPrice, String color, int weight) {
		super(speed, regularPrice, color);
		this.weight = weight;
	}
	public double getSalePrice() {            // overriding the getsaleprice method
		if (weight > 2000) {
			return super.getSalePrice()* (0.90); 

		}
		else 
			return  super.getSalePrice()* (0.80); 
	}
}
// Ford
class Ford extends Car {
	int year;
	int manufacturerDiscount ;
	//constructor
	public Ford(int speed, double regularPrice, String color, int year , int manufacturerDiscount) {
		super(speed, regularPrice, color);
		this.year = year ;
		this.manufacturerDiscount = manufacturerDiscount ;
	}
	public double getSalePrice() {                    // over riding the  getSalePrice method of super class
		return super.getSalePrice() - manufacturerDiscount	;  //substracting discount from regular price     
	}
}
// sedan
class Sedan extends Car {
	private int length;
	//constructor
	public Sedan(int speed, double regularPrice, String color, int length) {
		super(speed, regularPrice, color);
		this.length = length;
	}
	public double getSalePrice() {                    //  over riding the saleprice method
		if (length > 20 ) {
			return super.getSalePrice()* (0.95); 

		}
		else 
			return  super.getSalePrice()* (0.90); 
	}	 
}	 


public class MyOwnAutoShop {

	public static void main(String[] args) {
		System.out.println("welcome to my own auto shop");

		Truck truck = new Truck(100,50000,"blue",2000);
		
		Sedan sedan = new Sedan(100,2000,"blue",22);

		Ford ford = new Ford(100, 20000, "yellow", 2000 , 100);
		
		Car car = new Car(180, 100000, "white");

		System.out.println("sedan price is "+sedan.getSalePrice());

		System.out.println("ford price is "+ford.getSalePrice());

		System.out.println("truck price is "+truck.getSalePrice());
		
		System.out.println("car price is "+car.getSalePrice());

	}

}
