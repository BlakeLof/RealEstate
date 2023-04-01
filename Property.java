package RealEstate;

public abstract class  Property {
	// main class
	
	//attributes
	private String streetAddress;
	private String zipcode;
	private double listPrice;
	private double appraisalPrice;
	
	//default
	public Property() {
		streetAddress = "";
		zipcode = "";
		listPrice = 0;
		appraisalPrice = 0;
	}
	
	//constructor
	public Property(String s, String z) {
		streetAddress = s;
		zipcode = z;
		}
	
	//returns address
	public String getStreetAddress() {
		return streetAddress;
	}
	
	//returns zipcode
	public String getZip() {
		return zipcode;
	}
	
	//sets and returns address
	public String setStreetAddress(String s) {
		streetAddress = s;
		return streetAddress;
	}
	
	//sets and returns zipcode
	public String setZip(String z) {
		zipcode = z;
		return zipcode;
	}
	//returns list price
	public double getListPrice() {
		return listPrice;
	}
	//sets and returns list price
	public double setListPrice(double list) {
		listPrice=list;
		return listPrice;
	}
	//returns the appraisal price
	public double getAppraisalPrice() {
		return appraisalPrice;
	}
	//sets the appraisal price
	protected void setAppraisalPrice(double appraise) {
		appraisalPrice=appraise;
	}
	//abstract method for calculating the appraisal price
	public abstract double calculateAppraisalPrice();
	
	
}
