//To find out whether the given String is Palindrome or not.

import java.util.*;

public class Palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int temp,rem,sum=0;
        temp=n;
        while(n>0){
            rem=n%10;
            sum=(sum*10)+rem;
            n=n/10;
        }
        if(temp==sum){
            System.out.println("Yes, It is palindrom");
        }
        else{
            System.out.println("No, It is not a palindriom");
        }
        sc.close();
    }
    
}
