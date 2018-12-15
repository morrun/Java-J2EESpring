package com.mercury.bfFirstExam;

import java.util.concurrent.Callable;

public class SmartThread implements Callable<Integer>{
	private int num;

	public SmartThread(int num) {
		super();
		this.num = num;
	}
	
	public int foo(int i) {
		return i < 0? 0: foo(i - 1) + i;
	}

	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		return foo(this.num);
	}
	
	
}
