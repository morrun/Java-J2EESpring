package com.mercury.opp.thread;

public class ThreadTest {
	
	//Thread is a concrete class
	public static class MyThread1 extends Thread {
		@Override
		public void run() {
			System.out.println("Begin T1..");
			try {
				Thread.sleep(3000);
			} catch(Exception e) {
				e.printStackTrace();
			}
			System.out.println("Complete T1");
		}
	}
	
	
	public static class MyThread2 implements Runnable{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("Begin T2..");
			try {
				Thread.sleep(3000);
			} catch(Exception e) {
				e.printStackTrace();
			}
			System.out.println("Complete T2");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Begin Main");
		
		//MyThread1 mt1 = new MyThread1();//mt1 is not a thread
		
		//mt1.setDaemon(true);
		//mt1.run();
		//mt1.start();
		MyThread2 mt2 = new MyThread2();
		new Thread(mt2).start();
		try {
			Thread.sleep(2000);
		} catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Complete Main");
	}

}
