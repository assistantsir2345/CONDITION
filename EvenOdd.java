package conditionals;
import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number :");
        int n = sc.nextInt();
        if(n%2 == 0)System.out.println("Even");
//        if(n%2 == 1)System.out.println("Odd");
//        if(n%2 != 0)System.out.println("Odd");
        else System.out.println("Odd");
    }
    
}
