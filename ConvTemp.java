import java.util.Scanner;
public class ConvTemp{
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        float tempC = in.nextFloat();
        float tempF = (tempC * 9/5)+32;
        System.out.print("After conversion celcius to Franhide: "+ tempF);
    }
}