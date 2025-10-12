//Java program to find the largest amoung three numbers by taking the input from the user
import java.util.Scanner;
public class LMTN {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int a=sc.nextInt();
        System.out.println("Enter the second number");
        int b=sc.nextInt();
        System.out.println("Enter the third number");
        int c=sc.nextInt();
        if (a>=b && a>=c){
            System.out.println("The largest number is " +a);
        }
        else if(b>=a && b>=c){
            System.out.println("The largest number is "+b);
        }
        else if (c>=a && c>=b){
            System.out.println("The largest number is "+c);
        }
        else{
            System.out.println("All are Equal");
        }
        sc.close();
    }
    
}
