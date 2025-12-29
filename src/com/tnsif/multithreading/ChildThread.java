package com.tnsif.multithreading;

public class ChildThread extends Thread
{

	private int n;
	private String msg;
	
	
	public ChildThread (int n, String msg) {
		this.n = n;
		this.msg = msg;
	}
	
	@Override
	public void run() {
		for(int i=0; i<=n; i++) {
			try {
				Thread.sleep(500);
			}
			catch(Exception e) {
				
				System.out.println(e.getMessage());
			}
			
			System.out.println(msg+" "+i+" "+Thread.currentThread().getName());
		}
		
	}
}