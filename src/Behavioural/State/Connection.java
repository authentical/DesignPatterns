package Behavioural.State;


// Context
public class Connection {

    private FTPConnection state;


    public Connection(FTPConnection state) {
        this.state = state;
    }

    public FTPConnection getState() {
        return state;
    }
    public void setState(FTPConnection state) {
        this.state = state;
    }


    public void toggleConnectionState(){

        state.toggleConnectionState(this);
    }
}
