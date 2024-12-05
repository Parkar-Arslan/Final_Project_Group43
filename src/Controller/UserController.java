
public class UserController {
    private UserDirectory userDirectory;

    public UserController(UserDirectory userDirectory) {
        this.userDirectory = userDirectory;
    }

    public User addUser(String id, String name, String email, String password) {
        return userDirectory.createUser(id, name, email, password);
    }

    public User findUser(String id) {
        return userDirectory.findUserById(id);
    }
}
