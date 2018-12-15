package com.mercury.bfFirstExam;

public class DeadLock {
	private static class MyThread implements Runnable{
		Object object1,object2;
		
		public MyThread(Object object1, Object object2) {
			super();
			this.object1 = object1;
			this.object2 = object2;
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			synchronized (object1) {
				System.out.println(Thread.currentThread().getName() + " is running..");
				synchronized (object2) {
					System.out.println(Thread.currentThread().getName() + " is running..");
				}
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object ob1 = new Object();
		Object ob2 = new Object();
		MyThread mt1 = new MyThread(ob1,ob2);
		MyThread mt2 = new MyThread(ob2,ob1);
		new Thread(mt1).start();
		new Thread(mt2).start();
	}

}
