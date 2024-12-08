package Model.Role;
import Model.Role.User;
import java.util.ArrayList;
import java.util.List;

public class UserDirectory {
    private List<User> userList;

    public UserDirectory() {
        userList = new ArrayList<>();
    }

    public User createUser(String id, String name, String email, String password) {
        User newUser = new User(id, name, email, password);
        userList.add(newUser);
        return newUser;
    }

    public List<User> getUsers() {
        return userList;
    }

    public User findUserById(String id) {
        for (User user : userList) {
            if (user.getId().equals(id)) {
                return user;
            }
        }
        return null; // No user found
    }
    public User authenticateUser(String userId, String password) {
        for (User user : userList) {
            if (user.getId().equals(userId) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;  // Return null if no matching user is found
    }
}
