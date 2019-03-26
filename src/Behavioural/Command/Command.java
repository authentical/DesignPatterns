package Behavioural.Command;


// Commands - In charge of management of process, not concrete details
// Invoked through their execute(), asks a receiver to perform an action

// This command is file system agnostic... the FSReceiver is the one with the
// filesystem specific details.

public interface Command {

    void execute();
    void undo();
    void redo();
}
class OpenFileCommand implements Command{

    private FSReceiver fs;

    //Previous state before execute()
    String beforeExecuteState;
    //Executed state before undo()
    String afterExecuteState;

    public OpenFileCommand(FSReceiver fs) {

        this.fs = fs;
    }

    @Override
    public void execute() {
        // Save current state in case undo is called
        beforeExecuteState="beforeExecuteState";
        System.out.println("Saved state");
        this.fs.openFile();
    }

    @Override
    public void undo() {
        // Save current state in case redo is called.
        afterExecuteState = this.getClass().toString();
        System.out.println("Saved state");
        // Restore previous state
        System.out.println("OPEN: Reverted to state before EXECUTE.");
        System.out.println(beforeExecuteState);


    }

    @Override
    public void redo() {
        // Save current state in case undo is called
        // but its already saved
        System.out.println("Saved state");
        // Restore re-done state
        System.out.println("OPEN: Reverted to state before UNDO.");
        System.out.println(afterExecuteState);
    }
}
class WriteFileCommand implements Command{

    private FSReceiver fs;

    //Previous state before execute()
    String beforeExecuteState;
    //Executed state before undo()
    String afterExecuteState;

    public WriteFileCommand(FSReceiver fs) {

        this.fs = fs;
    }

    @Override
    public void execute() {
        // Save current state in case undo is called
        beforeExecuteState="beforeExecuteState";
        System.out.println("Saved state");
        this.fs.writeFile();
    }

    @Override
    public void undo() {
        // Save current state in case redo is called.
        afterExecuteState = this.getClass().toString();
        System.out.println("Saved state");
        // Restore previous state
        System.out.println("WRITE: Reverted to state before EXECUTE.");
        System.out.println(beforeExecuteState);


    }

    @Override
    public void redo() {
        // Save current state in case undo is called
        // but its already saved
        System.out.println("Saved state");
        // Restore re-done state
        System.out.println("WRITE: Reverted to state before UNDO.");
        System.out.println(afterExecuteState);
    }
}
class CloseFileCommand implements Command{

    private FSReceiver fs;

    //Previous state before execute()
    String beforeExecuteState;
    //Executed state before undo()
    String afterExecuteState;

    public CloseFileCommand(FSReceiver fs) {

        this.fs = fs;
    }

    @Override
    public void execute() {
        // Save current state in case undo is called
        beforeExecuteState="beforeExecuteState";
        System.out.println("Saved state");
        this.fs.closeFile();
    }

    @Override
    public void undo() {
        // Save current state in case redo is called.
        afterExecuteState = this.getClass().toString();
        System.out.println("Saved state");
        // Restore previous state
        System.out.println("CLOSE: Reverted to state before EXECUTE.");
        System.out.println(beforeExecuteState);


    }

    @Override
    public void redo() {
        // Save current state in case undo is called
        // but its already saved
        System.out.println("Saved state");
        // Restore re-done state
        System.out.println("CLOSE: Reverted to state before UNDO.");
        System.out.println(afterExecuteState);
    }
}