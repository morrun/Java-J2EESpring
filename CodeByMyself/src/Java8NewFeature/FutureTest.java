package Java8NewFeature;

import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureTest {

	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(1);
		CompletableFuture<String> cf = new CompletableFuture();
		Callable<String> r = () -> {
			Thread.sleep(2000);
			cf.complete("hello");
			System.out.println("running");
			return "aa";
		};
		Future<String> f = es.submit(r);
		try {
//			System.out.println(f.get());
			System.out.println(cf.get());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace(); 
		}
		System.out.println("Main finished");
		es.shutdown();
	}

}
