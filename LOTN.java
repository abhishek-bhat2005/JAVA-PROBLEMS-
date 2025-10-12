//Largest of Two Numbers by taking input from the user
import java.util.Scanner;
public class LOTN {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int a =sc.nextInt();
        System.out.println("Enter the second number");
        int b=sc.nextInt();
        if (a>b){
            System.out.println("The Largest number is " +a);
        }
        else if(b>a){ 
            System.out.println("The largest number is  "+ b);
        }
        else{
            System.out.println("Both are equal");
        }
        sc.close();
    }
    
}
