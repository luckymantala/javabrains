package io.jacky;


class Car1 { 
	int wheels;
//	copy constructor
	Car1 (Car1 c) {
		this();   // calling default constructor
		this.wheels = c.wheels;
	}
//	default constructor
	public Car1() {
		this.wheels = 4;
	}
}

class Car2 {
	static int wheels;
	static int getNoOfWheels() {
		/*
		 * cannot use this in static method as this refers to instance of the class and
		 * static method can be invoked before creating an instance of the class
		 */
//		return this.wheels;
		return wheels;
	}
	
	void printCar() {
		System.out.println(Car2.wheels);
	}
}

class Mode2 extends Car2 {
	@Override
	void printCar() {
		super.printCar();
		System.out.println("From Model class");
	}
}

class Car3 {
	int seats;
	public void run() {
		seats = 5;
		System.out.println(seats);
	}
}

class Model3 extends Car3 {
	private int seatsofModel;

	public int getSeats() {
		return seatsofModel;
	}

	public void setSeats(int seatsofModel) {
		this.seatsofModel = seatsofModel;
	}
	
	public void stop() {
		System.out.println("stopppp");
	}
	
	@Override
	public void run() {
		super.run();
		seats = 3;
		System.out.println(seats);
	}
}


class Car4 {
	Car4() {
		System.out.println("Car4");
	}
	
	protected long run(long speed) {
		System.out.println("runnnnn");
		return 0;
	}
}

class Model4 extends Car4 {
	Model4() {
		System.out.println("Model4");
	}

	@Override
	public long run(long speed) {
		// TODO Auto-generated method stub
		System.out.println("run modeelllll");
		return 0;
	}
}

interface Drivable {
	default void drive() {
		System.out.println("driving");
	}
}

interface FuelVahicle {
	default void drive() {
		System.out.println("FuelVahicle");
	}
}

class Vahilce implements Drivable, FuelVahicle {
	private int wheels = 4;
	public void driveVahicle() {
		System.err.println(wheels + " drving");
		drive();
	}
	@Override
	public void drive() {
		// TODO Auto-generated method stub
		Drivable.super.drive();
		FuelVahicle.super.drive();
	}
}


public class OOPS {
	public static void main(String[] args) {
		Car1 c1 = new Car1();
		Car1 c11 = new Car1(c1);
		
		
		Car2 c2 = new Car2();
		c2.printCar();
		
		Car2 c22 = new Mode2();
		Mode2 m22 = new Mode2();
		
		c22.printCar();
		m22.printCar();
		
		Car3 c3 = new Car3();
		Model3 m3 = new Model3();
		Car3 c33 = new Model3();
		
		c3.run();                         
		m3.run();
//		c33.stop();
		
		Model4 m4 = new Model4();
		
		Vahilce v = new Vahilce();
		v.driveVahicle();
		
	}
}
