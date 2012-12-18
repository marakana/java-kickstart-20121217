public class Disk {
	private final String type;
	private final int capacity;

	public Disk(String type, int capacity) {
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
		return "Disk [type=" + type + ", capacity=" + capacity + "]";
	}
}
