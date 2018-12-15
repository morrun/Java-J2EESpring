package com.mercury.singletonPattern;

public class Boss {
	private static Boss boss = null;
	private String name;
	private Boss() {}
	
	private Boss(String name) {
		super();
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Boss [name=" + name + "]";
	}

	public static Boss getBoss() {
		return boss;
	}

	public static void setBoss(Boss boss) {
		Boss.boss = boss;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static Boss getInstance(String name) {
		if (boss == null) {
			synchronized(Boss.class) {
				if (boss == null) {
					boss = new Boss(name);
				}
			}
		}
		return boss;
	}
}
