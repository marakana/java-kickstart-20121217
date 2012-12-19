
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + capacity;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		Storage other = (Storage) obj;
		if (capacity != other.capacity)
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

}
