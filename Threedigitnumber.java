package conditionals;
import java.util.Scanner;
public class Threedigitnumber {
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number :");
        int n = sc.nextInt();
        
        if(n>99 && n<1000) System.out.println("3 digit Number");
        else System.out.println("Not a 3 digit number");
        
    } 
}
