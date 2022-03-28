package library.testing; // keeping the testbench logic separate

import java.util.ArrayList;
import java.util.List;

import library.inventory.*;

/** 
 * The TestBench class contains multiple unit testing methods for testing
 * the Inventory base (super or parent) and derived (sub or child) classes.
 * 
 * Since there should only be one TestBench running, all helper methods
 * are static.  We do not need to create a TestBench object to run the 
 * individual unit testing methods (helper methods).  
 * 
 * No other class needs to access the helper methods so all the unit testing
 * methods are defined as private. 
 * 
 * @author Debbie Johnson
 * @version 1.0
 * @since 2021.02.16
 */
public class TestBench {
	
	/**
	 * Stores all types of zoo animals as long as it's a derived from the Inventory class.
	 */
	private static List<Inventory> libraryItems = new ArrayList<>();
	
	/**
	 * The default constructor currently isn't needed.
	 */
	TestBench(){
	}
	
	/**
	 * Unit test instantiation of an Inventory reference variable (object)
	 * using the default constructor
	 */
	private static void unitTest1_Inventory_Default() {
		
		System.out.println();
		System.out.println("Start of " + Thread.currentThread().getStackTrace()[1].getMethodName());
		System.out.println();

		//create an Inventory instance (object) using default constructor
		Inventory inventory = new Inventory();

		libraryItems.add(inventory);
		
		TestBench.displayInfo(inventory);
		
		inventory.setLocation(Location.BASEMENT);
		inventory.setInventoryType(InventoryType.RESERVE);
		inventory.setPrice(5.5);
		
		TestBench.displayInfo(inventory);	
		
		System.out.println();
		System.out.println("End of " + Thread.currentThread().getStackTrace()[1].getMethodName());
		System.out.println();

	}
	
	/**
	 * Unit test instantiation of an Inventory reference variable (object)
	 * using the overload constructor
	 */
	private static void unitTest2_Inventory_Overload() {	
		
		System.out.println();
		System.out.println("Start of " + Thread.currentThread().getStackTrace()[1].getMethodName());
		System.out.println();
		
		//create another Inventory instance (object) using overload constructor		
		Inventory inventory = new Inventory(Location.FIRST, InventoryType.RESERVE, 15.99);
		
		libraryItems.add(inventory);
		
		TestBench.displayInfo(inventory);
		
		System.out.println();
		System.out.println("End of " + Thread.currentThread().getStackTrace()[1].getMethodName());
		System.out.println();

	}

	/**
	 * Unit test instantiation of an Movie reference variable (object)
	 * using the default constructor
	 */
	private static void unitTest3_Movie_Default() {
		
		System.out.println();
		System.out.println("Start of " + Thread.currentThread().getStackTrace()[1].getMethodName());
		System.out.println();
		
		//create a Movie instance (object) using default constructor
		Movie movie = new Movie();
		libraryItems.add(movie);
	
		TestBench.displayInfo(movie);
		
		movie.setLocation(Location.BASEMENT);
		movie.setInventoryType(InventoryType.CIRCULATING);
		movie.setPrice(9.59);
		
		TestBench.displayInfo(movie);
		movie.inLibrary();
		movie.hold();
		movie.show();
		
		System.out.println();
		System.out.println("End of " + Thread.currentThread().getStackTrace()[1].getMethodName());
		System.out.println();
	}

	/**
	 * This unit test is used to instantiation an Book reference variable (object)
	 * using the overload constructor
	 */
	private static void unitTest4_Book_Overload() {
		
		System.out.println();
		System.out.println("Start of " + Thread.currentThread().getStackTrace()[1].getMethodName());
		System.out.println();
		
		//create a Book instance (object) using overload constructor		
		Book book = new Book(Location.SECOND, InventoryType.CIRCULATING, 10.5);
		libraryItems.add(book);

		TestBench.displayInfo(book);
		book.inLibrary();
		book.hold();
		book.read();
		
		System.out.println();
		System.out.println("End of " + Thread.currentThread().getStackTrace()[1].getMethodName());
		System.out.println();
	}
	
	/**
	 * This unit test is used to instantiation an Book reference variable (object)
	 * using the overload constructor
	 */
	private static void unitTest5_Invalid_Data() {
		
		System.out.println();
		System.out.println("Start of " + Thread.currentThread().getStackTrace()[1].getMethodName());
		System.out.println();
		
		Movie movie = new Movie(null, InventoryType.REFERENCE, -10.5);
		libraryItems.add(movie);	
		
		TestBench.displayInfo(movie);
		
		movie.setLength(-1);
		System.out.println("The movie's length is " + movie.getLength());

		System.out.println();
		
		Book book = new Book(null, InventoryType.RESERVE, -10.5);	
		libraryItems.add(book);
		
		TestBench.displayInfo(book);
		book.setBookType(BookType.FICTION);
		System.out.println("The book is a " + book.getBookType() + " book");
		
		System.out.println();
		System.out.println("End of " + Thread.currentThread().getStackTrace()[1].getMethodName());
		System.out.println();

	}
		
	/**
	 * Display the Inventory reference variable's id, itemType, itemType, location, and price
	 * 
	 * @param inventory the reference variable data to be displayed
	 */
	private static void displayInfo(Inventory inventory) {
		
		System.out.printf("ID: %-3d  InventoryType: %-10s InventoryType: %-10s Location: %-9s   Price: %8.2f\n",
				inventory.getId(), inventory.getType(), inventory.getInventoryType(), inventory.getLocation(), inventory.getPrice());
		
	} // end of displayInfo

	/**
	 * Display all Zoo Animals stored in the ArrayList.
	 * It will display the id, itemType, itemType, location, and price
	 */
	private static void displayReport() {
		
		System.out.println();
		System.out.println("================= ZOO REPORT ================");
		System.out.println("ID  ItemType   InventoryType  Location Price");
		System.out.println("=== ========== ============== ======== ======");
		
		for (Inventory inventory : libraryItems) {
			System.out.printf("%-3d %-10s %-14s %-9s %4.2f\n",
					inventory.getId(), inventory.getType(), inventory.getInventoryType(), inventory.getLocation(), inventory.getPrice());
		}
		
		System.out.println();
		
	} // end of displayReport method
	
	/**
	 * The testbench to regression test that the Inventory base and subclasses are
	 * working correctly.
	 * 
	 * @param args this program doesn't use command line input arguments
	 */
	public static void main(String[] args) {
		
		TestBench.unitTest1_Inventory_Default();
		TestBench.unitTest2_Inventory_Overload();
		TestBench.unitTest3_Movie_Default();
		TestBench.unitTest4_Book_Overload();
		TestBench.unitTest5_Invalid_Data();
		
		TestBench.displayReport();
		
	}  // end of main method

} // end of Main class
