package Behavioural.Command;



// Client - Holds the invoker and the commands. The client decides which commands need to be executed and when.
// Sets receiver
public class CommandMain {

    public static void main(String[] args) {

        // Here, the correct receiver for the OS is determined and instantiated
        // The receiver contains methods with all details fleshed out
        FSReceiver fsReceiver = FSReceiverUtil.getSystemOS();

        // These Commands are OS agnostic. They know the process not the details
        // The keep track of UNDO and REDO states
        // In a real implementation, Open/Close would not have undo/redo.
        // Write would have to have a copy of the old file
        Command open = new OpenFileCommand(fsReceiver);
        Command write = new WriteFileCommand(fsReceiver);
        Command close = new CloseFileCommand(fsReceiver);


        // This invoker could possibly hold the list of commands invoked????
        FileCommandInvoker openInvoker = new FileCommandInvoker(open);
        FileCommandInvoker writeInvoker = new FileCommandInvoker(write);
        FileCommandInvoker closeInvoker = new FileCommandInvoker(close);




        openInvoker.execute();
        writeInvoker.execute();
        writeInvoker.undo();
        openInvoker.undo();
        writeInvoker.redo();

    }


}
