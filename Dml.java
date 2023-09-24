// Define a package named "ad221.milstein"
package ad221.milstein;

// Define a public class named "Dml"
public class Dml {

    // Define a method named "chheckArr" that takes an array of integers as input
    public static boolean chheckArr(int[] array) {
        // Start a loop that iterates through the elements of the array (excluding the first element)
        for (int i = 1; i < array.length; i++) {
            // Check if the current element is less than the previous element in the array
            if (array[i] < array[i - 1]) {
                // If true, return false, indicating that the array is not sorted in ascending order
                return false;
            }
        }
        // If the loop completes without finding any out-of-order elements, return true
        return true;
    }

    // Define a method named "fizzBuzzGame"
    public static void fizzBuzzGame() {
        // Start a loop that iterates from 1 to 100 (inclusive)
        for (int i = 1; i <= 100; i++) {
            // Check if the current number is divisible by 3 and 5 (i.e., a multiple of 15)
            if (i % 3 == 0 && i % 5 == 0) {
                // If true, print "FizzBuzz" followed by a space
                System.out.print("FizzBuzz ");
            }
            // Check if the current number is divisible by 3
            else if (i % 3 == 0) {
                // If true, print "Fizz" followed by a space
                System.out.print("Fizz ");
            }
            // Check if the current number is divisible by 5
            else if (i % 5 == 0) {
                // If true, print "Buzz" followed by a space
                System.out.print("Buzz ");
            }
            // If none of the above conditions are met, print the current number followed by a space
            else {
                System.out.print(i + " ");
            }
        }
    }
    
    public static boolean checkSplit(int[] array) { // Define a method named "checkSplit" that takes an array of integers as input
        // Initialize variables "l" and "r" to keep track of the sum of elements on the left and right sides
        int l = 0;
        int r = 0;
        for (int i = 0; i < array.length - 1; i++) { // Start a loop that iterates through the array elements (except the last element)
            l += array[i];  // Add the current element to the sum on the left side
            r = 0;          // Reset the sum on the right side to 0
            for (int j = i + 1; j < array.length; j++) {  // Start an inner loop that iterates through the elements to the right of the current element
                r += array[j]; // Add the current element to the sum on the right side
            }
            if (l == r) {    // Check if the sum on the left side is equal to the sum on the right side
                return true; // If true, return true, indicating that the array can be split into two subarrays with equal sums
            }
        }
        return false; // If the loop completes without finding a split with equal sums, return false
    }

    public static void main(String[] args) {     // The main method is the entry point of the program

        // Create three arrays of integers
        int[] array1 = {1, 1, 1, 2, 1};
        int[] array2 = {2, 1, 1, 2, 1};
        int[] array3 = {10, 10};
    
        System.out.println(chheckArr(array1)); // Call the "chheckArr" method with "array1" and print the result (true)
        fizzBuzzGame(); // Call the "fizzBuzzGame" method to play the FizzBuzz game
        System.out.println();
        System.out.println(checkSplit(array2));    // Call the "checkSplit" method with "array2" and print the result (false)
    }
}
