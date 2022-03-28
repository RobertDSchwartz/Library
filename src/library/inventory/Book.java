package library.inventory;

/** 
 * The Book class is a subclass, deriving from it's parent/base class Inventory.
 * The Book extends the Inventory class. 
 * 
 * @author Robert Schwartz
 * @version 1.0
 * @since 2022.03.28
*/
public class Book extends Inventory {

	final String itemType = "Book";
	
	private BookGenre genre;
		
	// default constructor
	public Book(){
		/* Default location is null
		 * Default itemType is null.
		 * Default price in dollars is 0.0.
		 */
		this(null, null, 0.0); // location, itemType, price
	}
	
	/**
	 * Overload constructor that allows setting the object's default fields (attributes).
	 * 
	 * @param location Default location is null.
	 * @param inventoryType Default itemType is null.
	 * @param price Default price in Dollars is 0.0.
	 */
	public Book(Location location, InventoryType inventoryType, double price) {
		super(location, inventoryType, price);
		this.genre = null;
	}
	
	/**
	 * Get the Inventory's itemType.  This parent's class method has to be 
	 * overridden in the subclass otherwise we would only see the parent's 
	 * class itemType value of Inventory, and instead we want it to return Book.
	 */
	@Override // Whenever you override a method, you should use the @Override annotation so the compile verifies	
	public String getType() {
		return this.itemType;
	}
	
	/**
	 * Get the Book's Genre (enum: FICTION or NONFICTION).
	 * We do not need to validate BookGenre because we are using an enum
	 * 
	 * @return The book's BookGenre.
	 */
	public BookGenre getBookGenre() {
		return this.genre;
	}

	/**
	 * Set the fish's water itemType.
	 * 
	 * @param genre The book's Genre (enum: FICTION or NONFICTION).
	 */
	public void setBookGenre(BookGenre bookGenre) {
		this.genre = bookGenre;
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
	 * All books can be read (behavior).
	 */
	public void read() {
		System.out.println(this.itemType + " is being read...");
	}
	
}
