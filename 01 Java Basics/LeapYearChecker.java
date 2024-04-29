public class LeapYearChecker {
	public boolean isLeapYear(int year) {

		if (year <= 0) {
			return false;
		}

		if (year % 4 != 0) {
			return false;
		}

		if (year % 100 != 0) {
			return true;
		}

		if (year % 400 == 0) {
				return true;
		} else {
				return false;
			}
	}


	public static void main(String[] args) {
		LeapYearChecker leap = new LeapYearChecker();
		System.out.println(leap.isLeapYear(5600));
	}

}
