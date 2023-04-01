package RealEstate;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HouseTest {

	@Test
	void testHouse() {
		House c= new House();
		assertEquals(0, c.getYardAcres());
	}

	@Test
	void testHouseStringStringIntDoubleDoubleDouble() {
		House c= new House("358 East St.", "88446", 3, 3.5, 6000, 30);
		assertEquals(30, c.getYardAcres());
	}

	@Test
	void testGetYardAcres() {
		House c= new House("358 East St.", "88446", 3, 3.5, 6000, 30);
		assertEquals(30, c.getYardAcres());
	}

	@Test
	void testSetYardAcres() {
		House c= new House("358 East St.", "88446", 3, 3.5, 6000, 30);
		assertEquals(35, c.setYardAcres(35));
	}
	@Test
	void testCalculateAppraisalPrice(){
		House c= new House("358 East St.", "88446", 1, 1, 1, 1);
		assertEquals(482097, c.calculateAppraisalPrice());
		
	}

}
