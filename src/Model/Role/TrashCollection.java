package Model.Role;


import java.util.Date;

public class TrashCollection {
    private String collectionId;
    private String location;
    private Date collectionDate;
    private int weight;

    public TrashCollection(String collectionId, String location, Date collectionDate, int weight) {
        this.collectionId = collectionId;
        this.location = location;
        this.collectionDate = collectionDate;
        this.weight = weight;
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
