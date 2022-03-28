package library.inventory;

/**
 * Enum is a special "class" that represents a group of constants 
 * Only two valid Genders are FEMALE and MALE
 * 
 * @author Robert Schwartz
 * @version 1.0
 * @since 2021.02.16
 *
 */
public enum InventoryType {
	/**
	 * InventoryType for circulating items.
	 */
	CIRCULATING,
	
	/**
	 * InventoryType for reference items.
	 */
	REFERENCE,
	
	/**
	 * InventoryType for reserve items.
	 */
	RESERVE
}
