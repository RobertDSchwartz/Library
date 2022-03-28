package library.inventory;

/**
 * Enum is a special "class" that represents a group of constants 
 * Only three valid InventoryTypes are CIRCULATING, REFERENCE and RESERVE
 * 
 * @author Robert Schwartz
 * @version 1.0
 * @since 2022.03.28
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
