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
public class FetchHeadlines {
    public static void main(String[] args)
    {
        String worldNews = askHeadLine("world news");
        System.out.printf("The world news headline is %s%n", worldNews);
        System.out.printf("The politics headline is %s%n", askHeadLine("politics"));
        System.out.printf("The sports headline is %s%n", askHeadLine("sports"));
        System.out.printf("The entertainment headline is %s%n", askHeadLine("entertainment"));
    }
    /**
     * This method will receive a String indicating what type of headline is being
     * requested. It will return a String with the information
     */
    public static String askHeadLine(String subject)
    {
        //prompt user for a headline
        System.out.printf("Please enter the headline for the subject of %s: ", subject);
        //create a Scanner object
        Scanner keyboard = new Scanner(System.in);
        //return the users' response to the calling method
        return keyboard.nextLine();
}
}
