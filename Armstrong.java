//To find Armstrong Number between two given number.
import java.util.*;
public class Armstrong {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int temp, rem, arms=0;
        temp=n;
        while(n>0){
            rem=n%10;
            arms=(rem*rem*rem)+arms;
            n=n/10;
        }
        if(temp==arms){
            System.out.println("Armstrong");

        }
        else{
            System.out.println("Not a Armstrong");
        }
        sc.close();

    }
    
}
