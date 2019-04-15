package Behavioural.State;

abstract class FTPConnection {

    public abstract void toggleConnectionState(Connection context);
}

class Connected extends FTPConnection{

    @Override
    public void toggleConnectionState(Connection context) {
        System.out.println("Connected. Disconnecting.");
        context.setState(new Disconnected());
    }
}
class Disconnected extends FTPConnection{

    @Override
    public void toggleConnectionState(Connection context) {
        System.out.println("Disconnected. Connecting.");
        context.setState(new Connected());
    }
}
