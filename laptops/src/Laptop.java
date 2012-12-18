import java.util.Arrays;

public class Laptop {
	private final int size;
	private final Memory[] memory;
	private final Disk disk;
	private String[] applications;

	public Laptop(int size, Memory[] memory, Disk disk) {
		if (size <= 0)
			throw new IllegalArgumentException();

		this.size = size;
		this.memory = memory;
		this.disk = disk;
	}

	public int getSize() {
		return size;
	}

	public Memory[] getMemory() {
		return memory;
	}

	public Disk getDisk() {
		return disk;
	}

	public String[] getApplications() {
		return applications;
	}

	public void setApplications(String[] applications) {
		this.applications = applications;
	}

	@Override
	public String toString() {
		return "Laptop [size=" + size + ", memory=" + Arrays.toString(memory)
				+ ", disk=" + disk + ", applications="
				+ Arrays.toString(applications) + "]";
	}
}
