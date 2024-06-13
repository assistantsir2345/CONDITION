package conditionals;
import java.util.Scanner;
public class greatestofthree {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number :");
        int a = sc.nextInt();
        System.out.print("Enter 2nd Number :");
        int b = sc.nextInt();
        System.out.print("Enter 3rd Number :");
        int c = sc.nextInt();
        
//        if(a>b && a>c) System.out.println(a+"is greatest"); a=2
//        if(b>a && b>c) System.out.println(b+"is greatest"); b=3
//        if(c>a && c>b) System.out.println(c+"is greatest"); c=3(not input)

//        if(a>=b && a>=c) System.out.println(a+"is greatest"); 
//        if(b>=a && b>=c) System.out.println(b+"is greatest"); 
//        if(c>=a && c>=b) System.out.println(c+"is greatest"); 

        if(a>=b && a>=c) System.out.println(a+"is greatest"); 
        else if(b>=a && b>=c) System.out.println(b+"is greatest"); 
        else  System.out.println(c+"is greatest"); 
        
    }
    
}
