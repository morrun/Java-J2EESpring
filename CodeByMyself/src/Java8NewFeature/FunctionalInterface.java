package Java8NewFeature;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionalInterface {

	public static void main(String[] args) {
		Function<List<String>, OptionalDouble> f = (x) -> {
			return x.stream()
			 .map(Integer::parseInt)
			 .mapToInt(i -> i)
			 .average();
			};
			String[] arr = new String[] {"12","12","13","14"};
		List<String> s = Arrays.asList(arr);
//		f.apply(s).stream().count();
		System.out.println(f.apply(s));
//		s -> System.out.println(s)
	}

}
