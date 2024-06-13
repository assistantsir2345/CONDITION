package conditionals;
import java.util.Scanner;
public class Profitloss {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter cost price :");
        int cp = sc.nextInt();
        System.out.print("Enter selling price :");
        int sp = sc.nextInt();
        
//        if(sp > cp) System.out.println("Profit");
//       if(cp > sp) System.out.println("loss");
//        if(cp == sp) System.out.println("no profit no loss");
        
        if(sp > cp) System.out.println("Profit is"+(sp-cp));
        if(cp > sp) System.out.println("loss is"+(cp-sp));
        if(cp == sp) System.out.println("no profit no loss");
        
        
    }
    
}
