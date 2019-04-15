package Behavioural.Observer;

public interface Observer {

    // Update observer, Used by subject
    public void update();

    // So observer can pull...
    public void setSubject(Subject subject);
}



// Don't need a reference to Subject but in this impl it allows Observer to request state

class ChatObserver implements Observer{

    private String observerName;

    // Not required but can be used to attach
    private Subject subject;

    public ChatObserver(String observerName) {
        this.observerName = observerName;
    }

    @Override
    public void update(/*Could take data that was updated here (PUSH)*/) {

        // Ask Subject for data
        String message = (String) subject.getUpdate(this);

        if(message==null){
            System.out.println(observerName + ": No new message");
        } else {
            System.out.println(observerName + ": Consuming message: " + message);
        }
    }


    @Override
    public void setSubject(Subject subject) {
        this.subject = subject;
    }


    @Override
    public String toString() {
        return this.observerName;
    }
}
