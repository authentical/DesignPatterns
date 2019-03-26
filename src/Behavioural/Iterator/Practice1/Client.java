package Behavioural.Iterator.Practice1;

public class Client {


    public static void main(String[] args) {


        NotificationCollection nc = new NotificationCollection();

        NotificationBarApplication nbar = new NotificationBarApplication(nc);

        nbar.printNotifications();


    }
}
