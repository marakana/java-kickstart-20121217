import java.util.Arrays;

public class Laptop {
	int size;
	Memory[] memory;
	Disk disk;
	String[] applications;

	@Override
	public String toString() {
		return "Laptop [size=" + size + ", memory=" + Arrays.toString(memory)
				+ ", disk=" + disk + ", applications="
				+ Arrays.toString(applications) + "]";
	}
}
