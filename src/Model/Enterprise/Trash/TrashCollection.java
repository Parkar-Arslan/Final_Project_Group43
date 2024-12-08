package Model.Enterprise.Trash;


import java.util.Date;

public class TrashCollection {
    private String collectionId;
    private String location;
    private Date collectionDate;
    private int weight;
    private int trashCollected; // Holds the amount of trash collected in kilograms
    private String status; // Holds the current status of the truck

    public TrashCollection(String collectionId, String location, Date collectionDate, int weight) {
        this.collectionId = collectionId;
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getCollectionDate() {
        return collectionDate;
    }

    public void setCollectionDate(Date collectionDate) {
        this.collectionDate = collectionDate;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
