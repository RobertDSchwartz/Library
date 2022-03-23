package library.inventory;

/*  
 * The Book class is a subclass, deriving from it's parent/base class Inventory.
 * The Book extends the Inventory class. 
*/
public class Book extends Inventory {

	final String type = "Book";
	
	private BookType waterType;
		
	// default constructor
	public Book(){
		/* Default age in years is 0.
		 * Default type is null.
		 * Default weight in pounds is 0.0.
		 */
		this(0, null, 0.0); // age, type, weight
	}
	
	/**
	 * Overload constructor that allows setting the object's default fields (attributes).
	 * 
	 * @param age Default age in years is 0.
	 * @param type Default type is null.
	 * @param weight Default weight in pounds is 0.0.
	 */
	public Book(int age, Type type, double weight) {
		super(age, type, weight);
		this.waterType = null;
	}
	
	/**
	 * Get the Inventory's type.  This parent's class method has to be 
	 * overridden in the subclass otherwise we would only see the parent's 
	 * class type value of Inventory, and instead we want it to return Book.
	 */
	@Override // Whenever you override a method, you should use the @Override annotation so the compile verifies	
	public String getType() {
		return this.type;
	}
	
	/**
	 * Get the fish's BookType type (enum: FRESH or SALT).
	 * We do not need to validate BookType type because we are using an enum
	 * 
	 * @return The fish's BookType type.
	 */
	public BookType getWaterType() {
		return this.waterType;
	}

	/**
	 * Set the fish's water type.
	 * 
	 * @param waterType The fish BookType type (enum: FRESH or SALT).
	 */
	public void setWaterType(BookType waterType) {
		this.waterType = waterType;
	}	

	/**
	 * All fish can swim (behavior).
	 */
	public void swin() {
		System.out.println(this.type + " is swimming...");
	}
	
}
