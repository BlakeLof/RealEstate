package RealEstate;

public abstract class Residential extends Property {
	//subclass of property
	
	//Attributes
	private int bedCount;
	private double bathCount;
	private double sqrFt;

	//Default constructor
	public Residential() {
		super();
		bedCount = 0;
		bathCount = 0;
		sqrFt = 0;
	}
	
	//constructor
	public Residential(String s, String z, int bed, double bath, double sqr) {
		super(s,z);
		bedCount = bed;
		bathCount = bath;
		sqrFt = sqr;
	}

	// returns number of beds
	public int getBedCount() {
		return bedCount;
	}

	//sets and then returns the bed count
	public int setBedCount(int bed) {
		bedCount = bed;
		return bedCount;
	}

	//returns number of baths
	public double getBathCount() {
		return bathCount;
	}

	//sets and then returns number of bath count
	public double setBathCount(double bath) {
		bathCount = bath;
		return bathCount;
	}

	//returns square footage
	public double getSize() {
		return sqrFt;
	}

	//sets and returns square footage
	public double setSize(double sqr) {
		sqrFt = sqr;
		return sqrFt;
	}
	//abstract method for calculating the appraisal price
	public abstract double calculateAppraisalPrice();
	
	
	
	
}
