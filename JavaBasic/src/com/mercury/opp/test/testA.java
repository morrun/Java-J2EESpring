package com.mercury.opp.test;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class testA {
	static List<Character> list = new ArrayList();
	public static void main(String[] args) {
//		String x = "5x-6y+z+12h=10";
////		int[] d = helper(x); 
////		String x1 = "5x-6y+12a=10-8z+10x+1+11d";
//		List<String> arrayList = new ArrayList();
//		arrayList.add("2x+4y+6z=18");
//		arrayList.add("3y+3z=6");
////		arrayList.add("x+2y=z-3");
//		List<Map<Character,Double>> listMap = new ArrayList();
//		for (String ts: arrayList) {
//			listMap.add(changeToNormal(ts));
//		}
//		
////		listMap.add(changeToNormal(x));
////		listMap.add(changeToNormal(x1));
//		double[][] t = new double[list.size()][list.size() + 1];
//		Collections.sort(list);
//		int index = 0;
//		for (Map<Character, Double> tm:listMap) {
//			t[index++] = changeListToArray(tm);
//		}
		int[] nums = new int[] {-1, -1, 0, 0, 1, 2} ;
		System.out.println(sumToZero(nums));
//		System.out.println(changeToNormal(x1));

	}
	 public static List<List<Integer>> sumToZero(int[] arr){
	      List<List<Integer>> result = new ArrayList();
	      Map<Integer, List<Integer>> map = new HashMap();
	      for (int i = 0;i < arr.length;i ++) {
	        if (map.containsKey(arr[i])) {
	        	map.get(arr[i]).add(i);
	        } else {
	        	List<Integer> tem = new ArrayList();
	        	tem.add(i);
	        	map.put(arr[i], tem);
	        }
	      }
	    
	      for (int i = 0;i < arr.length - 2;i ++) {
	        for (int j = i + 1;j < arr.length - 1;j ++) {
	          int target = 0 - arr[i] - arr[j];
	          if (map.containsKey(target) && map.get(target).size() != 0) {
	            for (int index: map.get(target)) {
	              if (index > j) {
	               result.add(Arrays.asList(i,j,index)); 
	              }
	            }
	          }
	            
	        }
	      }
	      return result;
	    }
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList();
        Arrays.sort(nums);
        for (int i = 0;i < nums.length - 2;i ++) {
            while ((i > 0 && i < nums.length - 2) && nums[i] == nums[i - 1]) i ++;
            int target = 0 - nums[i];
            int left = i + 1, right = nums.length - 1;
            while (left < right) {
                while (left < right && left > i + 1 && nums[left] == nums[left - 1]) left ++;
                while ((right > left && right < nums.length - 1) && nums[right] == nums[right + 1]) right --;
                if (nums[left] + nums[right] == target) {
                    result.add(Arrays.asList(nums[i],nums[left], nums[right]));
                    left ++;
                    right --;
                } else if (nums[left] + nums[right] < target) {
                    left ++;
                } else {
                    right --;
                }
            }
        }
        return result;
    }
//	public static int[] helper(String x) {
//		String[] s = x.split("=");
//
//		int[] res = new int[3];
//		int indexX = s[0].indexOf("x");
//		String beforeX = s[0].substring(0, indexX);
//		s[0] = s[0].substring(indexX + 1, s[0].length());
//		res[0] = beforeX == "+"?1:beforeX == "-"?-1:Integer.parseInt(beforeX);
//		int indexY = s[0].indexOf("y");
//		String beforeY = s[0].substring(0, indexY);
//		res[1] = beforeY == "+"?1:beforeY == "-"?-1:Integer.parseInt(beforeY);
//		s[0] = s[0].substring(indexY + 1, s[0].length());
//		
//		int indexZ = s[0].indexOf("z");
//		String beforeZ = s[0].substring(0, indexZ);
//		System.out.println(beforeZ);
//		res[2] = beforeZ.equals("+")?1:beforeZ.equals("-")?-1:Integer.parseInt(beforeZ);
//		return res;
//	}
	public static Map<Character,Double> changeToNormal(String x) {
		if (x == null || x.length() == 0) return null;
		
		Comparator<Character> c = (o1,o2) -> {
			return o1 - o2;
		};
		Map<Character, Double> map = new TreeMap<Character, Double>(c);	
		double st = 0;
		String[] arrayS = x.split("=");
			int last = 0;
			for(int i = 0;i < arrayS[0].length();i ++ ) {
				
				if (arrayS[0].charAt(i) >= 'a' && arrayS[0].charAt(i) <= 'z') {
					if (!list.contains(arrayS[0].charAt(i))) {
						list.add(arrayS[0].charAt(i));
					}
					String beforeX = arrayS[0].substring(last,i);					
					double tem = beforeX.equals("+")?1.0:beforeX.equals("-")?-1.0:Double.parseDouble(beforeX);
					map.put(arrayS[0].charAt(i), map.getOrDefault(arrayS[0].charAt(i), 0.0) + tem);
				} 
				if (arrayS[0].charAt(i) == '+' || arrayS[0].charAt(i) == '-') {
					if (isDouble(arrayS[0].substring(last, i))) {
						st -= Double.parseDouble(arrayS[0].substring(last, i));
					}
					last = i;
				}
			}
			if (isDouble(arrayS[0].substring(last, arrayS[0].length()))) {
				st -= Double.parseDouble(arrayS[0].substring(last, arrayS[0].length()));
			}
			last = 0;
			for(int i = 0;i < arrayS[1].length();i ++ ) {
				
				if (arrayS[1].charAt(i) >= 'a' && arrayS[1].charAt(i) <= 'z') {
					if (!list.contains(arrayS[1].charAt(i))) {
						list.add(arrayS[1].charAt(i));
					}
					String beforeX = arrayS[1].substring(last,i);					
					double tem = beforeX.equals("+")?1.0:beforeX.equals("-")?-1.0:Double.parseDouble(beforeX);
			
					map.put(arrayS[1].charAt(i), map.getOrDefault(arrayS[1].charAt(i), 0.0) - tem);
				}
				if (arrayS[1].charAt(i) == '+' || arrayS[1].charAt(i) == '-') {
					if (isDouble(arrayS[1].substring(last, i))) {
						st += Double.parseDouble(arrayS[1].substring(last, i));
					}
					last = i;
				}
				
			}
			if (isDouble(arrayS[1].substring(last, arrayS[1].length()))) {
				st += Double.parseDouble(arrayS[1].substring(last, arrayS[1].length()));
			}

		map.put('!', st);
//		System.out.println(map);
		return map;
	}
	public static boolean isDouble(String s) {
		try {
			Double.parseDouble(s);
			return true;
		}catch (Exception e) {
			return false;
		}
	}
	public static double[] changeListToArray(Map<Character,Double> map) {
		double[] res = new double[list.size() + 1];
		System.out.println(map);
		System.out.println(list);
		for (Map.Entry<Character, Double> tm: map.entrySet()) {
			
			if (list.indexOf(tm.getKey()) != -1)
			res[list.indexOf(tm.getKey())] = tm.getValue();
		}
		res[list.size()] = map.get('!');
		for (double b:res) {
			System.out.println(b);
		}
		return res;
	}

}
