package TemaLab3;

public abstract class HexColorValidator {

	static Boolean validate(String hexcolor) {
		int valid = 0;
		for (int i = 1; i < hexcolor.length(); i++) {
			if ((Character.getNumericValue(hexcolor.charAt(i)) >= 0
					&& Character.getNumericValue(hexcolor.charAt(i)) <= 9)
					|| ((int) hexcolor.charAt(i) >= (int) 'a' && (int) hexcolor.charAt(i) <= (int) 'f')) {

			} else {
				valid++;
			}
		}

		if ((hexcolor.charAt(0) == '#') && (hexcolor.length() == 7) && (valid == 0)) {
			return true;
		} else {
			return false;
		}
	}

}
