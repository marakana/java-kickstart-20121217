import java.math.BigInteger;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Fib {
	public static BigInteger fib(int n) {
		return n < 2 ? BigInteger.ONE : fib(n - 1).add(fib(n - 2));
	}

	public static BigInteger randomFib() {
		return fib(new Random().nextInt(30));
	}

	public static void main(String[] args) throws InterruptedException {
		ExecutorService e = Executors.newFixedThreadPool(10);

		final Logger l = new Logger();

		for (int i = 0; i < 10; i++) {
			e.execute(new Runnable() {
				public void run() {
					while (true) {
						l.log(String.format("%s: %s", Thread.currentThread().getName(), randomFib()));
					}
				}
			});
		}

		l.run();
		e.shutdown();

	}
}
