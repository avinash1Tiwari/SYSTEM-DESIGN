package class_3_solid_basics.Example1_SRP.Problematic_code;

class Employee{
    int id;
    String name;
    String address;
    Employee(int id,String name,String address)
    {
        this.name = name;
        this.address = address;
        this.id = id;
    }

    public void printPerformance()
    {
        System.out.println("printing erformance of an employee");
    }

    public void computeSalary()
    {
        System.out.println("computing salary based on available details");
    }

    public void updateEmployeeData()
    {
        System.out.println("updated data successfully");
    }

    public void fetchEmployeeData()
    {
        System.out.println("employee data fetched successfully");
    }


}


public class PC_1 {          // problematic_code1
    public static void main(String[] args) {

    }
}


