package com.pack;

public class First {

	 synchronized public void print(int n)
	{
		for (int i=1;i<=n;i++)
		{
			System.out.println("value="+i);
			
			try {
				wait();
				Thread.sleep(500);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
	
}
