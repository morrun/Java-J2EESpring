package Java8NewFeature.ForkJoin;

import java.util.Random;
import java.util.concurrent.ForkJoinPool;

public class TestForkJoin {

	public static void main(String[] args) {
		int[] array = genArray();
		Test t = new Test(array,0,100_000_00);
		ForkJoinPool f = new ForkJoinPool();
//		System.out.println(f.invoke(t));
		
		f.execute(t);
//		t.invoke();
		System.out.println(t.join() + " later");
		System.out.println("hellp");
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
