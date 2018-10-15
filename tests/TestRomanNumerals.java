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
		String repeatingCharacters = "IIIvv";
		//Act
		int returnedNumber = romanNumerals.convertToInteger(repeatingCharacters);
	}

	@Test
	public void testStandardNumbers() throws RomanNumeralsException {
		//Arrange
		String one = "I";
		String five = "V";
		String ten = "X";
		String fifty = "L";
		String hundred = "C";
		String fiveHundred = "D";
		String thousand = "M";

		//Act
		int oneInt = romanNumerals.convertToInteger(one);
		int fiveInt = romanNumerals.convertToInteger(five);
		int tenInt = romanNumerals.convertToInteger(ten);
		int fiftyInt = romanNumerals.convertToInteger(fifty);
		int hundredInt = romanNumerals.convertToInteger(hundred);
		int fiveHundredInt = romanNumerals.convertToInteger(fiveHundred);
		int thousandInt = romanNumerals.convertToInteger(thousand);

		//Assert
		assertEquals("Returned number should 1.", 1, oneInt);
		assertEquals("Returned number should be 5.", 5, fiveInt);
		assertEquals("Returned number should be 10.", 10, tenInt);
		assertEquals("Returned number should be 50.", 50, fiftyInt);
		assertEquals("Returned number should be 100.", 100, hundredInt);
		assertEquals("Returned number should be 500.", 500, fiveHundredInt);
		assertEquals("Returned number should be 1000.", 1000, thousandInt);
	}

	@Test
	public void testSubtractiveNumbers() throws RomanNumeralsException {
		//Arrange
		String four = "IV";
		String nine = "IX";
		String forty = "XL";
		String ninety = "XC";
		String fourHundred = "CD";
		String nineHundred = "CM";

		//Act
		int fourInt = romanNumerals.convertToInteger(four);
		int nineInt = romanNumerals.convertToInteger(nine);
		int fortyInt = romanNumerals.convertToInteger(forty);
		int ninetyInt = romanNumerals.convertToInteger(ninety);
		int fourHundredInt = romanNumerals.convertToInteger(fourHundred);
		int nineHundredInt = romanNumerals.convertToInteger(nineHundred);

		//Assert
		assertEquals("Returned number should be 4.", 4, fourInt);
		assertEquals("Returned number should be 9.", 9, nineInt);
		assertEquals("Returned number should be 40.", 40, fortyInt);
		assertEquals("Returned number should be 90.", 90, ninetyInt);
		assertEquals("Returned number should be 400.", 400, fourHundredInt);
		assertEquals("Returned number should be 900.", 900, nineHundredInt);
	}

	@Test
	public void testAdditiveNumbers() throws RomanNumeralsException {
		//Arrange
		String two = "II";
		String three = "III";
		String six = "VI";
		String seven = "VII";
		String eight = "VIII";

		String twenty = "XX";
		String thirty = "XXX";
		String sixty = "LX";
		String seventy = "LXX";
		String eighty = "LXXX";

		String twoHundred = "CC";
		String threeHundred = "CCC";
		String sixHundred = "DC";
		String sevenHundred = "DCC";
		String eightHundred = "DCCC";

		//Act
		int twoInt = romanNumerals.convertToInteger(two);
		int threeInt = romanNumerals.convertToInteger(three);
		int sixInt = romanNumerals.convertToInteger(six);
		int sevenInt = romanNumerals.convertToInteger(seven);
		int eightInt = romanNumerals.convertToInteger(eight);

		int twentyInt = romanNumerals.convertToInteger(twenty);
		int thirtyInt = romanNumerals.convertToInteger(thirty);
		int sixtyInt = romanNumerals.convertToInteger(sixty);
		int seventyInt = romanNumerals.convertToInteger(seventy);
		int eightyInt = romanNumerals.convertToInteger(eighty);

		int twoHundredInt = romanNumerals.convertToInteger(twoHundred);
		int threeHundredInt = romanNumerals.convertToInteger(threeHundred);
		int sixHundredInt = romanNumerals.convertToInteger(sixHundred);
		int sevenHundredInt = romanNumerals.convertToInteger(sevenHundred);
		int eightHundredInt = romanNumerals.convertToInteger(eightHundred);

		//Assert
		assertEquals("Returned number should be 2.", 2, twoInt);
		assertEquals("Returned number should be 3.", 3, threeInt);
		assertEquals("Returned number should be 6.", 6, sixInt);
		assertEquals("Returned number should be 7.", 7, sevenInt);
		assertEquals("Returned number should be 8.", 8, eightInt);

		assertEquals("Returned number should be 20.", 20, twentyInt);
		assertEquals("Returned number should be 30.", 30, thirtyInt);
		assertEquals("Returned number should be 60.", 60, sixtyInt);
		assertEquals("Returned number should be 70.", 70, seventyInt);
		assertEquals("Returned number should be 80.", 80, eightyInt);

		assertEquals("Returned number should be 200.", 200, twoHundredInt);
		assertEquals("Returned number should be 300.", 300, threeHundredInt);
		assertEquals("Returned number should be 600.", 600, sixHundredInt);
		assertEquals("Returned number should be 700.", 700, sevenHundredInt);
		assertEquals("Returned number should be 800.", 800, eightHundredInt);
	}

	@Test
	public void test2018String() throws RomanNumeralsException {
		//Arrange
		String currentYear = "MMXVIII";
		//Act
		int currentYearInt = romanNumerals.convertToInteger(currentYear);
		//Assert
		assertEquals("Returned number should be 2018.", 2018, currentYearInt);
	}

	@Test
	public void test1992String() throws RomanNumeralsException {
		//Arrange
		String birthYear = "MCMXCII";
		//Act
		int birthYearInt = romanNumerals.convertToInteger(birthYear);
		//Assert
		assertEquals("Returned number should be 2018.", 1992, birthYearInt);
	}

}
