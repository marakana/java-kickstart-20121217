public class Disk extends Storage {

	public Disk(String type, int capacity) {
		super(type, capacity);
	}

	@Override
	public String toString() {
		return "Disk [type=" + type + ", capacity=" + capacity + "]";
	}
}
