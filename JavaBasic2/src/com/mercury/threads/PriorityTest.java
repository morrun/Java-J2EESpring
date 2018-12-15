package com.mercury.threads;

public class PriorityTest {
	public static boolean start = false;
	public static Object lock = new Object();
	
	public static class NormalCar implements Runnable {
		@Override
		public void run() {
//			while(!start) {
//				
//			}
			
			synchronized(lock) {
				try {
					lock.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				for(int i = 0; i < 5; i++) {
					System.out.println("Normal car moving");
				}
			}
		}
	}
	
	public static class PoliceCar implements Runnable {
		@Override
		public void run() {
//			while(!start) {
//				
//			}
			synchronized(lock) {
				try {
					lock.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				for(int i = 0; i < 5; i++) {
					System.out.println("Police car moving");
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Thread tnc = new Thread(new NormalCar());
		Thread tpc = new Thread(new PoliceCar());
		
		tnc.setPriority(2);
		tpc.setPriority(8);
		tnc.start();
		tpc.start();
//		PriorityTest.start = true;
		try {
			Thread.sleep(1000);
		} catch(Exception e) {
		}
		synchronized(lock) {
			lock.notifyAll();
		}
	}

}
