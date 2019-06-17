package com.pack;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		First obj=new First();
		
		Thread1 o1 = new Thread1(obj);
		Thread2 o2 = new Thread2(obj);
		
		o1.start();
		
		o2.start();

	}

}
