public class PerfectNumberChecker {

	public boolean isPerfectNumber(int number) {
		if (number <= 0) {
			return false;
		}
		// 28- 1,2,4,7,14
		int sum = 0;

		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				sum += i;

			}
		}
		return sum == number;

	}

	public static void main(String[] args) {
		PerfectNumberChecker perfect = new PerfectNumberChecker();
		System.out.println(perfect.isPerfectNumber(6));

	}

}
