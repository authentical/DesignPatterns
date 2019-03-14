package Behavioural.Command;



// Client - Holds the invoker and the commands. The client decides which commands need to be executed and when.
// Sets receiver
public class CommandMain {

    public static void main(String[] args) {

        FSReceiver fsReceiver = FSReceiverUtil.getSystemOS();

        Command open = new OpenFileCommand(fsReceiver);
        Command write = new WriteFileCommand(fsReceiver);
        Command close = new CloseFileCommand(fsReceiver);


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
