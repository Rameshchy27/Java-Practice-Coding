//To calculate Fibonacci Series up to n numbers.

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int n1=0, n2=1, count=2;
        System.out.println("Enter a Number:");
        while(count<=n){
            int temp=n2;
            n2=n2+n1;
            n1=temp;
            count++;
        }
        System.out.println(n2);
        in.close();
    }
}
