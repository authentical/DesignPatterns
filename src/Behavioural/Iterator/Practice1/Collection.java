package Behavioural.Iterator.Practice1;


// Client does NOT see this.

public interface Collection {

    Iterator createIterator();
}
// Provides iterator to iterate over it's components without exposing how the Iteration is implemented
class NotificationCollection implements Collection{


    static final int MAX_ITEMS=6;
    int size = 0;   // Number of items

    Notification[] notificationsArray;


    // Initialize small array
    public NotificationCollection() {
        this.notificationsArray = new Notification[MAX_ITEMS];

        addItem("TSX going sky high");
        addItem("Trump finally fired");
        addItem("LHC finds another new molecule");
    }

    public void addItem(String str){

        Notification notification = new Notification(str);

        if(size >=MAX_ITEMS){
            System.out.println("Full");
            // ALLOCATE MORE SPACE
        } else {

            notificationsArray[size] = notification;
            size++;
        }
    }


    public int size() {
        return size;
    }


    public Iterator createIterator() {
        return new NotificationIterator(notificationsArray);
    }
}