/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Business;

import Model.Enterprise.Compliance.ComplaintDirectory;
import Model.Enterprise.bill.BillDirectory;
import Model.Role.AdminDirectory;
import Model.Role.DriverDirectory;
import Model.Enterprise.Logistic.RouteDirectory;
import Model.Role.SupervisorDirectory;
import Model.Enterprise.Vehicle.TruckDirectory;
import Model.Role.DriverDirectory;
import Model.Role.UserDirectory;
/**
 *
 * @author arslanparkar
 */
public class Business {
    TruckDirectory truckDirectory;
    SupervisorDirectory supervisorDirectory;
    DriverDirectory driverDirectory;
    ComplaintDirectory complaintDirectory;

    UserDirectory userDirectory;
    BillDirectory billDirectory;

    public BillDirectory getBillDirectory() {
        return billDirectory;
    }

    public void setBillDirectory(BillDirectory billDirectory) {
        this.billDirectory = billDirectory;
    }
    AdminDirectory adminDirectory;

    RouteDirectory routeDirectory;
    
    public Business(){
    
        
        truckDirectory = new TruckDirectory();
        supervisorDirectory = new SupervisorDirectory();
        driverDirectory =  DriverDirectory.getInstance();
        complaintDirectory = new ComplaintDirectory();
        this.userDirectory = new UserDirectory();

        routeDirectory = new RouteDirectory();
    }

    public UserDirectory getUserDirectory() {
        return userDirectory;
    }

    public ComplaintDirectory getComplaintDirectory() {
        return complaintDirectory;
    }

    public void setComplaintDirectory(ComplaintDirectory complaintDirectory) {
        this.complaintDirectory = complaintDirectory;
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

    public RouteDirectory getRouteDirectory() {
        return routeDirectory;
    }
    
    
}

