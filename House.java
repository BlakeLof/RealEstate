package RealEstate;

public class House extends Residential{
	// subclass of residential
	
	//attributes
	private double yardAcres;
	
	//default
	public House() {
		super();
		yardAcres = 0;
	}
	
	//constructor
	public House(String s, String z, int bed, double bath, double sqr, double yar) {
		super(s,z,bed, bath, sqr);
		yardAcres = yar;
	}
	
	//returns acres in yard
	public double getYardAcres() {
		return yardAcres;
	}
	
	// sets and returns acres in yard
	public double setYardAcres(double y) {
		yardAcres = y;
		return yardAcres;
	}

	//calculates the appraisal price
	@Override
	public double calculateAppraisalPrice() {
		double cost = 0;
		int yard = (int)yardAcres;
		cost = cost + (yard * 460000);
		cost= cost + (10000 * getBedCount());
		cost= cost + (12000 *getBathCount());
		cost= cost + (97 * getSize());
		setAppraisalPrice(cost);
		return cost;
		
	}

}
