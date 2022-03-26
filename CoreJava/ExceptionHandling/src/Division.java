import java.util.Scanner;

public class Division {

	public static void main(String[] args) {

		int a, b, c;

		try (Scanner obj = new Scanner(System.in);) {
			System.out.println("Enter 2 integers");

			a = obj.nextInt();
			b = obj.nextInt();
			c = a / b;
			System.out.println("Result: " + c);
//		} catch (ArithmeticException e) {
		} catch (RuntimeException e) {
			System.out.println("Please do not enter a 0");
		} finally {
			System.out.println("Finally"); // can be used without catch
		}

		System.out.println("More Code can go here");
	}
}
