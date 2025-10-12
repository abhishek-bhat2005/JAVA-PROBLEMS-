//Java program to find the even or odd by taking the input from the user
import java.util.Scanner;
public class EvenOrOdd {
    public static void main(String[]args){
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a%2==0) {
            System.out.println("The Number is Even ");
        }
        else{
            System.out.println("The Number is odd ");
        }
        sc.close(); 
    }
}