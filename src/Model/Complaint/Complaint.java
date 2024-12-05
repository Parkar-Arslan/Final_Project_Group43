public class Complaint {
    private String complaintId;
    private String details;
    private boolean isResolved;

    public Complaint(String complaintId, String details, boolean isResolved) {
        this.complaintId = complaintId;
        this.details = details;
        this.isResolved = isResolved;
    }

    // Getters and Setters
    public String getComplaintId() {
        return complaintId;
    }

    public void setComplaintId(String complaintId) {
        this.complaintId = complaintId;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public boolean isResolved() {
        return isResolved;
    }

    public void setResolved(boolean resolved) {
        isResolved = resolved;
    }
}