import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestRomanNumerals {

	private RomanNumerals romanNumerals;

	@Before
	public void initialize() {
		romanNumerals = new RomanNumerals();
	}

	@Test
	public void testNullString() throws RomanNumeralsException {
		//Arrange
		String nullString = null;
		//Act
		int returnedNumber = romanNumerals.convertToInteger(nullString);
		//Assert
		assertEquals("Returned number should be -1.", -1, returnedNumber);
	}

	@Test
	public void testEmptyString() throws RomanNumeralsException {
		//Arrange
		String emptyString = "";
		//Act
		int returnedNumber = romanNumerals.convertToInteger(emptyString);
		//Assert
		assertEquals("Returned number should be -1.", -1, returnedNumber);
	}

	@Test
	public void testForIncorrectCharacters() throws RomanNumeralsException {
		//Arrange
		String incorrectCharacters = "Hello there!";
		//Act
		int returnedNumber = romanNumerals.convertToInteger(incorrectCharacters);
		//Assert
		assertEquals("Returned number should be -1.", -1, returnedNumber);
	}

	@Test
	public void testOne() throws RomanNumeralsException{
		//Arrange
		String one = "I";
		//Act
		int returnedNumber = romanNumerals.convertToInteger(one);
		//Assert
		assertEquals("Returned number should 1.", 1, returnedNumber);
	}

}
