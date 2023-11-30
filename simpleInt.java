//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.


import java.util.Scanner;
public class simpleInt {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter principal amount: ");
        int P = in.nextInt();
        System.out.print("Enter rate: ");
        int r = in.nextInt();
        System.out.print("Enter time: ");

        int t = in.nextInt();
        int s = (P*r*t)/100;
        System.out.print("Simple interest is: " +s);
        in.close();
    }
    
}
