package com.mercury.bfFirstExam;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadPoolTest {

	public static void smartThreadTest() {
		ExecutorService es = Executors.newFixedThreadPool(4);
		List<Future<Integer>> list = new ArrayList<>();
		
		for (int i = 1;i <= 10;i ++) {
			Future<Integer> future = es.submit(new SmartThread(i));
			list.add(future);
		}
		
		for (Future<Integer> f:list) {
			while (!f.isDone()) {}
			try {
				System.out.println(Thread.currentThread().getName() + " " + f.get());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		es.shutdown();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		smartThreadTest();
	}

}
