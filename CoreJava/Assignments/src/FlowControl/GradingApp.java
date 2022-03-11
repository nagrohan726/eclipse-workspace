package FlowControl;

public class GradingApp {

	public static void main(String[] args) {

		short maths = 80;
		short physics = 60;
		short chemistry = 70;

		if (maths < 35 || physics < 35 || chemistry < 35) {
			System.out.println("Result: Failed!");
		} else {
			float average = (maths + physics + chemistry) / 3;

			System.out.println("Result: Passed!");
			if (average <= 59) {
				System.out.println("Grade: C");
			} else if (average <= 69) {
				System.out.println("Grade: B");
			} else {
				System.out.println("Grade: A");
			}

		}
	}

}
