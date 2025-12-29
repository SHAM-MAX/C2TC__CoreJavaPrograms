package com.tnsif.multithreading;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildThread th = new ChildThread(6, "one");
		ChildThread th2 = new ChildThread(6, "two");

		th.start();
		th2.start();
	}
	

}
