//Input currency in rupees and output in USD.


import java.util.Scanner;

public class ConvRs {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number in rupees");
        int rs = in.nextInt();
        Float USD = rs*0.012f;
        System.out.println(USD +" USD");
        in.close();
    }
}
