package com.mercury.bfFirstExam;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
	private BlockingQueue<Integer> bq;
	
	
	public Consumer(BlockingQueue<Integer> bq) {
		super();
		this.bq = bq;
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (bq.isEmpty()) {}
		
		while (!bq.isEmpty()) {
			try {
				Thread.sleep(2000);
				System.out.println(Thread.currentThread().getName() + " is polling " + bq.poll() + " out of the Queue");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
			

	}

}
