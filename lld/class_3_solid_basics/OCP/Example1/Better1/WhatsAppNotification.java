package class_3_solid_basics.OCP.Example1.Better1;

public class WhatsAppNotification implements Notification{
    @Override
    public void sendNotification(String message) {
        System.out.println("sending message on WhatsApp, message is : " + message);
    }
}
