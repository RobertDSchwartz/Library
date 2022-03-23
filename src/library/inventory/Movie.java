package library.inventory;

/** 
 * The Movie class is a subclass, deriving from it's parent/base class Inventory.
 * The Movie extends the Inventory class. 
 * 
 * @author Debbie Johnson
 * @version 1.0
 * @since 2021.02.16
*/
public class Movie extends Inventory {

	/**
	 * Default Inventory type is Inventory, but this should always get changes
	 * in the subclasses (child class / derived class).  It's final so it 
	 * can't be internally changed.
	 */
	final String type = "Movie";
	
	/**
	 * The bird's wingspan measured in inches.
	 */
	private double wingspan;

	/**
	 * The Movie default constructor that calls the overload constructor
	 */
	public Movie(){
		this(0, null, 0.0); //age, type, weight
	}
	
	/**
	 * Overload constructor that allows setting the object's default fields (attributes).
	 * Also sets the object's (Movie) default field (attribute) wingspan to 0.0.
	 * 
	 * @param age Default age in years is 0.
	 * @param type Default type is null.
	 * @param weight Default weight in pounds is 0.0.
	 */
	public Movie(int age, Type type, double weight) {
		super(age, type, weight);
		this.wingspan = 0.0;
	}
	
	/**
	 * Get the Inventory's type.  This parent's class method has to be 
	 * overridden in the subclass otherwise we would only see the parent's 
	 * class type value of Inventory, and instead we want it to return Movie.
	 */
	@Override // Whenever you override a method, you should use the @Override annotation so the compile verifies
	public String getType() {
		return this.type;
	}

	/**
	 * Get the bird's windspan in inches
	 * 
	 * @return The bird's wing span in inches.
	 */
	public double getWingspan() {
		return this.wingspan;
	}

	/**
	 * Set the bird's wingspan in inches.
	 * The bird's wingspan can not be negative, and if it is set it to zero.
	 * 
	 * @param wingspan The bird's wingspan in inches.
	 */
	public void setWingspan(double wingspan) {
		if(wingspan >= 0)
			this.wingspan = wingspan;
		else
			this.wingspan = 0;
	}
	
	/**
	 * All birds can fly (behavior), but some can't fly for very long :P
	 */
	public void fly() {
		System.out.println(this.type + " is flying....");
	}
	
}
