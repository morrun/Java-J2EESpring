package Java8NewFeature;

import java.util.stream.IntStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.IntSummaryStatistics;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.*;
public class StreamTest implements Cloneable {

	public static void main(String[] args) throws IOException {
		String str1 = "value1";
		String str2 = "value1";
		System.out.print(str1 == str2);
		System.out.println(str1.equals(str2));

		
		// TODO Auto-generated method stub
		// Example 1
//		Map<String,String> map = new HashMap();
		IntStream
			.range(1, 10)
			.skip(4)
			.forEach(x -> System.out.println(x));
		
		System.out.println("********************");
		System.out.println(IntStream
			.range(1, 10)
			.skip(4)
			.sum());
		System.out.println("********************");
		
		Stream.of("Ava", "Aeca", "Aewc", "Aepw")
			.filter(x -> x.startsWith("A"))
			.forEach(x -> System.out.println(x));
		System.out.println("********************");
		String[] names = {"AI", "Ankit", "Kushal", "Brent", "Sarika", "amanda", "Hans", "Shivika", "Seax"};
		Arrays.stream(names)
			.filter(x -> x.startsWith("S"))
			.map(x -> x.toUpperCase())
			.sorted()
			.forEach(x -> System.out.println(x));
		System.out.println("********************max");
		Arrays.stream(new int[] {1,3,2,5,4,7,5,7,8,6,9,9})
//			.map(x -> x/2)
			.max()
			.ifPresent(System.out::println);
		System.out.println("********************");
		IntSummaryStatistics summary = IntStream.of(1,3,2,5,4,7,5,7,8,6,9)
					.summaryStatistics();
		System.out.println(summary);
		System.out.println("********************");
		List<Integer> list = Arrays.stream(new int[] {1,3,2,5,4,7,5,7,8,6,9})
		.sorted()
		.boxed()
		.collect(Collectors.toList());
		List<Integer> linkedList = new LinkedList();
		System.out.println(list);
		System.out.println("********************");
		List<String> people = Arrays.asList(names);
		String s = "aa";
		s.isEmpty();
		people.stream()
			.filter(x -> x.startsWith("A"))
			.map(x -> x.toLowerCase())
			.forEach(System.out::println);
		System.out.println(people);
		System.out.println("********************");
		
		java.util.stream.Stream<String> bands = Files.lines(Paths.get("resources/band.txt"));
		
		List<String[]> alist = bands
			.map(x -> x.split(","))
//			.filter(x -> x.length == 3)
//			.forEach(x -> System.out.println(x[0]))
			.collect(Collectors.toList());
		System.out.println(alist.get(0));
//		alist.forEach(x -> x[1] = x[1] + "*");
//		alist.stream()
//			.forEach(x -> System.out.println(x[1]));
		System.out.println("********************");
		java.util.stream.Stream<String> bands1 = Files.lines(Paths.get("resources/band.txt"));
		int rowns = (int)bands1
						.map(x -> x.split(","))
						.filter(x -> x.length == 3)
						.count();
		System.out.println(rowns);
		bands1.close();
		System.out.println("********************");
		java.util.stream.Stream<String> bands2 = Files.lines(Paths.get("resources/band.txt"));
		rowns = (int)bands2
						.peek(x -> x.split(","))
						.count();
		System.out.println(rowns);
		bands2.close();
		
		System.out.println("********************");
		
		Map<String, String> map = new HashMap();
		map.put("10", "Age");
		map.put("11", "felix");
		map.put("22", "fexil1");
//		map.forEach(action);
		List<Map.Entry<String, String>> map1 = map.entrySet().stream()
			.sorted((x1, x2) -> {
				Integer i1 = Integer.parseInt(x1.getKey());
				Integer i2 = Integer.parseInt(x2.getKey());
				return i2 - i1;
			})
			.collect(Collectors.toList());
		map1.forEach(System.out::println);
		System.out.println("********************");
		map1.forEach(System.out::println);
		map1.stream()
			.filter(x -> {
				System.out.println("hi");
				return Integer.parseInt(x.getKey()) > 10;
			})
			.forEach(System.out::println);
		Stream<Map.Entry<String, String>> s1 = map1.stream();
		
		s1.forEach(System.out::println);
		map1.stream()
		.forEach(System.out::println);
		
	}

}
