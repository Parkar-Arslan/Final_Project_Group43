/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Business;

import Model.Truck.TruckDirectory;

/**
 *
 * @author arslanparkar
 */
public class Business {
    TruckDirectory truckDirectory;
    
    public Business(){
    
        truckDirectory = new TruckDirectory();
        
    }
    
    public TruckDirectory getTruckDirectory(){
        return truckDirectory;
    }
}

