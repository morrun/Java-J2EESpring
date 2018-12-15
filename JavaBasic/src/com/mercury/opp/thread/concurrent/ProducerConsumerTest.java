package com.mercury.opp.thread.concurrent;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ProducerConsumerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BlockingQueue<Integer> bq = new LinkedBlockingQueue(5);
		Producer producer = new Producer(bq);
		Consumer consumer = new Consumer(bq);
		
		new Thread(producer).start();
		new Thread(consumer).start();
		
	}

}
