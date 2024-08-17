package io.jacky.generics;

public class Animal {
	
	private String name;
	private String type;
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	Animal(String name, String type) {
		this.setName(name);
		this.setType(type);
	}
	
	public void run() {
		System.out.println("Runing");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
