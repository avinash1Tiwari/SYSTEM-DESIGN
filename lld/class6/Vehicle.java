package class6;

public class Vehicle {

     Integer wheels;
     String brand;
     String ownerName;

    Vehicle(Integer wheels,String brand,String ownerName)
    {
        this.wheels = wheels;
        this.brand = brand;
        this.ownerName = ownerName;
    }

    Vehicle(Vehicle v)
    {
        this.wheels = v.wheels;
        this.brand = v.brand;
        this.ownerName = v.ownerName;
    }


    public static void main(String[] args) {

        Car c = new Car(4,"toyota","avinash",true,7);
        Car c_copy = new Car(c);
        System.out.println(c_copy.ownerName);


        Vehicle v = new Vehicle(5,"mahindra","avinash");
        System.out.println(v.brand);

        Car c_copy1 = new Car(c);
        Vehicle v_copy1 = new Vehicle(v);
    }
}

class Car extends Vehicle{

     boolean isAcPresent;
      Integer seats;

    Car(Integer wheels, String brand, String ownerName,boolean isAcPresent,Integer seats) {
        super(wheels, brand, ownerName);
    }

    Car(Car c)
    {
        super(c);
        this.isAcPresent = c.isAcPresent;
        this.seats = c.seats;
    }
}
