package com.mercury.bfFirstExam;

public class TestJoin {
	private static class MyThread extends Thread{
		private String name;

		public MyThread(String name) {
			super();
			this.name = name;
		}
		
		@Override
		public void run() {
			for (int i = 0;i < 3;i ++) {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(name + " " + i);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread mt1 = new MyThread("zihao");
		MyThread mt2 = new MyThread("yiting");
		MyThread mt3 = new MyThread("xiaosan");
		mt1.start();
		try {
			mt1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		mt2.start();
		try {
			mt2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		mt3.start();
		System.out.println("Main Done");
	}

}
