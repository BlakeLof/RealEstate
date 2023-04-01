package RealEstate;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ResidentialTest {

	@Test
	void testResidential() {
		Condo c= new Condo();
		assertEquals(0, c.getBedCount());
	}

	@Test
	void testResidentialStringStringIntDoubleDouble() {
		Condo c= new Condo("358 East St.", "88446", 3, 3.5, 6000, 3);
		assertEquals(3, c.getBedCount());
	}

	@Test
	void testGetBedCount() {
		Condo c= new Condo("358 East St.", "88446", 3, 3.5, 6000, 3);
		assertEquals(3, c.getBedCount());
	}

	@Test
	void testSetBedCount() {
		Condo c= new Condo("358 East St.", "88446", 3, 3.5, 6000, 3);
		assertEquals(4, c.setBedCount(4));
	}

	@Test
	void testGetBathCount() {
		Condo c= new Condo("358 East St.", "88446", 3, 3.5, 6000, 3);
		assertEquals(3.5, c.getBathCount());
	}

	@Test
	void testSetBathCount() {
		Condo c= new Condo("358 East St.", "88446", 3, 3.5, 6000, 3);
		assertEquals(5.5, c.setBathCount(5.5));
	}

	@Test
	void testGetSize() {
		Condo c= new Condo("358 East St.", "88446", 3, 3.5, 6000, 3);
		assertEquals(6000, c.getSize());
	}

	@Test
	void testSetSize() {
		Condo c= new Condo("358 East St.", "88446", 3, 3.5, 6000, 3);
		assertEquals(7500, c.setSize(7500));
	}

}
