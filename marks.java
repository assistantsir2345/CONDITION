package conditionals;
import java.util.Scanner;
public class marks {
   public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number :");
        int n = sc.nextInt();
        
        if(n>=81) System.out.println(" verry good ");
        else if (n>=61) System.out.println(" good ");
        else if (n>=41) System.out.println(" average ");
        else System.out.println("Fail");
   }
    
}
