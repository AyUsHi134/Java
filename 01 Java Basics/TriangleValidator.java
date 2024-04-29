public class TriangleValidator {

	public boolean isValidTriangle(int angle1, int angle2, int angle3) {
		if (angle1 <= 0 || angle2 <= 0 || angle3 <= 0) {
			return false;
		}

		int sumOfAngles = angle1 + angle2 + angle3;
		boolean isSumOfAngles = sumOfAngles == 180;
		return isSumOfAngles;
	}

	public static void main(String[] args) {
		TriangleValidator positive = new TriangleValidator();
		boolean validator = positive.isValidTriangle(30, 60, 90);

		if (validator) {
			System.out.println("It is a valid Triangle");
		} else {
			System.out.println("It is an invalid Triangle");
		}

	}

}
