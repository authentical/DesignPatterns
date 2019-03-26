package Behavioural.Iterator.Practice1;


// Helper to store collection
public class NotificationBarApplication {

    NotificationCollection notifications;

    public NotificationBarApplication(NotificationCollection notifications) {
        this.notifications = notifications;
    }


    public void printNotifications(){

        Iterator iter = notifications.createIterator();
        System.out.println("---Notifications---");
        while(iter.hasNext()){

            Notification n = (Notification)iter.next();
            System.out.println(n.getNotification());
        }


    }
}
