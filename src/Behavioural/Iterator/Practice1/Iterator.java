package Behavioural.Iterator.Practice1;



// Define access and traversal of elements

public interface Iterator {

    boolean hasNext();

    Object next();
}
class NotificationIterator implements Iterator{

    Notification[] notificationsArray;


    int pos=-1;  // Index


    public NotificationIterator(Notification[] notificationsArray) {
        this.notificationsArray = notificationsArray;

    }

    @Override
    public boolean hasNext() {

        // Check if pos is {-1...array length-1}
        if(notificationsArray[pos+1]==null||pos<-1) {

            return false;
        }

        return true;
    }

    @Override
    public Object next() {

        if(this.hasNext()) {
            pos++;

            return notificationsArray[pos];
        }else {

            throw new IndexOutOfBoundsException("NotificationIterator has no next element");
        }


    }
}
