package class_3_solid_basics.OCP.Example1.Better1;

import java.util.ArrayList;
import java.util.List;

public class NotificationManager {
    public static void main(String[] args) {

        Notification sms = new SMSNotification();
        Notification whatsApp = new WhatsAppNotification();
        Notification mail = new MailNotification();

        List<Notification> notifications = new ArrayList<>();
        notifications.add(mail);
        notifications.add(sms);
        notifications.add(whatsApp);

        for(Notification notification : notifications)
        {
            notification.sendNotification("How are you");
        }

    }

}
