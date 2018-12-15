package Java8NewFeature.ForkJoin;

import java.util.Arrays;
import java.util.concurrent.RecursiveTask;
import java.util.stream.Collectors;

public class Test extends RecursiveTask<Integer> {
	private int[] array;
	private int length;
	private int start;
	
	
	public Test() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Test(int[] array, int length, int start) {
		super();
		this.array = array;
		this.length = length;
		this.start = start;
	}


	@Override
	protected Integer compute() {
		if (length < 1000) {
			return computeDirectly();
		}
		Test test1 = new Test(array,start, length / 2);
		Test test2 = new Test(array,start + length/2, length % 2 == 0?length / 2:length / 2 + 1);
//		test1.invoke();
//		test2.invoke();
		
		return test1.invoke() + test2.invoke();
	}


	protected Integer computeDirectly() {
		
		return Arrays.stream(array)
				.filter(x -> x % 2 == 0)
				.boxed()
				.collect(Collectors.toList())
				.size();
	}

}
