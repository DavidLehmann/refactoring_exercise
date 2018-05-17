package test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import main.Customer;
import main.Movie;
import main.Rental;

@RunWith(JUnit4.class)
public class CustomerTest {
	
	private Customer tester1,tester2;
	private String customerName = "testCustomer";
	private Movie testMovie1,testMovie2,testMovie3;
	private Rental rental1, rental2,rental3;
	
	@Before
	public void setup() {
		tester1 = new Customer(customerName);
		tester2 = new Customer(customerName + "2");
		testMovie1 = new Movie("Movie1", Movie.CHILDRENS);
		testMovie2 = new Movie("Movie2", Movie.REGULAR);
		testMovie3 = new Movie("Movie3", Movie.NEW_RELEASE);
		rental1 = new Rental(testMovie1, 10);
		rental2 = new Rental(testMovie2, 20);
		rental3 = new Rental(testMovie3, 30);
	}
	
	@Test
	public void getNameTest() {
		assertEquals(customerName, tester1.getName());
	}
	
	@Test
	public void statmentTest1() {
		tester1.addRental(rental1);
		tester1.addRental(rental2);
		
		String expected = "Rental Record for testCustomer\n" + 
				"	Title		Days	Amount\n" + 
				"	Movie1		10	12.0\n" + 
				"	Movie2		20	29.0\n" + 
				"Amount owed is 41.0\n" + 
				"You earned 2 frequent renter points";
		assertEquals(expected, tester1.statement());
	}
	
	@Test
	public void statmentTest2() {
		tester2.addRental(rental3);
		tester2.addRental(rental2);
		tester2.addRental(rental1);
		
		String expected = "Rental Record for testCustomer2\n" + 
				"	Title		Days	Amount\n" + 
				"	Movie3		30	90.0\n" + 
				"	Movie2		20	29.0\n" + 
				"	Movie1		10	12.0\n" + 
				"Amount owed is 131.0\n" + 
				"You earned 4 frequent renter points";
		assertEquals(expected, tester2.statement());
	}
	
}
