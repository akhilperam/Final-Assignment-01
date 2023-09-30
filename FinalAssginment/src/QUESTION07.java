/*
 * 
 * 7. Create a Java program that implements a binary search algorithm. The program
      should accept user input for the target value and search for it in a sorted array. The
      program should return the index of the target value if found or a message if not
      found.
 */
import java.util.Arrays;
import java.util.Scanner;

public class QUESTION07 {
    public static void main(String[] args) {
        // Sorted array
        int[] array = {2, 4, 7, 10, 13, 16, 19, 22, 25, 28};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the target value: ");
        int target = scanner.nextInt();

        int index = binarySearch(array, target);

       
        if (index != -1) {
            System.out.println("Target value found at index " + index);
        } else {
            System.out.println("Target value not found in the array.");
        }
    }

   
    public static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                low = mid + 1; 
            } else {
                high = mid - 1;
            }
        }

        return -1; 
    }
}