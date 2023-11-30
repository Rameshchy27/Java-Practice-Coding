import java.util.Scanner;
public class CaseAlpha {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a alphabet charcter");
        char ch = sc.next().charAt(0);
        if(ch>='a' && ch<='z'){
            System.out.println("Lowercase");
        }
        else{
            System.out.println("Uppercase");
        }
    }


    
}
//this is edit
