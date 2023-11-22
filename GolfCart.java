/* BCIS 3680 
   Fall 2023 Assignment 3
   Date: 10/20/2023
   Author: Cole Dombrowski
*/

package dombrowski.cole.assignment3;

public class GolfCart extends Vehicle 
{
    private boolean xlCanopy;

    // Con
    public GolfCart(String make, String model, int year, double msrp, boolean xlCanopy) 
    {
        super(make, model, year, msrp);
        this.xlCanopy = xlCanopy;
    }

    // Get
    public boolean isXlCanopy() 
    {
        return xlCanopy;
    }

    // Set
    public void setXlCanopy(boolean xlCanopy) 
    {
        this.xlCanopy = xlCanopy;
    }

    // Abstr
    @Override public String findIncentive() 
    {
        return "Please contact our golf cart store about incentive programs.";
    }
}