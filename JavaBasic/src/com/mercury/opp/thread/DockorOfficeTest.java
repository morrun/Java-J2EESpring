package com.mercury.opp.thread;

public class DockorOfficeTest {
	
	public static class Office {
		
	}
	public static class Patient implements Runnable{
		public String name;
		public Office office;
		public Patient() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Patient(String name,Office office) {
			super();
			this.name = name;
			this.office = office;
		}
		
		public void visit(Office office) {
			System.out.println(name + " is visiting the doctor ofiice.");
			synchronized (office) {
				if (this.name.length() == 4) {
					try {
						office.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				try {
					Thread.sleep(3000);
					
				} catch(Exception e) {
					e.printStackTrace();
				}
				if (this.name.length() == 6) {
					office.notify();
				}
			}
			System.out.println(name + " is leaving.");
		}
		@Override
		public void run() {
			visit(this.office);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Office office = new Office();
		Patient p1 = new Patient("Greg",office);
		Patient p2 = new Patient("zihaoi",office);
		Patient p3 = new Patient("djki",office);
		Patient p4 = new Patient("sadfei",office);
		new Thread(p1).start();
		new Thread(p2).start();
		new Thread(p3).start();
		new Thread(p4).start();
		
		System.out.println("############All in!");
	}

}
