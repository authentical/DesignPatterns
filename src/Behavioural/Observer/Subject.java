package Behavioural.Observer;

import java.util.ArrayList;
import java.util.List;

public interface Subject {

    // Register and Unregister registeredObservers
    public void register(Observer observer);
    public void unregister(Observer observer);

    // Notify registeredObservers - Push
    public void notifyObservers();

    // NOT REQUIRED: Get updates from subject - Observers can query - Pull
    public Object getUpdate(Observer observer);
}



class ChatMessage implements Subject{

    private List<Observer> registeredObservers;
    private String message;
    private boolean changed;

    public ChatMessage() {
        this.registeredObservers = new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {
        if(observer==null) throw new NullPointerException("Null observer");

        if(!registeredObservers.contains(observer)) registeredObservers.add(observer);
    }

    @Override
    public void unregister(Observer observer) {

        if(registeredObservers.contains(observer)){ registeredObservers.remove(observer);}
        else {
            System.out.println("No observer " + observer.toString() +
                    " is registered with " + this.toString());
        }
    }

    @Override
    public void notifyObservers() {
        List<Observer> observersLocal = null;

        if(changed){

            // Save a copy of the state and update observers with that
            // to avoid race condition
            observersLocal = new ArrayList<>(this.registeredObservers);

            this.changed = false;

            for(Observer obs: observersLocal){

                obs.update(/*Could send data that was updated here*/);
            }
        }
    }

    @Override
    public Object getUpdate(Observer obj) {
        return this.message;
    }


    // CLIENT METHOD //////////////////////////////

    // Post Message, change state and trigger
    public void postMessage(String message){

        System.out.println("Message: " + message);
        this.message = message;
        this.changed = true;
        notifyObservers();

    }
}















