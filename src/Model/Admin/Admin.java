
public class Admin {
    private String adminId;
    private String name;
    private String department;

    public Admin(String adminId, String name, String department) {
        this.adminId = adminId;
        this.name = name;
        this.department = department;
    }

    // Getters and Setters
    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
