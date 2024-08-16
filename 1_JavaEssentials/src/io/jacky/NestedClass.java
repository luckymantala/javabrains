package io.jacky;

public class NestedClass {
	public static void main(String[] args) {

		/*
		 * local class example :
		 * cannot update i as used in inner class
		 */
		int i = 10;
		class Foo {
			int x = i;
		}
		Foo f = new Foo();
		System.out.println("Local class: " + f.x);
//		i = 20;   
		
//		inner class example
		Car c = new Car();
		Car.Wheel cWheels = c.new Wheel();
		cWheels.noOfWheels = 4;
		System.out.println("Inner class " + cWheels.noOfWheels);   // 4
		
//		static inner class
//		Bike b = new Bike();
		Bike.Tyre BikeTyre = new Bike.Tyre();
		BikeTyre.noOfTyres = 2;
		System.err.println("Static inner class " +BikeTyre.noOfTyres);
		
// 		anonymous class example
		Cycle c1 = new Cycle();
		c1.weight = 4;
		System.out.println("Normal class " + c1.noOfTyres());
		
		Cycle c2 = new Cycle() {
			public int noOfTyres() {
				return weight/2 + 2;
			}
		};
		c2.weight = 4;
		System.out.println("Anonymous class " + c2.noOfTyres());
		
	}
}
// inner class example
class Car {
	class Wheel {
		int noOfWheels;
	}
	int color;
}

// static inner class
class Bike {
	static class Tyre {
		int noOfTyres;
	}
	int color;
}

// anonymous class example
class Cycle {
	int color;
	int weight;
	public int noOfTyres() {
		return weight/2 + 1;
	}
}

