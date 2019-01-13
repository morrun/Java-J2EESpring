package Java8NewFeature.ForkJoin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.Collectors;

public class TestForkJoin {

	public static void main(String[] args) {
		int[] array = genArray();
		Test t = new Test(array,0,100_000_00);
		ForkJoinPool f = new ForkJoinPool();
//		System.out.println(f.invoke(t));
		String s = "1";
		System.out.println(s);
		Map<String, List<String>> map = new HashMap();
		List<String> l1 = new ArrayList();
		List<String> l2 = new ArrayList();
		List<String> l3 = new ArrayList();
		l1.add("he");
		l2.add("sde");
		l3.add("hello");
		l1.add("he");
		map.put("a", l1);
		map.put("b", l2);
		map.put("c", l3);
		List<List<String>> res = map.values().stream().collect(Collectors.toList());
		System.out.println(res);
		f.execute(t);
//		t.invoke();
		System.out.println(t.join() + " later");
		System.out.println("hellp");
		System.out.println(ForkJoinPool.getCommonPoolParallelism());
	}

	private static int[] genArray() {
		Random r = new Random();
		
		int[] array = new int[100_000_00];
		for (int i = 0;i < 100_000_00;i ++) {
			array[i] = r.nextInt(1000);
		}
		return array;
	}

}
