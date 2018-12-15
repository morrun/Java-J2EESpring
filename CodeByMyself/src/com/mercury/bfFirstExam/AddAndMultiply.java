package com.mercury.bfFirstExam;

public class AddAndMultiply {
	private static class Add implements Runnable {
		private int x;
		private int y;
		private int result;
		
		public int getResult() {
			return result;
		}
		public void setResult(int result) {
			this.result = result;
		}
		public Add(int x, int y) {
			super();
			this.x = x;
			this.y = y;
		}
		public int add() {
			setResult(this.x + this.y);
			return result;
			
		}
		@Override
		public void run() {
			System.out.println(add());
		}
	}
	private static class Multi extends Thread {
		private int x;
		private int y;
		private int result;
		
		public int getResult() {
			return result;
		}
		public void setResult(int result) {
			this.result = result;
		}
		public Multi(int x, int y) {
			super();
			this.x = x;
			this.y = y;
		}
		public int Multi() {
			setResult(this.x * this.y);
			return result;
		}
		@Override
		public void run() {
			System.out.println(Multi());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Add a = new Add(2,4);
		Multi m = new Multi(2,4);
		
		Thread t = new Thread(a);
		t.start();
		m.start();
		
		try {
			t.join();
			m.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Done" + m.getResult()/a.getResult());
		
	}

}
