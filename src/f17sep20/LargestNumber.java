
package f17sep20;

import java.util.Scanner;

/**
 *
 * @author Allie
 */

/**ask the user to enter 3 numbers. 
send the 3 numbers should be passed to a method called largestNumber. 
the method largestNumber should figure out which number is the largest and return it 
inside the main method, display the number returned from the largestNumber method
*/
public class LargestNumber {
     public static void main(String[] args){
   double largest;
    Scanner keyboard = new Scanner(System.in);
        System.out.printf("Enter a number: "); //prompt for 1st number
        double num1 = keyboard.nextInt();
        
        System.out.printf("Enter a number: "); //prompt for 2nd number
        double num2 = keyboard.nextInt();
        
        System.out.printf("Enter a number: "); //prompt for 3rd number
        double num3 = keyboard.nextInt();
         Object[] largestNumber;
        
        System.out.printf("The largest of the numbers is %d%n", largestNumber(num1,num2,n3));
     }
    


public static double largestNumber(double num1, double num2, double num3)
{
 double largest =0;
 if (num1 > largest)
     num1 = largest;
 if(num2 > largest)
     num2 = largest;
 else num3 = largest;
 return largest;
}
}