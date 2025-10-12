//Write a java program to swap two numbers using 3rd variable 
import java.util.Scanner;
public class STN {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first Number");
        int a=sc.nextInt();
        System.out.println("Enter the second number");
        int b=sc.nextInt();
        sc.close();
        int temp= a;
        a=b;
        b=temp;
        System.out.println("After swapping");
        System.out.println("The first number is "+a);
        System.out.println("The second number is " +b);
    }
    
    
}
