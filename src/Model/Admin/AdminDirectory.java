
import java.util.ArrayList;
import java.util.List;

public class AdminDirectory {
    private List<Admin> adminList;

    public AdminDirectory() {
        adminList = new ArrayList<>();
    }

    public Admin createAdmin(String adminId, String name, String department) {
        Admin newAdmin = new Admin(adminId, name, department);
        adminList.add(newAdmin);
        return newAdmin;
    }

    public List<Admin> getAdmins() {
        return adminList;
    }

    public Admin findAdminById(String adminId) {
        for (Admin admin : adminList) {
            if (admin.getAdminId().equals(adminId)) {
                return admin;
            }
        }
        return null; // No admin found
    }
}
