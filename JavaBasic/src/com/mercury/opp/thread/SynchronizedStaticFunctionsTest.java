package com.mercury.opp.thread;

public class SynchronizedStaticFunctionsTest {

	public static class TrainingService extends Thread {
		private static int id;
		
		//synchronzied on static function will use class level lock.
		//Each class has only one lock
		//all static synchronized function will share this lock
		//synchronized block on class also share this lock
		//synchronized(TrainingService.class) {//code here}
		public synchronized static void exam() {
			System.out.println("Exam Start...");
			try {
				if (id < 54) {
					System.out.println(id ++ + " " + Thread.currentThread().getName());
				}
				Thread.sleep(1000);
			} catch(Exception e) {
				e.printStackTrace();
			}
			System.out.println("Exam Finish...");
		}
		public synchronized void market() {
			System.out.println("Market start.." + id ++ + Thread.currentThread().getName());
			try {
				Thread.sleep(2000);
			} catch(Exception e) {
				e.printStackTrace();
			}
			System.out.println("Market Done..");
		}
		@Override
		public void run() {
			
			//TrainingService.exam();
			while (id < 54) market();//TrainingService.exam();//market();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TrainingService ts1 = new TrainingService();
		TrainingService ts2 = new TrainingService();
		System.out.println("Main Start.");
		ts1.start();
		ts2.start();
		
		//synchronized (TrainingService.class){
		//	System.out.println("synchronized block start..");
		//	try {
		//		Thread.sleep(2000);
		//	} catch(Exception e) {
		//		e.printStackTrace();
		//	}
		//	System.out.println("synchronized block Done..");
		//}
		//TrainingService.market();
		System.out.println("Main Done.");
	}
}
