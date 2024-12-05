package Model.Admin;
public class Admin {
    private String adminId;
    private String name;
    private String department;
    private String password;  // Add password field

    public Admin(String adminId, String name, String department, String password) {
        this.adminId = adminId;
        this.name = name;
        this.department = department;
        this.password = password;  // Store the password
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
