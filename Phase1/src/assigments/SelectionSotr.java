package assigments;

public class SelectionSotr {

	public static void main(String[] args) {

		int[] arr = { 101, 48, 57, 6, 565, 75, 85, 46, 82, 25, 51, 10, 1 };
		for (int i : arr)
			System.out.print(i + ",");
		int length = arr.length;
		selectionSort(arr);
		System.out.println("\nThe sorted elements are:");
		for (int i : arr)
			System.out.print(i + ",");
	}

	public static void selectionSort(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {

			int index = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[index]) {

					index = j;
				}

			}
			int smallNumber = arr[index];
			arr[index] = arr[i];
			arr[i] = smallNumber;
		}

	}
}
