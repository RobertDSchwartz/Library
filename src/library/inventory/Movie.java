package library.inventory;

/** 
 * The Movie class is a subclass, deriving from it's parent/base class Inventory.
 * The Movie extends the Inventory class. 
 * 
 * @author Robert Schwartz
 * @version 1.0
 * @since 2021.02.16
*/
public class Movie extends Inventory {

	/**
	 * Default Inventory itemType is Inventory, but this should always get changes
	 * in the subclasses (child class / derived class).  It's final so it 
	 * can't be internally changed.
	 */
	final String itemType = "Movie";
	
	/**
	 * The bird's leangth measured in inches.
	 */
	private double leangth;

	/**
	 * The Movie default constructor that calls the overload constructor
	 */
	public Movie(){
		this(null, null, 0.0); //location, itemType, price
	}
	
	/**
	 * Overload constructor that allows setting the object's default fields (attributes).
	 * Also sets the object's (Movie) default field (attribute) leangth to 0.0.
	 * 
	 * @param location Default location is null.
	 * @param inventoryType Default itemType is null.
	 * @param price Default price in pounds is 0.0.
	 */
	public Movie(Location location, InventoryType inventoryType, double weight) {
		super(location, inventoryType, weight);
		this.leangth = 0.0;
	}
	
	/**
	 * Get the Inventory's itemType.  This parent's class method has to be 
	 * overridden in the subclass otherwise we would only see the parent's 
	 * class itemType value of Inventory, and instead we want it to return Movie.
	 */
	@Override // Whenever you override a method, you should use the @Override annotation so the compile verifies
	public String getType() {
		return this.itemType;
	}

	/**
	 * Get the bird's windspan in inches
	 * 
	 * @return The bird's wing span in inches.
	 */
	public double getLength() {
		return this.leangth;
	}

	/**
	 * Set the bird's leangth in inches.
	 * The bird's leangth can not be negative, and if it is set it to zero.
	 * 
	 * @param leangth The bird's leangth in inches.
	 */
	public void setLength(double length) {
		if(length >= 0)
			this.leangth = length;
		else
			this.leangth = 0;
	}

	/**
	 * All items can be in the library (behavior). 
	 */
	@Override
 	public void inLibrary() {
		System.out.println(this.itemType + " is in the library....");
	}
	
 	/**
 	 * All items can be held for a customer (behavior).
 	 */
	@Override
	public void hold() {
		System.out.println(this.itemType + " is on hold...");
	}
	
	/**
	 * All birds can fly (behavior), but some can't fly for very long :P
	 */
	public void show() {
		System.out.println(this.itemType + " is being shown....");
	}
	
}
