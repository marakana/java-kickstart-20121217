import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Logger implements Runnable {

	private final BlockingQueue<String> messages = new LinkedBlockingQueue<>();

	@Override
	public void run() {
		try {
			while (true) {
				System.out.println(messages.take());
			}
		} catch (InterruptedException e) {
		}
	}

	public void log(String message) {
		try {
			messages.put(message);
		} catch (InterruptedException e) {
		}
	}
}
