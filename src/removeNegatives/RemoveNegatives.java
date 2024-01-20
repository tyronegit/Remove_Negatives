package removeNegatives;

public class RemoveNegatives {

	public static void main(String[] args) {
		int[] arr = { 1, -2, 3, -4, 5, -6 }; // declare the array to manipulate
		removeNegatives(arr); // call the method to remove negatives

		// Printing the modified array
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}

	// removeNegatives method
	public static void removeNegatives(int[] arr) {
		int nonNegIndex = 0; // declare variable for nonNegIndex

		for (int i = 0; i < arr.length; i++) { // use for loop to move non negative numbers to the front of the array index order
			if (arr[i] >= 0) {  // If index is greater than 0, swap it and place it in order
				// If the current element is non-negative, swap it with the next non-negative
				// position
				int temp = arr[i];
				arr[i] = arr[nonNegIndex];
				arr[nonNegIndex] = temp;
				

				// Move the non-negative index to the next position
				nonNegIndex++;
			}
		}
	}
}

/*
 * This implementation uses a two-pointer approach to iterate through the array. The 
 * nonNegIndex keeps track of the next position where a non-negative element should be
 * placed. When a non-negative element is encountered, it is swapped with the element
 * at the nonNegIndex position, and the nonNegIndex is incremented. This way, the array
 * is modified in-place, removing negative values and preserving the order of non-negatives.
 * */
