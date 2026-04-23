package class_3_solid_basics.OCP.Example1.problematic;

import java.util.ArrayList;
import java.util.List;

public class NotificationManager {

    public void notifyUser(List<String> notifications)
    {
        for(String notificationType : notifications)
        {
            switch (notificationType)
            {
                case "MAIL":
                    MAIL mail = new MAIL();
                    mail.sendMail("Jai Shree Ram");
                    break;
                case "WHATSAPP":
                    WhatsApp whatsApp = new WhatsApp();
                    whatsApp.whatsApp("Jai Shree Ram");
                    break;
                case "SMS":
                    SMS sms = new SMS();
                    sms.SMS("Jai Shree Ram");
                    break;
            }
        }
    }
}

//public static void main(String[] args) {
//
//    List<String> notifications = new ArrayList<>();
//    notifications.add("MAIL");
//    notifications.add("SMS");
//
//
//}
