import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class LaptopTest {

	@Test
	public void test() {
		List<Storage> storage = new ArrayList<>();
		storage.add(new Memory("SDRAM", 2048));
		storage.add(new Memory("SDRAM", 2048));
		storage.add(new Disk("SATA", 512000));

		// use factory method to make a laptop
		Laptop lappy = Laptop.makeLaptop(15, storage);

		// install applications
		lappy.addApplications("BitTorrent", "Chrome");

		// initialize bag
		LaptopBag baggy = new LaptopBag(Color.BLACK, 15);
		baggy.setLaptop(lappy);

		System.out.println(baggy);
		System.out.println(lappy.getTotalStorageCapacity());
	}

}
