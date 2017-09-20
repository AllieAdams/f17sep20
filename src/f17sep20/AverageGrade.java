/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package f17sep20;

import java.util.Scanner;

/**
 *
 * @author Allie
 */
public class AverageGrade {
    public static void main(String[] args) {
        double num1, num2, num3, avg;
        
        Scanner keyboard = new Scanner(System.in);

System.out.print("Please enter the first grade: ");
        num1 = keyboard.nextDouble();
        
        System.out.print("Please enter the second grade: ");
        num2 = keyboard.nextDouble();
        
        System.out.print("Please enter the third grade: ");
        num3 = keyboard.nextDouble();
        
        //The program will calculate the average of the 3 numbers
        avg = (num1 + num2 + num3)/3;    
 
System.out.printf("The average of the numbers is %.1%f%n", avg);
}
}

