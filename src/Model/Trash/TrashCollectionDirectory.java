
import java.util.ArrayList;
import java.util.List;

public class TrashCollectionDirectory {
    private List<TrashCollection> collectionList;

    public TrashCollectionDirectory() {
        collectionList = new ArrayList<>();
    }

    public TrashCollection addCollection(String collectionId, String location, Date collectionDate, int weight) {
        TrashCollection newCollection = new TrashCollection(collectionId, location, collectionDate, weight);
        collectionList.add(newCollection);
        return newCollection;
    }

    public List<TrashCollection> getCollections() {
        return collectionList;
    }

    public TrashCollection findCollectionById(String collectionId) {
        for (TrashCollection collection : collectionList) {
            if (collection.getCollectionId().equals(collectionId)) {
                return collection;
            }
        }
        return null; // No collection found
    }
}
