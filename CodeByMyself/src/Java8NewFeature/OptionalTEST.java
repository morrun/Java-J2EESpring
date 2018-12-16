package Java8NewFeature;

import java.util.Optional;
import java.util.function.Function;

public class OptionalTEST {

	public static void main(String[] args) {
		
		Function<String, String> getSecondWord = (s) -> {
			return s.split(" ").length > 1 ?s.split(" ")[1]:null;
		};
		Function<String, Integer> getLetterCount = (s) -> {
			return s.length();
		};
		Integer count = getSecondWord.andThen(getLetterCount).apply("hello Optional");
		System.out.println(count);
		Optional<String> o = Optional.ofNullable(getSecondWord.apply("hello"));
		if (o.isPresent()) {
			String tem = o.get();
			System.out.println("Value is : " + tem);
			
			o.ifPresent(System.out::println);
		} else {
			System.out.println("No Value");
			System.out.println(o.orElse("Have No Value"));
		}
		Optional.ofNullable(getSecondWord.apply("hello")).map(getLetterCount).ifPresent(System.out::println);;
		
	}

}
