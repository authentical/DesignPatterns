package Behavioural.Mediator;


// Colleague
abstract class User {


    protected ChatMediator mediator;
    protected String name;

    public User(ChatMediator mediator, String name){

        this.mediator = mediator;
        this.name = name;

        mediator.addUser(this); // Automatically add user to list

    }

    public abstract void send(String msg);
    public abstract void receive(String msg);
}


// Colleagues communicate with the mediator whenever it otherwise would
// have communicated with it's other colleagues
class UserImpl extends User{

    public UserImpl(ChatMediator mediator, String name) {
        super(mediator, name);
    }

    // Out
    @Override
    public void send(String msg) {
        mediator.sendMessage(msg, this);
    }

    // In
    @Override
    public void receive(String msg) {
        System.out.println(this.name + ": received : "+msg);
    }
}