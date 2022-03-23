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
	private static List<Inventory> zooAnimals = new ArrayList<>();
	
	/**
	 * The default constructor currently isn't needed.
	 */
	TestBench(){
	}
	
	/**
	 * Unit test instantiation of an Inventory reference variable (object)
	 * using the default constructor
	 */
	private static void unitTest1_Animal_Default() {
		
		System.out.println();
		System.out.println("Start of " + Thread.currentThread().getStackTrace()[1].getMethodName());
		System.out.println();

		//create an Inventory instance (object) using default constructor
		Inventory inventory = new Inventory();

		zooAnimals.add(inventory);
		
		displayInfo(inventory);
		
		inventory.setAge(1);
		inventory.setGender(Type.FEMALE);
		inventory.setWeight(5.5);
		
		displayInfo(inventory);	

	}
	
	/**
	 * Unit test instantiation of an Inventory reference variable (object)
	 * using the overload constructor
	 */
	private static void unitTest2_Animal_Overload() {	
		
		System.out.println();
		System.out.println("Start of " + Thread.currentThread().getStackTrace()[1].getMethodName());
		System.out.println();
		
		//create another Inventory instance (object) using overload constructor		
		Inventory inventory = new Inventory(10, Type.FEMALE, 100.0);
		
		zooAnimals.add(inventory);
		
		displayInfo(inventory);

	}

	/**
	 * Unit test instantiation of an Movie reference variable (object)
	 * using the default constructor
	 */
	private static void unitTest3_Bird_Default() {
		
		System.out.println();
		System.out.println("Start of " + Thread.currentThread().getStackTrace()[1].getMethodName());
		System.out.println();
		
		//create a Movie instance (object) using default constructor
		Movie movie = new Movie();
		zooAnimals.add(movie);
	
		displayInfo(movie);
		
		movie.setAge(1);
		movie.setGender(Type.MALE);
		movie.setWeight(0.5);
		
		displayInfo(movie);
		movie.eat();
		movie.sleep();
		movie.fly();
	}

	/**
	 * This unit test is used to instantiation an Book reference variable (object)
	 * using the overload constructor
	 */
	private static void unitTest4_Fish_Overload() {
		
		System.out.println();
		System.out.println("Start of " + Thread.currentThread().getStackTrace()[1].getMethodName());
		System.out.println();
		
		//create a Book instance (object) using overload constructor		
		Book book = new Book(2, Type.MALE, 10.5);
		zooAnimals.add(book);

		displayInfo(book);
		book.eat();
		book.sleep();
		book.swin();
	}
	
	/**
	 * This unit test is used to instantiation an Book reference variable (object)
	 * using the overload constructor
	 */
	private static void unitTest5_Invalid_Data() {
		
		System.out.println();
		System.out.println("Start of " + Thread.currentThread().getStackTrace()[1].getMethodName());
		System.out.println();
		
		Movie movie = new Movie(-2, Type.MALE, -10.5);	
		TestBench.displayInfo(movie);
		
		movie.setWingspan(-1);
		System.out.println("The bird's wingspan is " + movie.getWingspan());

		System.out.println();
		
		Book book = new Book(-2, Type.FEMALE, -10.5);	
		TestBench.displayInfo(book);
		book.setWaterType(BookType.SALT);
		System.out.println("The fish is a " + book.getWaterType() + " water fish");

	}
		
	/**
	 * Display the Inventory reference variable's id, type, type, age, and weight
	 * 
	 * @param inventory the reference variable data to be displayed
	 */
	private static void displayInfo(Inventory inventory) {
		
		System.out.printf("ID: %-3d  Type: %-10s Type: %-10s Age: %3d   Weight: %8.2f\n",
				inventory.getId(), inventory.getType(), inventory.getGender(), inventory.getAge(), inventory.getWeight());
		
	} // end of displayInfo

	/**
	 * Display all Zoo Animals stored in the ArrayList.
	 * It will display the id, type, type, age, and weight
	 */
	private static void displayReport() {
		
		System.out.println();
		System.out.println("============== ZOO REPORT ============");
		System.out.println("ID  Type       Type     Age   Weight");
		System.out.println("=== ========== ========== === ========");
		
		for (Inventory inventory : zooAnimals) {
			System.out.printf("%-3d %-10s %-10s %3d %8.2f\n",
					inventory.getId(), inventory.getType(), inventory.getGender(), inventory.getAge(), inventory.getWeight());
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
		
		TestBench.unitTest1_Animal_Default();
		TestBench.unitTest2_Animal_Overload();
		TestBench.unitTest3_Bird_Default();
		TestBench.unitTest4_Fish_Overload();
		TestBench.unitTest5_Invalid_Data();
		
		TestBench.displayReport();
		
	}  // end of main method

} // end of Main class
