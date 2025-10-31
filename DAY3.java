// Day 03 - Problem Solving for the Day - 12.09.2025

// A cab company charges customers based on the distance traveled:

// 1.If the ride distance is less than or equal to 5 km, the fare is ₹100 (flat rate).

// 2.If the ride distance is greater than 5 km and up to 15 km, the fare is ₹10 per km.

// 3.If the ride distance is greater than 15 km, the fare is ₹8 per km.

// Write a program using if-else conditions to calculate the cab fare for a given distance

// Test Case 1

// Input:
// Distance = 4 km
// Output:
// Fare = ₹100

// Test Case 02 

// Input:
// Distance = 10 km
// Output:
// Fare = ₹150
import java.util.Scanner;
public class DAY3 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the distance traveled in km:");

        int distance=sc.nextInt();

        int fare;

        if (distance <= 5) {
            fare = 100;
        } else if (distance >5 && distance <=15) {
            fare = distance * 10;
        } else {
            fare = distance * 8;
        }

        System.out.println("Fare = ₹" + fare);
    }
}
