package com.pack;

public class Thread1 extends Thread{

	First a;

	public Thread1(First a) {
		super();
		this.a = a;
	}
	
	public void run()
	{
		a.print(6);
	}
	
	
	
	
}
