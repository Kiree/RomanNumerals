import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestRomanNumerals {

	private RomanNumerals romanNumerals;

	@Before
	public void initialize() {
		romanNumerals = new RomanNumerals();
	}

	@Test (expected = RomanNumeralsException.class)
	public void testNullString() throws RomanNumeralsException {
		//Arrange
		String nullString = null;
		//Act
		int returnedNumber = romanNumerals.convertToInteger(nullString);
	}

	@Test (expected = RomanNumeralsException.class)
	public void testEmptyString() throws RomanNumeralsException {
		//Arrange
		String emptyString = "";
		//Act
		int returnedNumber = romanNumerals.convertToInteger(emptyString);
	}

	@Test (expected = RomanNumeralsException.class)
	public void testForIncorrectCharacters() throws RomanNumeralsException {
		//Arrange
		String incorrectCharacters = "Hello there!";
		//Act
		int returnedNumber = romanNumerals.convertToInteger(incorrectCharacters);
	}

	@Test (expected = RomanNumeralsException.class)
	public void testRepeatingCharactersI() throws RomanNumeralsException {
		//Arrange
		String repeatingCharacters = "IIII";
		//Act
		int returnedNumber = romanNumerals.convertToInteger(repeatingCharacters);
	}

	@Test (expected = RomanNumeralsException.class)
	public void testRepeatingCharactersX() throws RomanNumeralsException {
		//Arrange
		String repeatingCharacters = "XXXX";
		//Act
		int returnedNumber = romanNumerals.convertToInteger(repeatingCharacters);
	}

	@Test (expected = RomanNumeralsException.class)
	public void testRepeatingCharactersC() throws RomanNumeralsException {
		//Arrange
		String repeatingCharacters = "CCCC";
		//Act
		int returnedNumber = romanNumerals.convertToInteger(repeatingCharacters);
	}

	@Test (expected = RomanNumeralsException.class)
	public void testRepeatingCharactersM() throws RomanNumeralsException {
		//Arrange
		String repeatingCharacters = "MMMM";
		//Act
		int returnedNumber = romanNumerals.convertToInteger(repeatingCharacters);
	}

	@Test (expected = RomanNumeralsException.class)
	public void testRepeatingCharactersV() throws RomanNumeralsException {
		//Arrange
		String repeatingCharacters = "VV";
		//Act
		int returnedNumber = romanNumerals.convertToInteger(repeatingCharacters);
	}

	@Test (expected = RomanNumeralsException.class)
	public void testRepeatingCharactersL() throws RomanNumeralsException {
		//Arrange
		String repeatingCharacters = "LL";
		//Act
		int returnedNumber = romanNumerals.convertToInteger(repeatingCharacters);
	}

	@Test (expected = RomanNumeralsException.class)
	public void testRepeatingCharactersD() throws RomanNumeralsException {
		//Arrange
		String repeatingCharacters = "DD";
		//Act
		int returnedNumber = romanNumerals.convertToInteger(repeatingCharacters);
	}

	@Test (expected = RomanNumeralsException.class)
	public void testRepeatingCharactersMultiple() throws RomanNumeralsException {
		//Arrange
		String repeatingCharacters = "IIIVV";
		//Act
		int returnedNumber = romanNumerals.convertToInteger(repeatingCharacters);
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
