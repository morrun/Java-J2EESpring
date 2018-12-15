package com.mercury.opp.thread.concurrent;

public class DummyThread extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName() + " is running...");
	}

}
