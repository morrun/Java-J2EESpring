package com.mercury.opp.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

import com.mercury.clone.Car;

public class Test {

	public static void main(String[] args) {
//		String b = "ba";
//		StringBuffer sb = new StringBuffer(b);
//		sb.reverse();
//        String c = sb.reverse().toString();
//		System.out.println(countAndSay(4));
//		String s = "asdf.sdfewr.sadf";
//		String n = s.replaceAll("\\.","");
//		System.out.println(n);
//		String[] test = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
//		System.out.println(numUniqueEmails(test));
//		System.out.println("Z" + 'Z');
//		System.out.println('z');
//		methoda(null);
		Car c = new Car();
		try {
			Car c1 = c.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		char[] chars = new char[] {'\u0097'}; 
		
		try {
			throw new RuntimeException();
		}catch (RuntimeException e) {
			System.out.println("catch");
			e.printStackTrace();
		}finally {
			System.out.println("finally");
		}
		String str = new String(chars); 
		System.out.println(str);
		byte[] bytes = str.getBytes();
		System.out.println(bytes[0]);
		System.out.println(Arrays.toString(bytes));
		List<Integer> list = new LinkedList();
		double x =  2.15;
		double y =  1.10;
		System.out.println(x - y);
		System.out.println(Runtime.getRuntime().maxMemory() / 1024 / 1024);
		Map<B,Integer> map = new HashMap();
		B b = new B();
		B b1 = new B();
		map.put(b, 1);
		map.put(b, 1);
		System.out.println(map);
//		A a = new A();
//		A b = new A();
//		A c = a;
//		set.add(a);
//		set.add(b);
//		set.add(c);
//		System.out.println(set.size());
		
	}
	public static void methoda(String s) {
		System.out.println("string");
	}
	public static void methoda(Object s) {
		System.out.println("Object");
	}
	public static void methoda(Integer i) {
		System.out.println("Integer");
	}
	public static String countAndSay(int n) {
        String pre = "";
        if (n > 1) pre = countAndSay(n - 1);
        if (n == 1) return "1";
        char[] preArray = pre.toCharArray();
        String res = "";
        int len = 0;
        for (int i = 0;i < preArray.length;i ++) {
            if (i == 0) {
                len = 1;
            } else if(preArray[i] == preArray[i - 1]) {
                len ++;
            } else {
                res += "" +len + preArray[i - 1];
                len = 1;
                
            }
        }
        res += "" + len + preArray[preArray.length - 1];
        return res;
    }
	public static int lengthOfLastWord(String s) {
		s.trim();
        if (s == null || s.length() == 0) return 0;
        Optional<String> res = Arrays.stream(s.split(" ")).reduce((first, second) -> second);
        if (res == null) return 0;
        return res.get() == null?0:res.get().length();
                
    }
    public static int numUniqueEmails(String[] emails) {
//      int count = 0;
//     HashSet<String> emailSet = new HashSet<>();
    
//     for(int i = 0; i < emails.length; i++) {
//        String[] parts = emails[i].split("\\@");
//        String[] subParts = parts[0].split("\\+");
//        subParts[0] = subParts[0].replace(".", "");
//        emailSet.add(subParts[0] + "@" + parts[1]); 
//     }
    
//     return emailSet.size();
    Map<String, Integer> map = new HashMap();
    for(String s: emails) {
        s.replaceAll(".","");
        String tem = helper(s);
        map.put(s,1);
    }
    return map.keySet().size();
}
public static String helper(String s){
    String res = "";
    String[] sA = s.split("@");
    String front = sA[0].substring(0,sA[0].indexOf("+"));
    String back = sA[1].substring(0,sA[1].indexOf("+") == -1?sA[1].length():sA[1].indexOf("+"));
    front.replaceAll(".", "");
    // for (String a: after) {
    //     res += a;
    // }
    System.out.println(front);
    res += "@";
    
    // for (int i = 0;i < after1.length - 1;i ++) {
    //     res += after1[i];
    // }
    
    return res;
}

}
