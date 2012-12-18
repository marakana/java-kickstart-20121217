import static org.junit.Assert.*;

import org.junit.Test;

public class LaptopTest {

	@Test
	public void test() {
		Storage[] storage = { new Memory("SDRAM", 2048), new Memory("SDRAM", 2048), new Disk("SATA", 512000) };
		Laptop l1 = new Laptop(15, storage);

		// install applications
		String[] applications = { "BitTorrent", "Chrome" };
		l1.setApplications(applications);

		// initialize bag
		LaptopBag bag = new LaptopBag(Color.BLACK, 15);
		bag.setLaptop(l1);

		System.out.println(bag);
		System.out.println(l1.getTotalStorageCapacity());
	}

}
