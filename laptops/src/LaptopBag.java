public class LaptopBag {
	private final Color color;
	private final int size;
	private Laptop laptop;

	public LaptopBag(Color color, int size) {
		this.color = color;
		this.size = size;
	}

	public Color getColor() {
		return color;
	}

	public int getSize() {
		return size;
	}

	Laptop getLaptop() {
		return laptop;
	}

	void setLaptop(Laptop laptop) {
		if (laptop.getSize() > size) {
			throw new IllegalArgumentException("laptop doesn't fit!");
		}

		if (this.laptop != null) {
			throw new IllegalStateException("bag already contains a laptop!");
		}

		this.laptop = laptop;
	}

	@Override
	public String toString() {
		return "LaptopBag [color=" + color + ", size=" + size + ", laptop="
				+ laptop + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + size;
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
		LaptopBag other = (LaptopBag) obj;
		if (color != other.color)
			return false;
		if (size != other.size)
			return false;
		return true;
	}

}
