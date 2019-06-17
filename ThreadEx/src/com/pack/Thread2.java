package com.pack;

public class Thread2 extends Thread {

	First a;

	public Thread2(First a) {
		super();
		this.a = a;
	}
	
	public void run()
	{
		a.print(8);
	}
	
	
}
