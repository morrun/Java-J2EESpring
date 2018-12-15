package com.mercury.threads;

public class AddMultiply {

	public static class Add extends Thread {
		private int x, y;
		private int result;
		
		public Object lock = new Object();
		
		public Add(int x, int y) {
			this.x = x;
			this.y = y;
		}
		
		public int getResult() {
			synchronized(lock) {
				while(result == 0) {
					try {
						lock.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			return result;
		}
		
		@Override
		public void run() {
			synchronized(lock) {
				result = x + y;
				lock.notify();
			}
		}
	}
	
	public static class Multiply extends Thread {
		private int x, y;
		private int result;
		
		public Object lock = new Object();
		
		public Multiply(int x, int y) {
			this.x = x;
			this.y = y;
		}
		
		public int getResult() {
			synchronized(lock) {
				while(result == 0) {
					try {
						lock.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			return result;
		}
		
		@Override
		public void run() {
			synchronized(lock) {
				result = x * y;
				lock.notify();
			}
		}
	}
	
	public static void main(String[] args) {
		// given int x and y, please calculate (x*y) - (x+y)
		// x*y and x+y need to be executed in different threads
		// substraction need to be executed in main

		int x = 5;
		int y = 10;
		// expected result = 35
		
		Add add = new Add(x, y);
		Multiply multiply = new Multiply(x, y);
		
		add.start();
		multiply.start();
		
//		try {
//			add.join();
//			multiply.join();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		
		System.out.println("Final result: " + (multiply.getResult() - add.getResult()));
		
	}

}
