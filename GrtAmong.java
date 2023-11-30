//Take name as input and print a greeting message for that particular name.


import java.util.Scanner;
public class GrtAmong {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Three number");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int max=a;
        if(b>max){
            max=b;
        }
        if(c>max){
            max=c;
        }
        System.out.println("Maximum all of three are: " +max);
    }
}
