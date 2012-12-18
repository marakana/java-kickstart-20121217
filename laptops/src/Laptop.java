import java.util.Arrays;

public class Laptop {
	private final int size;
	private final Storage[] storage;
	private String[] applications;

	public Laptop(int size, Storage[] storage) {
		if (size <= 0)
			throw new IllegalArgumentException();

		this.size = size;
		this.storage = storage;
	}

	public int getSize() {
		return size;
	}

	public Storage[] getStorage() {
		return storage;
	}

	public int getTotalStorageCapacity() {
		// TODO
	}

	public String[] getApplications() {
		return applications;
	}

	public void setApplications(String[] applications) {
		this.applications = applications;
	}

	@Override
	public String toString() {
		return "Laptop [size=" + size + ", storage=" + Arrays.toString(storage)
				+ ", applications=" + Arrays.toString(applications) + "]";
	}

}
