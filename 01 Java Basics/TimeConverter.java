public class TimeConverter {
	public static int convertHoursToMinutes(int hours) {
		if (hours < 0) {
			return -1;
		}
		int noOfMinutes = hours * 60;
		return noOfMinutes;
	}

	public static int convertDaysToMinutes(int days) {
		if (days < 0) {
			return -1;
		}

		int noOfMinutes = days * 24 * 60;
		return noOfMinutes;
	}

	public static void main(String[] args) {
		int hours = 24;
		int minutesFromHours = convertHoursToMinutes(hours);

		int days = 12;
		int minutesFromDays = convertDaysToMinutes(days);

		System.out.println(hours + " hours is equal to " + minutesFromHours + " minutes.");
		System.out.println(days + " days is equal to " + minutesFromDays + " minutes.");
	}
}
