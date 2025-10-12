//Writing a java program to finding the sum of first n natural numbers 
import java.util.Scanner;
public class SumOfNaturalNumbers {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first n natural numbers");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
            System.out.println("The Sum is " +sum);
        }
    }
    
}
