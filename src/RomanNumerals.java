
class RomanNumerals {
	/**
	 * public int convertToInteger
	 * Converts the given Roman numerals String into standard Arabic numbers.
     *
     * @throws RomanNumeralsException - Thrown if the romanNum to be converted is incorrect.
	 * @param romanNum - The String that has the roman numerals
	 * @return
	 * 			0 - Default
	 */
	int convertToInteger(String romanNum) throws RomanNumeralsException {

		int arabicNum = 0;

		if (isStringNotNullAndNotEmpty(romanNum) && hasOnlyAcceptedCharacters(romanNum)) {
			String preparedStr = prepareString(romanNum);
			if (hasNoTooManyCharactersInARow(preparedStr)) {
                arabicNum = 1;
            } else {
			    throw new RomanNumeralsException();
            }
		} else {
			throw new RomanNumeralsException();
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
     * private boolean hasNoTooManyCharactersInARow
     * Checks the given String for character repeating errors.
     * I, X, C and M may not repeat more than thrice in a row.
     * V, L and D may not repeat in a row.
     *
     * @param stringToBeChecked - The String to be checked.
     * @return true if the String had no violations, false if yes.
     */
	private boolean hasNoTooManyCharactersInARow(String stringToBeChecked) {
	    return !(hasQuadrupleLetterViolations(stringToBeChecked) || hasUniqueLetterViolations(stringToBeChecked));
    }

    /**
     * private boolean hasQuadrupleLetterViolations
     * Checks if I, X, C or M repeat more than thrice in a row in the given String.
     *
     * @param stringToBeChecked - The String to be checked.
     * @return true if violations, false if no
     */
    private boolean hasQuadrupleLetterViolations(String stringToBeChecked) {
	    return (stringToBeChecked.contains("iiii")
                || stringToBeChecked.contains("xxxx")
                || stringToBeChecked.contains("cccc")
                || stringToBeChecked.contains("mmmm"));
    }

    /**
     * private boolean hasUniqueLetterViolations
     * Checks if V, L or D repeat in a row in the given String.
     *
     * @param stringToBeChecked - The String to be checked.
     * @return true if violations, false if no
     */
    private boolean hasUniqueLetterViolations(String stringToBeChecked) {
	    return (stringToBeChecked.contains("vv")
                || stringToBeChecked.contains("ll")
                || stringToBeChecked.contains("dd"));
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
