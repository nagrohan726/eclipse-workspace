
public class FiveWithZero {

	public static void main(String[] args) {

//		int arr1[] = { 5, 3, 5, 6, 3, 5 };
//		int arr1[] = { 2, 3, 8, 5, 3, 5, 5 };
		int a[] = { 3, 4, 6, 3, 5, 7 };

//		for (int i = 0; i < arr1.length; i++) {
//			if (arr1[i] != 5)
//				continue;
//			if (i > 0 && arr1[i - 1] == 3) {
//				arr1[i] = 0;
//			}
//
//			if (i < arr1.length - 1 && arr1[i + 1] == 3) {
//				arr1[i] = 0;
//			}
//		}
//
//		for (int i : arr1) {
//			System.out.print(i + " ");
//		}

		for (int i = 0; i < a.length; i++) {
			if (a[i] == 3 && a[i + 1] == 5) {
				a[i + 1] = 0;
			}
		}

		for (int i : a) {
			System.out.print(i + " ");
		}

	}

}
