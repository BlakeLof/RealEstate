package RealEstate;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PropertyTest {

	@Test
	void testProperty() {
		Condo c= new Condo();
		assertEquals("", c.getStreetAddress());
	}

	@Test
	void testPropertyStringString() {
		Condo c= new Condo("358 East St.", "88446", 3, 3.5, 6000, 3);
		assertEquals("358 East St.", c.getStreetAddress());
	}

	@Test
	void testGetStreetAddress() {
		Condo c= new Condo("358 East St.", "88446", 3, 3.5, 6000, 3);
		assertEquals("358 East St.", c.getStreetAddress());
	}

	@Test
	void testGetZip() {
		Condo c= new Condo("358 East St.", "88446", 3, 3.5, 6000, 3);
		assertEquals("88446", c.getZip());
	}

	@Test
	void testSetStreetAddress() {
		Condo c= new Condo("358 East St.", "88446", 3, 3.5, 6000, 3);
		assertEquals("422 South Pl.", c.setStreetAddress("422 South Pl."));
	}

	@Test
	void testSetZip() {
		Condo c= new Condo("358 East St.", "88446", 3, 3.5, 6000, 3);
		assertEquals("84465", c.setZip("84465"));
	}
	
	@Test
	void testgetListPrice() {
		Condo c= new Condo("358 East St.", "88446", 3, 3.5, 6000, 3);
		assertEquals(0, c.getListPrice());
	}
	@Test
	void testSetListPrice() {
		Condo c= new Condo("358 East St.", "88446", 3, 3.5, 6000, 3);
		assertEquals(4600000, c.setListPrice(4600000));
	}
	@Test
	void testGetAppraisalPrice() {
		Condo c= new Condo("358 East St.", "88446", 3, 3.5, 6000, 3);
		assertEquals(0, c.getAppraisalPrice());
	}
	@Test
	void testSetAppraisalPrice() {
		Condo c= new Condo("358 East St.", "88446", 3, 3.5, 6000, 3);
		c.setAppraisalPrice(350000);
		assertEquals(350000, c.getAppraisalPrice());
	}

}
