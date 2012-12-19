import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Fib {
	public static BigInteger fib(int n) {
		return n < 2 ? BigInteger.ONE : fib(n - 1).add(fib(n - 2));
	}

	public static BigInteger randomFib() {
		return fib(new Random().nextInt(40));
	}

	public static void main(String[] args) {
		List<Thread> threads = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			Thread t = new Thread() {
				public void run() {
					System.out.println(this.getName() + ": " + randomFib());
				}
			};
			t.start();
			threads.add(t);
		}

		for (Thread t : threads) {
			try {
				t.join();
			} catch (InterruptedException e) {
			}
		}

		System.out.println("done");
	}
}
