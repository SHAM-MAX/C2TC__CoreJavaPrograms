package com.tnsif.interface_demo;

 interface Shape{
	 
	 //declaration
    void draw();
}

public class InterDemo implements Shape{
	
	//implementation or explanation
	public void draw() {
		System.out.println("Drawing a circle in an interface");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InterDemo id = new InterDemo();
		id.draw();
		

		
	}

}
