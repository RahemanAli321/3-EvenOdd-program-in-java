
package evenodd;
import java.util.Scanner;

public class EvenOdd {
    int input;

    
    public static void main(String[] args) {
        
        
        System.out.println("Enter a Number");
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        
        if (input%2==0){
        System.out.println("Even Number");
        
        }
        else{
        System.out.println("ODD dude");
        }
    }
    
}
