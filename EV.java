/* BCIS 3680 
   Fall 2023 Assignment 3
   Date: 10/20/2023
   Author: Cole Dombrowski
*/

package dombrowski.cole.assignment3;

public class EV extends Vehicle 
{
    private int range;
    private boolean pluglessCharge;

    public EV(String make, String model, int year, double msrp, int range, boolean pluglessCharge) 
    {
        super(make, model, year, msrp);
        this.range = range;
        this.pluglessCharge = pluglessCharge;
    }

    public int getRange() 
    {
        return range;
    }

    public void setRange(int range) 
    {
        this.range = range;
    }

    public boolean isPluglessCharge() 
    {
        return pluglessCharge;
    }

    public void setPluglessCharge(boolean pluglessCharge) 
    {
        this.pluglessCharge = pluglessCharge;
    }

    // O
    @Override public String readVehicleInfo() 
    {
        String superInfo = super.readVehicleInfo();
        String additionalInfo = pluglessCharge
                ?   range   +   " Miles Range & Plugless Power"
                :   range   +   " Miles Range only";
        return superInfo + 
                "\n" + additionalInfo;
    }

    // O
    @Override public String findIncentive() 
    {
        return "Visit https://fueleconomy.gov/feg/taxcenter.shtml for information on EV tax credit.";
    }
}