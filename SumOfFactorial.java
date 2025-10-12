//Writing a java program to find the sum of factorial of a number
import java.util.Scanner;
public class SumOfFactorial {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        
        int product=1;
        for(int i=1;i<=n;i++){
            product=product*i;
            System.out.println("The factorial of a number  " + i +" "+ "is"+" " + product );
        }
        sc.close();
        
    }
    
    
}
