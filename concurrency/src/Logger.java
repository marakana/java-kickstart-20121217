import java.util.LinkedList;
import java.util.Queue;

public class Logger implements Runnable {

	private final Queue<String> messages = new LinkedList<>();

	@Override
	public void run() {
		try {
			while (true) {
				synchronized (this) {
					wait();
					while (!messages.isEmpty()) {
						System.out.println(messages.remove());
					}
				}
			}
		} catch (InterruptedException e) {
		}
	}

	public synchronized void log(String message) {
		messages.add(message);
		notify();
	}
}
