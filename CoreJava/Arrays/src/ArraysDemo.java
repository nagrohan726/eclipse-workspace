
public class ArraysDemo {

	public static void main(String[] args) {

//		int arr[5];		// invalid

//		int arr[] = { 10, 20, 30, 40, 50 };

		int arr[] = new int[5];

		arr[0] = 10;
		arr[1] = new Integer(20); // Autoboxing -- automatically converts objects into primitive types
//		arr[2] = 30.54;

		arr[2] = (int) 30.54;

//		arr[7] = 70;		// ArrayIndexOutOfBoundsException

		System.out.println("Elements of the array: ");
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}

		for (int element : arr) {
			System.out.println(element);
		}

		long[] arr1 = new long[4];

		for (long element : arr1) {
			System.out.println(element);
		}

		float[] arr2 = new float[4];

		for (float element : arr2) {
			System.out.println(element);
		}

	}

}
