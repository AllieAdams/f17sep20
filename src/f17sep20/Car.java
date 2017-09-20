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
public class Car {
    private int year;
    private String manufacturer;
    private String model;
    private double mileage;
    //This is a constructor which will create a new instance of a Car
    public Car(int modelYear, String make, String modelName, double kms)
    {
        year = modelYear;
        manufacturer = make;
        model = modelName;
        mileage = kms;
    }
    /**This method will return a String that describes the care The String will
     * match the pattern of model year - make model with x kms
     */
    public String toString()
    {
        String response = String.format("%d-%s %s with %.1f", year, manufacturer,
                model, mileage);
        return response;
    }
}
