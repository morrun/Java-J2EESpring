package com.mercury.bfFirstExam;

public class OmitNumberLetters {
	private static class OmitNumber extends Thread{
		Object object;

		public OmitNumber(Object object) {
			super();
			this.object = object;
		}
		
		@Override
		public void run() {
			synchronized(object) {
				
				for (int i  = 1;i <= 52;i ++) {
					if (i > 1&&i %2 == 1) {
						System.out.print(" ");
					}
					System.out.print(i);
					//if (i == 1) continue;
					if (i % 2 == 0) {
						object.notifyAll();
						try {
							//System.out.println();
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
	private static class OmitLetter extends Thread{
		Object object;

		public OmitLetter(Object object) {
			super();
			this.object = object;
		}
		
		@Override
		public void run() {
			synchronized(object) {
				
				for (char i = 'A';i <= 'Z';i ++) {
					object.notifyAll();
					System.out.print(i);
					if (i < 'Z') {
						try {
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
		Object object = new Object();
		OmitNumber on = new OmitNumber(object);
		OmitLetter ol = new OmitLetter(object);
		on.start();
		ol.start();
	}

}
