package Model.Enterprise.Trash;

import Model.Enterprise.Trash.TrashCollection;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TrashCollectionDirectory {
    private ArrayList<TrashCollection> trashCollections;

    // Constructor
    public TrashCollectionDirectory() {
        trashCollections = new ArrayList<>();
    }

    // Getter for trashCollections
    public ArrayList<TrashCollection> getTrashCollections() {
        return trashCollections;
    }

    // Method to add TrashCollection with all six parameters
    public TrashCollection addTrashCollection(String collectionId, String truckId, String location, String supervisorId, String driverId, String date) {
        TrashCollection collection = new TrashCollection(collectionId, truckId, location, supervisorId, driverId, date);
        trashCollections.add(collection);
        return collection;
    }

    // Overloaded method to add TrashCollection with only four parameters
    public TrashCollection addTrashCollection(String collectionId, String truckId, String location, String date) {
        // Provide default values for the missing parameters
        String defaultSupervisorId = "UnknownSupervisor";
        String defaultDriverId = "UnknownDriver";

        return addTrashCollection(collectionId, truckId, location, defaultSupervisorId, defaultDriverId, date);
    }

    // Method to remove TrashCollection by collectionId
    public void removeTrashCollection(String collectionId) {
        trashCollections.removeIf(collection -> collection.getCollectionId().equals(collectionId));
    }

    // Method to find TrashCollection by collectionId
    public TrashCollection findTrashCollectionById(String collectionId) {
        for (TrashCollection collection : trashCollections) {
            if (collection.getCollectionId().equals(collectionId)) {
                return collection;
            }
        }
        return null;
    }
}