package Model.Enterprise.Compliance;

import java.util.ArrayList;
import java.util.List;

public class ComplaintDirectory {
    private List<Complaint> complaintList;

    public ComplaintDirectory() {
        complaintList = new ArrayList<>();
    }

    // Method to file a new complaint
    public Complaint fileComplaint(String complaintId, String details) {
        Complaint newComplaint = new Complaint(complaintId, details, false);
        complaintList.add(newComplaint);
        return newComplaint;
    }

    // Get all complaints
    public List<Complaint> getComplaints() {
        return complaintList;
    }

    // Get a complaint by its ID
    public Complaint getComplaintById(String complaintId) {
        for (Complaint complaint : complaintList) {
            if (complaint.getComplaintId().equals(complaintId)) {
                return complaint;
            }
        }
        return null; // No complaint found
    }

    // Add an existing complaint to the list
    public void addComplaint(Complaint complaint) {
        this.complaintList.add(complaint); // Corrected from 'complaints' to 'complaintList'
    }

    // Resolve a complaint by its ID
    public void resolveComplaint(String complaintId) {
        for (Complaint complaint : complaintList) {
            if (complaint.getComplaintId().equals(complaintId)) {
                complaint.setResolved(true);
                break;
            }
        }
    }
}