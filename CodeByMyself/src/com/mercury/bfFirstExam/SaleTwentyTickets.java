package com.mercury.bfFirstExam;

public class SaleTwentyTickets {
	
	private static class MyThread implements Runnable{
		private int num;
		private Object object;
		public MyThread(int num, Object object) {
			super();
			this.num = num;
			this.object = object;
		}
		@Override
		public void run() {
			// TODO Auto-generated method stub
			while (num > 0) {
				synchronized (object) {
					if (num > 0) {
						System.out.println(Thread.currentThread().getName() + " sale number "  + num -- + " tickets.");
//					try {
//						Thread.sleep(1000);
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
					}
					
				}
			}
		}
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object object = new Object();
		MyThread mt = new MyThread(20,object);
		new Thread(mt).start();
		new Thread(mt).start();
		new Thread(mt).start();
	}

}
