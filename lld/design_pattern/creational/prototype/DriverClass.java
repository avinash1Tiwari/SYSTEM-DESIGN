package design_pattern.creational.prototype;

public class DriverClass {

    public static void main(String[] args) {
        Email e = new Email("avinash","arnav","education","how're your study");

        Email eCopy = e.copy();
        System.out.println(e.toString());
        System.out.println(e.getSubject() +", " +  e.getSender() + ", " + e.getReceiver() + ", " + e.getBody());
    }
}
