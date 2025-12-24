package com.tnsif.oops.inheritance.multipleinheritance;

interface Inherit{
	void hit();
}

interface Multiple{
	void Multi();
}

class Human implements Inherit,Multiple{
	@Override
	public void hit() {
		System.out.println("He hits the Target");
	}
	
	@Override
	public void Multi() {
		System.out.println("Supports Multi User");
	}
}
public class MultipleInheriatnceDemo {
	
	public static void main(String[] args) {
		Human obj = new Human();
		obj.hit();
		obj.Multi();
	}

}
