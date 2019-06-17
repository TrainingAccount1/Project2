package com;

public class Deadlockclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String resource1="srk";
		String resource2="abd";
		
		Thread t1=new Thread() {
			public void run() {
				
				synchronized(resource1){
					System.out.println("Thread1 locked : resource1 - "+resource1);
					try {
						Thread.sleep(400);
					}
					catch(Exception e) {
						e.printStackTrace();
					}
					
					synchronized(resource2) {
						System.out.println("Thread1 locked : resource2 - "+resource2);
						try {
							Thread.sleep(400);
						}
						catch(Exception e) {
							e.printStackTrace();
						}
					}
					
				}
			}
			
		};
		
		Thread t2 =new Thread() {
			public void run() {
				synchronized(resource2){
					System.out.println("thread2 locked resource2 - "+resource2);
					try {
						Thread.sleep(400);
					}
					catch(Exception e) {
						e.printStackTrace();
					}
					
					synchronized(resource1) {
						System.out.println("thread2 locked resource1"+resource1);
						try {
							Thread.sleep(400);
						}
						catch(Exception e) {
							e.printStackTrace();
						}
					}
				}
			}
		};
		
		
		t1.start();
		t2.start();
		

	}

}
