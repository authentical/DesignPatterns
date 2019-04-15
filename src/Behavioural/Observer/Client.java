package Behavioural.Observer;

public class Client {

    public static void main(String[] args) {


        ChatMessage chatMessage = new ChatMessage();


        Observer observer1 = new ChatObserver("chatObs1");
        Observer observer2 = new ChatObserver("chatObs2");
        Observer observer3 = new ChatObserver("chatObs3");


        // Register
        chatMessage.register(observer1);
        chatMessage.register(observer2);
        chatMessage.register(observer3);


        // Attach
        observer1.setSubject(chatMessage);
        observer2.setSubject(chatMessage);
        observer3.setSubject(chatMessage);

        // Check if an update is available, not required
        observer1.update();

        chatMessage.postMessage("Hi");
    }
}
