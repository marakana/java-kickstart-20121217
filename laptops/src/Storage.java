
public class Storage {
	protected final String type;
	protected final int capacity;

	public Storage(String type, int capacity) {
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
}
