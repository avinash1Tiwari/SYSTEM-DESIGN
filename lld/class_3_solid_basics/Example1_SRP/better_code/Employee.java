package class_3_solid_basics.Example1_SRP.better_code;

public class Employee {
    int id;
    String name;
    String address;
    public void setId(int id)
    {
        this.id = id;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setAddress(String address)
    {
        this.address = address;
    }
    public int getId() {
        return this.id;
    }
    public String getName()
    {
        return this.name;
    }
    public String getAddress()
    {
       return this.address;
    }
}
