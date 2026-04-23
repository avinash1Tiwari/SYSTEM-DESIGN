package class_3_solid_basics.OCP.Example1.Better1;

public class MailNotification implements Notification{
    @Override
    public void sendNotification(String message) {
        System.out.println("sending message by Mail, message is :"+message);
    }
}
