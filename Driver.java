/* BCIS 3680 
   Fall 2023 Assignment 3
   Date: 10/20/2023
   Author: Cole Dombrowski
*/

package dombrowski.cole.assignment3;

import javax.swing.JOptionPane;

public class Driver
{
    public static void main(String[] args)
    {
        String title = "Cole Dombrowski's Vehicle Super Store";
        Vehicle[] vehicles = new Vehicle[4];

        vehicles[0] = new SUV("Honda", "Passport", 2023, 45000.0, "Silver");
        vehicles[1] = new EV("Tesla", "Model S", 2023, 107000.0, 396, true);
        vehicles[2] = new EV("Tesla", "Model 3", 2022, 45000.0, 328, false);
        vehicles[3] = new GolfCart("Club Car", "Onward 6", 2020, 18000.0, false);

        for (int i = 0; i < vehicles.length; i++)
        {
            String vehicleInfo = "";
            vehicleInfo += "Vehicle " + (i + 1) + " Information";
            vehicleInfo += "\n\n" + vehicles[i].readVehicleInfo();
            vehicleInfo += "\n\n" + vehicles[i].findIncentive();
            vehicleInfo += "\n\n\n";
            JOptionPane.showMessageDialog(null,
                    vehicleInfo, title,
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
