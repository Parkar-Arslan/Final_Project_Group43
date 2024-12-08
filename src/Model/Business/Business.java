/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Business;

import Model.Admin.AdminDirectory;
import Model.Driver.DriverDirectory;
import Model.Supervisor.SupervisorDirectory;
import Model.Truck.TruckDirectory;
import Model.Driver.DriverDirectory;
import Model.User.UserDirectory;
/**
 *
 * @author arslanparkar
 */
public class Business {
    TruckDirectory truckDirectory;
    SupervisorDirectory supervisorDirectory;
    DriverDirectory driverDirectory;

    UserDirectory userDirectory;
    AdminDirectory adminDirectory;

    public Business(){
    
        truckDirectory = new TruckDirectory();
        supervisorDirectory = new SupervisorDirectory();
        driverDirectory =  DriverDirectory.getInstance();
        this.userDirectory = new UserDirectory();
    }

    public UserDirectory getUserDirectory() {
        return userDirectory;
    }

    public void setUserDirectory(UserDirectory userDirectory) {
        this.userDirectory = userDirectory;
        adminDirectory = new AdminDirectory();
    }

    public AdminDirectory getAdminDirectory() {
        return adminDirectory;
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

