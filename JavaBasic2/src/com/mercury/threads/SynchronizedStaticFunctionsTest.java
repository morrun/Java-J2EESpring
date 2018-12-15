package com.mercury.threads;

public class SynchronizedStaticFunctionsTest {

	public static class TrainingService extends Thread {
		public int id;
		
		// synchronized on static function, will use class level lock
		// each class has only 1 lock
		// all static synchronized function will share this lock
		// synchronized block on class also share this lock
		// synchronized(TrainingService.class) { // code }
		
		synchronized public static void exam() {
			System.out.println("Exam start...");
			try {
				Thread.sleep(5000);
			} catch(Exception e) {
				e.printStackTrace();
			}
			System.out.println("Exam finish");
		}
		
		public static void market() {
			System.out.println("Market start...");
			try {
				Thread.sleep(2000);
			} catch(Exception e) {
				e.printStackTrace();
			}
			System.out.println("Market finish");
		}
		
		@Override
		public void run() {
			TrainingService.exam();
		}
	}
	
	public static void main(String[] args) {
		TrainingService ts1 = new TrainingService();
		TrainingService ts2 = new TrainingService();
		
		System.out.println("Main start...");
		
		ts1.start();
//		ts2.start();
		
//		TrainingService.market();
		
		synchronized(TrainingService.class) {
			
			System.out.println("synchronized block start...");
			try {
				Thread.sleep(2000);
			} catch(Exception e) {
				e.printStackTrace();
			}
			System.out.println("synchronized block finish");
			
		}
		
		System.out.println("Main finish");
	}

}
