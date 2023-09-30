/*
 * 
 * 6. Write a Java program that uses stream api to perform operations on a large data set,
      such as sorting or filtering the data.
 */


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class QUESTION06 {
    public static void main(String[] args) 
    {
        // Create a large dataset
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 1000000; i++) {
            numbers.add(i);
        }

        // Sorting the data using Stream API
        List<Integer> sortedNumbers = numbers.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Sorted Numbers:");
        for (int number : sortedNumbers) {
            System.out.println(number);
        }

        // Filtering the data using Stream API
        List<Integer> evenNumbers = numbers.stream()
                .filter(number -> number % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("Even Numbers:");
        for (int number : evenNumbers) {
            System.out.println(number);
        }
    }
}