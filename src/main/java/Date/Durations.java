package Date;

import java.time.Duration;
import java.time.Instant;

public class Durations {
	public static void main(String[] args) throws InterruptedException {
		Duracao();
	}
	
	private static void Duracao() throws InterruptedException {
		Instant init = Instant.now();
		Thread.sleep(100);
		Instant end = Instant.now();
		System.out.println(Duration.between(init, end).toMillis());
	
	}
}
