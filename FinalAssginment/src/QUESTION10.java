/*
 * 
 * 10. Write a Java program that reads a set of integers from the user and stores them in a
List. The program should then find the second largest and second smallest elements
in the List.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class QUESTION10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        System.out.print("Enter the number of elements: ");
        int count = scanner.nextInt();

        System.out.println("Enter the elements:");
        for (int i = 0; i < count; i++) {
            int num = scanner.nextInt();
            numbers.add(num);
        }

        int secondLargest = findSecondLargest(numbers);
        int secondSmallest = findSecondSmallest(numbers);

        System.out.println("Second Largest: " + secondLargest);
        System.out.println("Second Smallest: " + secondSmallest);
    }

    public static int findSecondLargest(List<Integer> numbers) {
        if (numbers.size() < 2) {
            throw new IllegalArgumentException("List must contain at least 2 elements");
        }

        Collections.sort(numbers, Collections.reverseOrder());
        return numbers.get(1);
    }

    public static int findSecondSmallest(List<Integer> numbers) {
        if (numbers.size() < 2) {
            throw new IllegalArgumentException("List must contain at least 2 elements");
        }

        Collections.sort(numbers);
        return numbers.get(1);
    }
}