package com.mercury.bfFirstExam;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {
	private BlockingQueue<Integer> bq;
	
	
	public Producer(BlockingQueue<Integer> bq) {
		super();
		this.bq = bq;
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0;i < 10;i ++) {
			try {
				Thread.sleep(1000);
				bq.put(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " is put " + i + " in Queue");
		}
	}

}
