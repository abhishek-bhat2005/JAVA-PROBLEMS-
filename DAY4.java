// Day 04 - Problem Solving for the Day - 13.09.2025

// In a classroom, each student’s marks in Mathematics are stored in an array.

// Your task is to:

// 1.Find the highest mark.

// 2.Find the lowest mark.

// 3.Calculate the average mark.

// 4.Count how many students failed (marks < 40).

// Test Case 01

// Input:
// marks = [45, 78, 89, 34, 56]

// Output:
// Highest = 89
// Lowest = 34
// Average = 60.4
// Failed Students = 1

// Test Case 02

// Input:
// marks = [10, 20, 30, 40, 50]

// Output:
// Highest = 50
// Lowest = 10
// Average = 30.0
// Failed Students = 3
import java.util.Scanner;

public class DAY4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] marks = new int[n];
        System.out.println("Enter the marks of each student:");
        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
        }

        // Initialize variables
        int highest = marks[0];
        int lowest = marks[0];
        int failed = 0;
        int sum = 0;

        // Process marks
        for (int i = 0; i < n; i++) {
            if (marks[i] > highest) {
                highest = marks[i];
            }
            if (marks[i] < lowest) {
                lowest = marks[i];
            }
            if (marks[i] < 40) {
                failed++;
            }
            sum += marks[i];
        }

        double average = (double) sum / n;

        // Display results
        System.out.println("Highest = " + highest);
        System.out.println("Lowest = " + lowest);
        System.out.println("Average = " + average);
        System.out.println("Failed Students = " + failed);

        sc.close();
    }
}
