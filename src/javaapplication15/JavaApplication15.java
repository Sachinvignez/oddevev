
package javaapplication15;
import java.util.Scanner;


public class JavaApplication15 {

    
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n;
        System.out.println("Enter the number");
        n=in.nextInt();
        if(n%2==0&&n%3==0){
        
         
            System.out.println("The number is even and divisible by 3");
            
        
        }
        else if(!(n%2==0)&&n%3==0){
            System.out.println("The number is odd and not divisible 3 ");
           
        }
        else if (n%2==0){
            System.out.println("even number");
           
        }
        else if ((n%2==1)){
            System.out.println("odd nmber");
        }
        
    }
}
    


    
