import java.util.Scanner;
public class Fibanacci {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int firstNumber=0;
        int secondNumber=1;

        for(int i=1; i<=n; i++){
            System.out.println("" + firstNumber);

            int next= firstNumber+secondNumber;
            firstNumber=secondNumber;
            secondNumber=next;
        }
        sc.close();
    }
    
}
