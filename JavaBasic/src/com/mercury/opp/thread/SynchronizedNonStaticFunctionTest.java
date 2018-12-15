package com.mercury.opp.thread;

import com.mercury.opp.thread.SynchronizedStaticFunctionsTest.TrainingService;

public class SynchronizedNonStaticFunctionTest {

	public static class TrainingService extends Thread {
		private int id;
		
		//synchronzied on object function will use object level lock.
		//Each object has only one lock
		//all non-static synchronized function will share this lock
		//synchronized block on object also share this lock
		//synchronized(TrainingService.class) {//code here}
		synchronized static public void train() {
			System.out.println("Training Start...");
			try {
				Thread.sleep(3000);
			} catch(Exception e) {
				e.printStackTrace();
			}
			System.out.println("Training Finish...");
		}
		
		synchronized public void eat() {
			System.out.println("Eat Start..." + id);
			try {
				Thread.sleep(2000);
			} catch(Exception e) {
				e.printStackTrace();
			}
			System.out.println("Eat Finish..." + id);
		}
		@Override
		public void run() {
			train();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TrainingService ts1 = new TrainingService();
		TrainingService ts2 = new TrainingService();
		ts1.id = 1;
		ts2.id = 2;
		System.out.println("Main Start..:");
		ts1.start();
		ts2.start();
		synchronized (ts1){
					System.out.println("synchronized block start..");
					try {
						Thread.sleep(2000);
					} catch(Exception e) {
						e.printStackTrace();
					}
					System.out.println("synchronized block Done..");
		}
		//ts1.eat();
		System.out.println("Main Done..:");
	}

}
