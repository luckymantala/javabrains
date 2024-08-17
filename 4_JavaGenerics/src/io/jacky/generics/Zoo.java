package io.jacky.generics;

public class Zoo {
	public static void main(String[] args) {
		
		
		Monkey m1 = new Monkey("A", "monkey");
		Monkey m2 = new Monkey("B", "monkey");
		
		Lion l1 = new Lion("C", "lion");
		Lion l2 = new Lion("D", "lion");
		
		Cage<Monkey> cageOfMonkey = null;
		
		if(Cage.isCompatible(m1, l1)) {
			System.out.println("m1 and l1 are not compatible so cannot put in same cage");
		}
		else if(Cage.isCompatible(m1, m2)) {
			System.out.println("m1 and m2 are compatible");
			cageOfMonkey = new Cage<Monkey>(m1, m2);
		} else {
			System.out.println("m1 and m1 are compatible");
			cageOfMonkey = new Cage<Monkey>(m1, m1);
		}
		
		
		cageOfMonkey.feedAnimal();
		
	}
}
