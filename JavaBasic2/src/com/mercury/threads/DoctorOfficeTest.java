package com.mercury.threads;

public class DoctorOfficeTest {

	public static class Office {
		
	}
	
	public static class Patient implements Runnable {
		public String name;
		public Office office;

		public Patient() {
			super();
		}

		public Patient(String name, Office office) {
			super();
			this.name = name;
			this.office = office;
		}
		
		public void visit(Office office) {
			System.out.println(name + " is visiting the doctor's office.");
			synchronized(office) {
				if(name.length() == 4) {
					try {
						office.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				try {
					Thread.sleep(3000);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				if(name.length() == 6) {
					office.notifyAll();
				}
			}
			System.out.println(name + " is leaving.");
		}
		
		@Override
		public void run() {
			visit(office);
		}
	}
	
	public static void main(String[] args) {
		Office office = new Office();
		
		Patient p1 = new Patient("Greg", office);
		Patient p2 = new Patient("Jane", office);
		Patient p3 = new Patient("Robert", office);
		Patient p4 = new Patient("Ashley", office);

//		p1.visit(office);
//		p2.visit(office);
//		p3.visit(office);
//		p4.visit(office);

		new Thread(p1).start();
		new Thread(p2).start();
		new Thread(p3).start();
		new Thread(p4).start();
		
		System.out.println("********** All in ***********");
	}

}
