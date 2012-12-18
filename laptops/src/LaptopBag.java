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

}
