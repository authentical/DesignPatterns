package Behavioural.Command2;


public interface Command {

    void execute();

    void undo();
    void redo();

}
class OpenFile implements Command{

    private FileSystemReceiver fsReceiver;

    // store previous State for undo

    public OpenFile(FileSystemReceiver fsReceiver) {
        this.fsReceiver = fsReceiver;
    }

    @Override
    public void execute() {
        // save previous state, in case undo called  someState = ....
        this.fsReceiver.openFile();
    }

    @Override
    public void undo() {

    }

    @Override
    public void redo() {

    }
}

