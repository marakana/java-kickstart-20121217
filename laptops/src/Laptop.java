import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class Laptop {
	private final int size;
	private final List<Storage> storage;
	private Set<String> applications;

	public Laptop(int size, List<Storage> storage) {
		if (size <= 0)
			throw new IllegalArgumentException();

		this.size = size;
		this.storage = new ArrayList<>(storage);
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
		return applications;
	}

	public void setApplications(Set<String> applications) {
		this.applications = applications;
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
