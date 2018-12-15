package com.mercury.threads;

public class YieldJoinTest {

	public static class A extends Thread {
		public int id;
		@Override
		public void run() {
			for(int i = 0; i < 10; i++) {
				System.out.println(id + "...");
				Thread.yield();
				//1 min
			}
		}
	}
	
	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new A();
		a1.id = 1;
		a2.id = 999;
		
		
		a1.start();
		a2.start();
		

		// join a running thread, current thread will run after the called thread completion
		// if the thread is not running, current thread will keep running.
		try {
			a1.join();
			a2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		
		
		System.out.println("*************");
		
	}

}
