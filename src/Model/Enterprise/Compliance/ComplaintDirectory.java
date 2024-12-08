package Model.Enterprise.Compliance;


import Model.Enterprise.Compliance.Complaint;
import java.util.ArrayList;
import java.util.List;

public class ComplaintDirectory {
    private List<Complaint> complaintList;

    public ComplaintDirectory() {
        complaintList = new ArrayList<>();
    }

    public Complaint fileComplaint(String complaintId, String details) {
        Complaint newComplaint = new Complaint(complaintId, details, false);
        complaintList.add(newComplaint);
        return newComplaint;
    }

    public List<Complaint> getComplaints() {
        return complaintList;
    }

    public Complaint getComplaintById(String complaintId) {
        for (Complaint complaint : complaintList) {
            if (complaint.getComplaintId().equals(complaintId)) {
                return complaint;
            }
        }
        return null; // No complaint found
    }

    public void resolveComplaint(String complaintId) {
        for (Complaint complaint : complaintList) {
            if (complaint.getComplaintId().equals(complaintId)) {
                complaint.setResolved(true);
                break;
            }
        }
    }
}