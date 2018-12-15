package com.mercury.opp.thread;

// Deadlock: 2 or more threads waiting for locks from each other, while holding other's lock
// No thread will release until this thread get other's lock
public class DeadLock {
	
	public static class MyThread1 extends Thread {
		public Object lockObj1;
		public Object lockObj2;
		
		@Override
		public void run() {
			System.out.println(Thread.currentThread().getName() + " is running...");
			synchronized (lockObj1) {
				System.out.println(Thread.currentThread().getName() + " get lockObj1 " + lockObj1.toString());
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized(lockObj2) {
					System.out.println(Thread.currentThread().getName() + " get lockObj2 " + lockObj2.toString());
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object lockObj1 = new Object();
		Object lockObj2 = new Object();
		
		MyThread1 mt1 = new MyThread1();
		MyThread1 mt2 = new MyThread1();
		
		mt1.lockObj1 = lockObj1;
		mt1.lockObj2 = lockObj2;
		
		mt2.lockObj1 = lockObj2;
		mt2.lockObj2 = lockObj1;
		
		mt1.start();
		mt2.start();
	}

}
