package com.mercury.threads.concurrent;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ProducerConsumerTest {

	public static void main(String[] args) {
		// designed for blocking the producer if queue is full
		BlockingQueue<Integer> bq = new LinkedBlockingQueue(5);
		
		Producer producer = new Producer(bq);
		Consumer consumer = new Consumer(bq);
		
		new Thread(producer).start();
		new Thread(consumer).start();
	}

}
