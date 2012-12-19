import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class LaptopTest {

	@Test
	public void test() {
		List<Storage> storage = new ArrayList<>();
		storage.add(new Memory("SDRAM", 2048));
		storage.add(new Memory("SDRAM", 2048));
		storage.add(new Disk("SATA", 512000));

		Laptop lappy = new Laptop(15, storage);

		// install applications
		Set<String> applications = new HashSet<>();
		applications.add("BitTorrent");
		applications.add("Chrome");
		lappy.setApplications(applications);

		// initialize bag
		LaptopBag baggy = new LaptopBag(Color.BLACK, 15);
		baggy.setLaptop(lappy);

		System.out.println(baggy);
		System.out.println(lappy.getTotalStorageCapacity());
	}

}
