package Behavioural.Mediator;


import java.util.ArrayList;
import java.util.List;

// Coordinate colleagues - it knows and maintains it's colleague
public interface ChatMediator {

    public void sendMessage(String msg, User user);
    void addUser(User user);
}

class ChatMediatorImpl implements ChatMediator{

    private List<User> userList;

    public ChatMediatorImpl() {
        this.userList = new ArrayList<>();
    }

    // Routing
    @Override
    public void sendMessage(String msg, User user) {
        for(User u: this.userList){
            if(!u.equals(user)){

                u.receive(user.name + ": " +msg);
            }
        }
    }

    @Override
    public void addUser(User user) {
        userList.add(user);
    }
}