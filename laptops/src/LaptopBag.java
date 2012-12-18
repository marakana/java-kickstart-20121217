public class LaptopBag {
	String color;
	int size;
	Laptop laptop;

	void setLaptop(Laptop laptop) {
		if (laptop.size > size) {
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
