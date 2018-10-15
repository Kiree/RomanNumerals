
public class RomanNumerals {
	/**
	 * public int convertToInteger
	 * Converts the given Roman numerals String into standard Arabic numbers
	 * @param romanNum - The String that has the roman numerals
	 * @return
	 * 			-1 - Error in execution
	 */
	int convertToInteger(String romanNum) throws RomanNumeralsException {

		int arabicNum = 0;

		if (isStringNotNullAndNotEmpty(romanNum) && hasOnlyAcceptedCharacters(romanNum)) {
			String preparedStr = prepareString(romanNum);
			arabicNum = 1;
		} else {
			arabicNum = -1;
		}

		return arabicNum;
		
	}


	/**
	 * private boolean isStringNotNullAndNotEmpty
	 * Checks if the given String is null or empty. The null check is performed first to ensure no NPE is thrown.
	 *
	 * @param stringToBeChecked - The String that needs to be checked
	 * @return true/false depending on if the String was null/empty or not
	 */
	private boolean isStringNotNullAndNotEmpty(String stringToBeChecked) {
		return (stringToBeChecked != null && !stringToBeChecked.isEmpty());
	}

	/**
	 * private boolean hasOnlyAcceptedCharacters
	 * Checks the given String against the regex.
	 *
	 * @param stringToBeChecked The String that needs to be checked
	 * @return true/false depending on if the Regex matched or not
	 */
	private boolean hasOnlyAcceptedCharacters(String stringToBeChecked) {
		String acceptedCharactersRegex = "[ivxlcdmIVXLCDM]+";
		return stringToBeChecked.matches(acceptedCharactersRegex);
	}

	/**
	 * private String prepareString
	 * Prepares the Roman numerals String for the operations by removing whitespace, making all
	 * characters into lowercase etc.
	 *
	 * @param originalString - The original String that will be converted
	 * @return preparedString - The original String that has been prepared.
	 */
	private String prepareString(String originalString) {
		String preparedString = originalString;

		//Remove whitespace etc.
		preparedString =  preparedString.replaceAll("\\s", "");

		//Make all characters into lowercase
		preparedString = preparedString.toLowerCase();

		return preparedString;
	}

}
