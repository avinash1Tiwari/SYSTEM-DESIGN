package class_3_solid_basics.Example2_Monster_class.problematic;

public class UserManager {

    public void addUser(User user)
    {
        System.out.println("adding the user");
    }

    public void deleteUser(User user)
    {
        System.out.println("deleting the user");
    }

    public void getUser(int id)
    {
        System.out.println("fetcing the user-data");
    }

    public void updateUser(User user)
    {
        System.out.println("updating the user");
    }

    public void logUserActivity()
    {
        System.out.println("logging user activity");
    }
}
