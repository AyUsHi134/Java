public class ExamResult {

	public boolean isPass(int marks) {
		if (marks > 50) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		ExamResult number = new ExamResult();
		boolean result = number.isPass(25);

		if (result) {
			System.out.println("The student has passed.");
		} else {
			System.out.println("The student has failed.");
		}
	}

}
