package com.mercury.opp.thread;

public class PriorityTest {
	public static Object lock = new Object();
	
	public static class NormalCar implements Runnable {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			synchronized(lock) {
				try {
					lock.wait();
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				for (int i = 0;i < 5;i ++) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Normal car moving " + i);
				}			
			}
			
			
		}
		
	}
	
	public static class PolicerCar implements Runnable {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			synchronized(lock) {
				try {
					lock.wait();
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				for (int i = 0;i < 5;i ++) {
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Police car moving " + i);
				}			
			}
			
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread tnc = new Thread(new NormalCar());
		Thread tpc = new Thread(new PolicerCar());
		tnc.setPriority(1);
		tpc.setPriority(10);
		tnc.start();
		tpc.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		synchronized(lock) {
			lock.notifyAll();
		}
		
	}

}
