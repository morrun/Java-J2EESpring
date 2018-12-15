package com.mercury.bfFirstExam;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ProducerConsumerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BlockingQueue<Integer> bq = new LinkedBlockingQueue<>();
		Producer pr = new Producer(bq);
		Consumer cr = new Consumer(bq);
		new Thread(pr).start();
		new Thread(cr).start();
	}

}
