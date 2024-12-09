package Model.Enterprise.Trash;


import java.util.Date;

public class TrashCollection {
    private String collectionId;
    private String truckId;
    private String location;
    private Date collectionDate;
    private int weight;
    private int trashCollected; // Holds the amount of trash collected in kilograms
    private String status; // Holds the current status of the truck
    private String supervisorId;
    private String driverId;
    private String date;


    // Constructor
    public TrashCollection(String collectionId, String truckId, String location, String supervisorId, String driverId, String date) {
        this.collectionId = collectionId;
        this.truckId = truckId;
        this.location = location;
        this.collectionDate = collectionDate;
        this.weight = weight;
        this.trashCollected = 0; // Initialize with no trash collected
        this.status = "Idle"; // Default status of the truck
    }
    
    

    // Getters and Setters
    public String getCollectionId() {
        return collectionId;
    }

    public void setCollectionId(String collectionId) {
        this.collectionId = collectionId;
    }

    public String getTruckId() {
        return truckId;
    }

    public void setTruckId(String truckId) {
        this.truckId = truckId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSupervisorId() {
        return supervisorId;
    }

    public void setSupervisorId(String supervisorId) {
        this.supervisorId = supervisorId;
    }

    public String getDriverId() {
        return driverId;
    }

    public void setDriverId(String driverId) {
        this.driverId = driverId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "CollectionId: " + collectionId + ", TruckId: " + truckId + ", Location: " + location 
                + ", SupervisorId: " + supervisorId + ", DriverId: " + driverId + ", Date: " + date;
    }
    
}