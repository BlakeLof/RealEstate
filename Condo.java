package RealEstate;

public class Condo extends Residential{
	//subclass of residential
	
	//attributes
	int floorLvl;
	
	//default
	public Condo() {
		super();
		floorLvl = 0;
	}
	
	//constructor
	public Condo(String s, String z, int bed, double bath, double sqr, int f) {
		super(s,z,bed, bath, sqr);
		floorLvl = f;
	}
	
	//returns floor level
	public int getFloorLvl() {
		return floorLvl;
	}
	
	//sets and returns floor level
	public int setFloorLvl(int f) {
		floorLvl = f;
		return floorLvl;
	}

	//calculates the appraisal price
	@Override
	public double calculateAppraisalPrice() {
		double cost = 0;
		if (floorLvl >1) {
			floorLvl--;
			cost = floorLvl * 5000;
		} else {
			cost = 0;
		}
		cost= cost + (8000 * getBedCount());
		cost= cost + (10000 *getBathCount());
		cost= cost + (88 * getSize());
		setAppraisalPrice(cost);
		return cost;

	}
}
