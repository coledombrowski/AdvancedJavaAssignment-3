/* BCIS 3680 
   Fall 2023 Assignment 3
   Date: 10/20/2023
   Author: Cole Dombrowski
*/

package dombrowski.cole.assignment3;

import java.text.DecimalFormat;

public abstract class Vehicle
{
    private String make;
    private String model;
    private int year;
    private double msrp;

    // Full-init Constructor
    public Vehicle(String make, String model, int year, double msrp)
    {
        this.make = make ;
        this.model = model ;
        this.year = year ;
        this.msrp = msrp ;
    }
    
    // Instance method 
    public String readVehicleInfo() 
    {
        DecimalFormat currencyFormat = new DecimalFormat("$#,###,###.00"); 
        String msrp2 = currencyFormat.format(msrp); 
        
        return year + " " + make + " " + model + "\nMSRP: " + msrp2;
    }
    
    // Abstract method
    public abstract String findIncentive();

    // getter/setter
    public String getMake()
    {
        return make;
    }

    public void setMake(String m)
    {
        make = m;
    }

    public String getModel()
    {
        return model;
    }

    public void setModel(String m)
    {
        model = m;
    }

    public int getYear()
    {
        return year;
    }

    public void setYear(int y)
    {
        year = y;
    }

    public double getMSRP()
    {
        return msrp;
    }

    public void setMSRP(double m)
    {
        msrp = m;
    }
}