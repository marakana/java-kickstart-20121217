public class Memory implements Storage {
	private final String type;
	private final int capacity;

	public Memory(String type, int capacity) {
		if (capacity <= 0)
			throw new IllegalArgumentException();

		this.type = type;
		this.capacity = capacity;
	}

	public String getType() {
		return type;
	}

	public int getCapacity() {
		return capacity;
	}

	@Override
	public String toString() {
		return "Memory [type=" + type + ", capacity=" + capacity + "]";
	}
}
