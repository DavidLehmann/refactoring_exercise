package test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import main.Movie;
import main.Rental;

@RunWith(JUnit4.class)
public class RentalTest {

	private Rental rental1, rental2;
	private Movie movie1, movie2;
	private int days1 = 10, days2 = 20;
	
	@Before
	public void setup() {
		movie1 = new Movie("TestMovie1", Movie.REGULAR);
		movie2 = new Movie("TestMovie2", Movie.CHILDRENS);
		rental1 = new Rental(movie1, days1);
	}
	
	@Test
	public void testGetMovie() {
		assertEquals(movie1.getTitle(), rental1.getMovie().getTitle());
	}
	
	@Test
	public void testGetDays() {
		assertEquals(days1, rental1.getDaysRented());
	}
	
	@Test
	public void testNewRental() {
		rental2 = new Rental(movie2, days2);
		assertEquals(movie2.getTitle(), rental2.getMovie().getTitle());
		assertEquals(days2, rental2.getDaysRented());
	}
	
	
}
