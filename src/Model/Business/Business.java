/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Business;

import Model.Driver.DriverDirectory;
import Model.Supervisor.SupervisorDirectory;
import Model.Truck.TruckDirectory;
import Model.Driver.DriverDirectory;
/**
 *
 * @author arslanparkar
 */
public class Business {
    TruckDirectory truckDirectory;
    SupervisorDirectory supervisorDirectory;
    DriverDirectory driverDirectory;

    public Business(){
    
        truckDirectory = new TruckDirectory();
        supervisorDirectory = new SupervisorDirectory();
        driverDirectory =  DriverDirectory.getInstance();
    }
    
    public TruckDirectory getTruckDirectory(){
        return truckDirectory;
    }
    
    public SupervisorDirectory getSupervisorDirectory(){
        return supervisorDirectory;
    }


    public DriverDirectory getDriverDirectory() {
        return driverDirectory;
    }
    
    
}

