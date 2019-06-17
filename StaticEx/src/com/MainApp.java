package com;

/*
class App{
	
	static int a=0;
	
static void display() {
	System.out.println("Value "+a);
}
}

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		App.display();
		
	}

}*/

class Adder{  
static int add(int a,int b){return a+b;}  
static int add(int a,int b,int c){return a+b+c;}  
}  
class MainApp{  
public static void main(String[] args){  
System.out.println(Adder.add(11,17));  
System.out.println(Adder.add(11,11,11));  
}} 
