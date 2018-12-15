package com.mercury.bfFirstExam;

public class AutomaticIncreaseByThreeT {
	//static int num = 1;
	private static class MyThread implements Runnable{
		private Object object;
		static int count = 0;
		static int i = 0;
		int num;
		
		
		public MyThread(Object object, int num) {
			super();
			this.object = object;
			this.num = num;
		}


		@Override
		public void run() {
			synchronized (object) {
				while (i < 75) {
					object.notifyAll();
					if ((count % 3) != (num - 1)) {
						try {
							object.wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					i ++;
					System.out.print(" "+Thread.currentThread().getName() + " num " + i + " count is " + count);
					
					if (i % 5 == 0) {
						
						try {
							count ++;
							System.out.println();
							object.wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object ob1 = new Object();
		for (int i = 1;i <= 3;i ++) {
			new Thread(new MyThread(ob1,i)).start();
		}
	}

}
