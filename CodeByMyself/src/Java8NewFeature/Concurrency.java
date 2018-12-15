package Java8NewFeature;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Concurrency {

	public static void main(String[] args) {
		ScheduledExecutorService ses = Executors.newScheduledThreadPool(1);
		
		Runnable task = () -> {
			try {
				TimeUnit.SECONDS.sleep(2);
				System.out.println("Scheduling" + Thread.currentThread().getName());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		};
		ses.scheduleAtFixedRate(task, 5, 1, TimeUnit.SECONDS);
//		ses.scheduleWithFixedDelay(task, 5, 1, TimeUnit.SECONDS);
	}
}
