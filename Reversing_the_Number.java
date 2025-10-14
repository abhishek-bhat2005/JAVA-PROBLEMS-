import java.util.Scanner;
public class Reversing_the_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number you want to reverse: ");
        int n=sc.nextInt();
        int reverse=0;
        while(n!=0){
            int digit=n%10;
            reverse=reverse*10 +digit;
            n=n/10;
        }
            System.out.println("The reversed number will be " +reverse);
            sc.close();
        }
        
    }
    

