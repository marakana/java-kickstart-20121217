public class Memory extends Storage {

	public Memory(String type, int capacity) {
		super(type, capacity);
	}

	@Override
	public String toString() {
		return "Memory [type=" + type + ", capacity=" + capacity + "]";
	}
}
