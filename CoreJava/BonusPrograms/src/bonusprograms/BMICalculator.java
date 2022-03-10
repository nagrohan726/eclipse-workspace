package bonusprograms;

public class BMICalculator {

	public static void main(String[] args) {

		// bmi = weight in kg / (height * height)

		double height = 6;
		double weight = 99;

		double heightInMeters = height * 0.3048;

		double bmi = weight / (heightInMeters * heightInMeters);

		System.out.println("BMI: " + bmi);
	}

}
