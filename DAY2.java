//Day  02 - Problem Solving for the Day - 11.09.2025

//Friends’ Weekend Plan

//Three friends — Rahul, Sneha, and Arjun — are deciding what to do this weekend.

//1.If all three are free, they will go on a road trip.

//2.If two are free, they will go to a cricket match.

//3.If only one is free, that friend will just play video games at home.

//4.If none are free, everyone will just sleep at home.

//Test Case 1 :

//Input :

//rahulFree = true
//snehaFree = true
//arjunFree = false

//Output :

//Two friends are free! They will go to a cricket match.

//Test Case 2 :

//Input :

//rahulFree = false
//snehaFree = false
//arjunFree = false

//Output :

//No one is free! Everyone will sleep at home 
import java.util.Scanner;
public class DAY2 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 if the friend is free else enter 0");

        int a=sc.nextInt();

        int b=sc.nextInt();

        int c=sc.nextInt();

        int TotalFree=  a+b+c;

        if (TotalFree==3){
            System.out.println(" they can go for a road trip");
        }
        else if(TotalFree==2){
            System.out.println("They can go for create match");
        }
        else if(TotalFree==1) {
            System.out.println("They can play video games at home");
        }
        else{
            System.out.println("Everyone will sleep at home");
        }
        sc.close();
    }

}