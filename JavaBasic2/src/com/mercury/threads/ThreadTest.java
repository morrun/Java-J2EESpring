package com.mercury.threads;

public class ThreadTest {

	// Thread is a concrete class
	public static class MyThread1 extends Thread {
		@Override
		public void run() {
			System.out.println("Begin T1...");
			try {
				Thread.sleep(5000);
			} catch(Exception e) {
				e.printStackTrace();
			}
			System.out.println("Complete T1");
		}
	}
	
	public static class MyThread2 implements Runnable{
		@Override
		public void run() {
			System.out.println("Begin T2...");
			try {
				Thread.sleep(5000);
			} catch(Exception e) {
				e.printStackTrace();
			}
			System.out.println("Complete T2");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Begin main...");
		
//		MyThread1 mt1 = new MyThread1();
//		mt1.run();
//		mt1.setDaemon(true);
//		mt1.start();
		
		
		// start() function is only defined in Thread class
		MyThread2 mt2 = new MyThread2();
		new Thread(mt2).start();
		
		try {
			Thread.sleep(2000);
		} catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Complete main");
	}
}
