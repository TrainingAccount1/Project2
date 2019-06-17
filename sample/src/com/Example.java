package com;
import java.util.*;
public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Object> var = new ArrayList<Object>();
		
		var.add(1);
		var.add("String");
		var.add("123str");
		var.add(null);
		
		for (int i=0;i<var.size();i++)
		{
			System.out.println(var.get(i));
		}
		
		for(Object o: var) {
			System.out.println(o
				);
		}
		
	}

}
