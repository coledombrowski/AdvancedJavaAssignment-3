/* BCIS 3680 
   Fall 2023 Assignment 3
   Date: 10/20/2023
   Author: Cole Dombrowski
*/

package dombrowski.cole.assignment3;

public class SUV extends Vehicle
{
    private String roofRailColor;

    // Con 
    public SUV(String make, String model, int year, double msrp, String roofRailColor) 
    {
        super(make, model, year, msrp);
        this.roofRailColor = roofRailColor;
    }

    // Get
    public String getRoofRailColor() 
    {
        return roofRailColor;
    }

    // Set
    public void setRoofRailColor(String roofRailColor) 
    {
        this.roofRailColor = roofRailColor;
    }

    // abstract method
    @Override public String findIncentive() 
    {
        return "Ask our sales team about 5.99% APR financing for 36 months.";
    }
}