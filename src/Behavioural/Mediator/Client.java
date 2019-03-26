package Behavioural.Mediator;

public class Client {

    public static void main(String[] args) {

        ChatMediator chatMediator = new ChatMediatorImpl();

        User usr1 = new UserImpl(chatMediator, "Ferris");
        User usr2 = new UserImpl(chatMediator, "Ian");
        User usr3 = new UserImpl(chatMediator, "Maya");
        User usr4 = new UserImpl(chatMediator, "Kazu");
        User usr5 = new UserImpl(chatMediator, "Luciano");


        // Simulate chat program ////////////////////

        usr3.send("Hey guys");


    }
}
