package RealEstate;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CondoTest {

	@Test
	void testCondo() {
		Condo c= new Condo();
		assertEquals(0, c.getFloorLvl());
	}

	@Test
	void testCondoStringStringIntDoubleDoubleInt() {
		Condo c= new Condo("358 East St.", "88446", 3, 3.5, 6000, 3);
		assertEquals(3, c.getFloorLvl());
	}

	@Test
	void testGetFloorLvl() {
		Condo c= new Condo("358 East St.", "88446", 3, 3.5, 6000, 3);
		assertEquals(3, c.getFloorLvl());
	}

	@Test
	void testSetFloorlvl() {
		Condo c= new Condo("358 East St.", "88446", 3, 3.5, 6000, 3);
		assertEquals(4, c.setFloorLvl(4));
	}

	@Test
	void testCalculateAppraisalPrice(){
		Condo c= new Condo("358 East St.", "88446", 1, 1, 1, 1);
		assertEquals(18088, c.calculateAppraisalPrice());
		
	}
}
