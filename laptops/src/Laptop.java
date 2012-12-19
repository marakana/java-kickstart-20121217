import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Laptop {
	private final int size;
	private final List<Storage> storage;
	private final Set<String> applications = new HashSet<>();

	private static int count = 0;

	private Laptop(int size, List<Storage> storage) {
		if (size <= 0)
			throw new IllegalArgumentException();

		this.size = size;
		this.storage = new ArrayList<>(storage);
	}

	/**
	 * makeLaptop is an example of the "factory" pattern
	 * @param size
	 * @param storage
	 * @return
	 */
	public static Laptop makeLaptop(int size, List<Storage> storage) {
		if (count++ > 100)
			return null;
		return new Laptop(size, storage);
	}

	public int getSize() {
		return size;
	}

	public List<Storage> getStorage() {
		return Collections.unmodifiableList(storage);
	}

	public int getTotalStorageCapacity() {
		int capacity = 0;
		for (Storage s : storage) {
			capacity += s.getCapacity();
		}
		return capacity;
	}

	public Set<String> getApplications() {
		return Collections.unmodifiableSet(applications);
	}

	public void addApplication(String app) {
		applications.add(app);
	}

	public void addApplications(Collection<String> apps) {
		applications.addAll(apps);
	}

	public void addApplications(String... apps) {
		addApplications(Arrays.asList(apps));
	}

	public void removeApplication(String app) {
		applications.remove(app);
	}

	public void removeApplications(Collection<String> apps) {
		applications.removeAll(apps);
	}

	public void removeApplications(String... apps) {
		removeApplications(Arrays.asList(apps));
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + size;
		result = prime * result + ((storage == null) ? 0 : storage.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Laptop other = (Laptop) obj;
		if (size != other.size)
			return false;
		if (storage == null) {
			if (other.storage != null)
				return false;
		} else if (!storage.equals(other.storage))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Laptop [size=" + size + ", storage=" + storage
				+ ", applications=" + applications + "]";
	}

}
