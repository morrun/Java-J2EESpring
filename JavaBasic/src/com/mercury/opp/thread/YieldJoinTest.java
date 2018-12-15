package com.mercury.opp.thread;

public class YieldJoinTest {

	public static class A extends Thread {
		public int id;
		@Override
		public void run() {
			for (int i = 0;i < 10;i ++)
			System.out.println(id + "..." + i);
			Thread.yield();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a1 = new A();
		A a2 = new A();
		a1.id = 1;
		a2.id = 222;
		
		a1.start();
		a2.start();
		
		// join a running thread, current thread will run after the called thread completion
		// if the thread is not running, current thread will keep running.
		try {
			a1.join();
			a2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		a1.start();
//		a2.start();
		
		System.out.println("^^^^^^^^^^");
	}

}
