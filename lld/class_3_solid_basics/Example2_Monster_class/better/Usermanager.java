package class_3_solid_basics.Example2_Monster_class.better;

import class_3_solid_basics.Example2_Monster_class.problematic.User;

public class Usermanager {

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

}
