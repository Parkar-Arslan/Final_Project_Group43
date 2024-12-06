/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Business;

import Model.Supervisor.SupervisorDirectory;
import Model.Truck.TruckDirectory;

/**
 *
 * @author arslanparkar
 */
public class Business {
    TruckDirectory truckDirectory;
    SupervisorDirectory supervisorDirectory;
    public Business(){
    
        truckDirectory = new TruckDirectory();
        supervisorDirectory = new SupervisorDirectory();
    }
    
    public TruckDirectory getTruckDirectory(){
        return truckDirectory;
    }
    
    public SupervisorDirectory getSupervisorDirectory(){
        return supervisorDirectory;
    }
}

