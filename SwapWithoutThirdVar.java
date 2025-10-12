//write a java program to swap two numbers without using 3rd variable 
import java.util.Scanner;
public class SwapWithoutThirdVar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int a=sc.nextInt();
        System.out.println("Enter the Second number");
        int b=sc.nextInt();
        sc.close();
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println(" first number after swapping "+a);
        System.out.println(" second number after swapping"+b);
    }
}
    

