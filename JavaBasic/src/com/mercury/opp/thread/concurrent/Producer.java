package com.mercury.opp.thread.concurrent;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {

	private BlockingQueue<Integer> bq;
	
	public Producer(BlockingQueue<Integer> bq) {
		this.bq = bq;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0;i < 100;i ++) {
			try {
				Thread.sleep(1000);
				bq.put(i);
				System.out.println("Producer put " + i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
