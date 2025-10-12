//Java program to find the sum of two numbers by taking input from the user
import java.util.Scanner;
public class SumOfTwoNumbers{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a first value");
        int a =sc.nextInt();
        System.out.println("Enter a second Value");
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("The sum of a and b is "+sum);
        sc.close();

    }
}
