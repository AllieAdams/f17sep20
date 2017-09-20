/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package f17sep20;

/**
 *
 * @author Allie
 */
public class F17Sep20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Car dylansCar = new Car(2017, "Mazda", "3", 1000.2);
        Car alliesCar = new Car(1905, "Ford", "Model T", 1982.3);
        Car tomsCar = new Car(2017, "Audi", "Q3", 32234);
        
        System.out.printf("Dylan's car is %s", dylansCar.toString());
        System.out.printf("Allie's car is %s", alliesCar.toString());
        System.out.printf("Tom's car is %s", tomsCar.toString());
        
    }
    
}
