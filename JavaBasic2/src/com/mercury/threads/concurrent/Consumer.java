package com.mercury.threads.concurrent;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {

	private BlockingQueue<Integer> bq;
	
	public Consumer(BlockingQueue<Integer> bq) {
		this.bq = bq;
	}
	
	@Override
	public void run() {
		while(bq.isEmpty()) {}
		
		while(!bq.isEmpty()) {
			try {
				Thread.sleep(3000);
				System.out.println("Consumer get " + bq.poll() + " -------");
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
