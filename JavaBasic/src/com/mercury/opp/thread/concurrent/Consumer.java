package com.mercury.opp.thread.concurrent;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
	private BlockingQueue<Integer> bq;
	
	public Consumer(BlockingQueue<Integer> bq) {
		this.bq = bq;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (bq.isEmpty()) {}
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		while (!bq.isEmpty()) {
			try {
				Thread.sleep(2000);
				System.out.println("Consumer get " + bq.poll() + "----");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
