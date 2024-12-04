/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tawde
 */


public class UserManage {
    private List<User> users;

    public UserManage() {
        users = new ArrayList<>();
    }

    public boolean registerUser(User user) {
        for (User u : users) {
            if (u.getEmail().equals(user.getEmail())) {
                return false; // Email already exists
            }
        }
        users.add(user);
        return true;
    }

    public User loginUser(String email, String password) {
        for (User user : users) {
            if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null; // Invalid credentials
    }
}
