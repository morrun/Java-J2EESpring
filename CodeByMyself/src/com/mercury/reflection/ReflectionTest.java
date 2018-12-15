package com.mercury.reflection;

import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ReflectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer c = new Computer(999,"mac","white");
		
		Class rf = c.getClass();
		
		Method[] m = rf.getMethods();
		Field[] f = rf.getFields();
		try {
			System.out.println(rf.getMethod("chekc").invoke(c, "abc"));
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (Method m1 : m) {
			System.out.print(m1.getName() + " ");
		}
		System.out.println();
		for (Field f1 : f) {
			System.out.print(f1.getName() + " ");
		}
//		Random random = new Random();
//		List<Integer> l = new ArrayList<>();
//		WeakReference w = new WeakReference(l);
//		System.out.println(w.getClass().getName() + random.nextInt((10 - 0)));
	}

}
