import java.util.LinkedList;
import java.util.Queue;


public class Logger implements Runnable {

	private final Queue<String> messages = new LinkedList<>();

	@Override
	public void run() {
		while (true) {
			if (!messages.isEmpty()) {
				System.out.println(messages.remove());
			}
			Thread.yield();
		}
	}

	public void log(String message) {
		messages.add(message);
	}
}
