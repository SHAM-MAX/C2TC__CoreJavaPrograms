package com.tnsif.oops.inheritance;

class A { //superclass
	void display() {
		System.out.println("Hii");
	}
}

class B extends A{//subclass
	
}

class C extends A{//subclass
	
}
public class InheritanceDemo {




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C obj = new C();
		obj.display();

	}

}
