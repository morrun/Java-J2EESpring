package com.mercury.threads;

import com.mercury.threads.SynchronizedStaticFunctionsTest.TrainingService;

public class SynchronizedNonStaticFunctionsTest {

	public static class TrainingService extends Thread {
		public int id;
		
		// synchronized on non-static function, will use object level lock
		// each object has only 1 lock
		// all non-static synchronized function will share this lock
		// synchronized block on object also share this lock
		// synchronized(ts1) { // code }
		
		synchronized public void train() {
			System.out.println("Training start....." + id);
			try {
				Thread.sleep(3000);
			} catch(Exception e) {
				e.printStackTrace();
			}
			System.out.println("Training finish. " + id);
		}
		
		public void eat() {
			System.out.println("Eat start....." + id);
			try {
				Thread.sleep(2000);
			} catch(Exception e) {
				e.printStackTrace();
			}
			System.out.println("Eat finish. " + id);
		}
		
		@Override
		public void run() {
			System.out.println(Thread.currentThread().getName() + " **********");
			train();
		}
	}
	
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		
		TrainingService ts1 = new TrainingService();
		TrainingService ts2 = new TrainingService();
		ts1.id = 1;
		ts2.id = 2;
		
		ts1.start();
//		ts1.train();
//		ts1.eat();
//		ts2.start();
		
//		ts1.train();
		
//		synchronized(ts1) {
//			System.out.println("main synchronized block start.....");
//			try {
//				Thread.sleep(3000);
//			} catch(Exception e) {
//				e.printStackTrace();
//			}
//			System.out.println("main synchronized block finish. ");
//		}
		
		System.out.println("Main finish");

	}

}
