package test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import main.Movie;

@RunWith(JUnit4.class)
public class MovieTest {
	
	private Movie testMovie1,testMovie2;
	private String movieTitle1 = "TestMovie1", movieTitle2 = "TestMovie2";
	private int moviePriceCode1 = 1 ,moviePriceCode2 = 2;
	
	@Before
	public void setup() {
		testMovie1 = new Movie(movieTitle1, moviePriceCode1);
		testMovie2 = null;
	}
	
	@Test
	public void testGetTitle() {
		assertEquals(movieTitle1, testMovie1.getTitle());
	}
	
	@Test
	public void testGetPriceCode() {
		assertEquals(moviePriceCode1, testMovie1.getPriceCode());
	}
	
	@Test
	public void testNewMovie() {
		testMovie2 = new Movie(movieTitle2, moviePriceCode2);
		assertEquals(movieTitle2, testMovie2.getTitle());
		assertEquals(moviePriceCode2, testMovie2.getPriceCode());
		
	}
	
}
