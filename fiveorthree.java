package conditionals;
import java.util.Scanner;
public class fiveorthree {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number :");
        int n = sc.nextInt();
        
        if(n%5 == 0 || n%3 == 0) System.out.println("Divisible by 5 or 3");
        else System.out.println("Not divisible by 5 or 3");
    }
}
