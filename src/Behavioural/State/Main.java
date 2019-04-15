package Behavioural.State;

public class Main {


    public static void main(String[] args) {


        FTPConnection initialState = new Disconnected();

        Connection connection = new Connection(initialState);


        connection.toggleConnectionState();

        connection.toggleConnectionState();


    }
}
