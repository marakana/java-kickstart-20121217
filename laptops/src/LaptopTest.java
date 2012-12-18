import static org.junit.Assert.*;

import org.junit.Test;

public class LaptopTest {

	@Test
	public void test() {
		Laptop l1 = new Laptop();
		l1.size = 15;
		
		Laptop l2 = new Laptop();
		l2.size = 17;
		
		// initialize some memory
		Memory[] memory = { new Memory(), new Memory() };
		memory[0].capacity = 2048;
		memory[0].type = "SDRAM";
		memory[1].capacity = 2048;
		memory[1].type = "SDRAM";
		l1.memory = memory;

		// initialize a disk
		l1.disk = new Disk();
		l1.disk.capacity = 512;
		l1.disk.type = "SATA";

		// initialize applications
		String[] applications = { "BitTorrent", "Chrome" };
		l1.applications = applications;

		// initialize bag
		LaptopBag bag = new LaptopBag();
		bag.color = "Black";
		bag.size = 15;
		bag.contents = l1;

		System.out.println(bag);
	}

}
