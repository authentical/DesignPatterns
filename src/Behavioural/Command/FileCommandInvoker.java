package Behavioural.Command;

// Invoker - Only knows about Command Interface - Requests execute on  the command
public class FileCommandInvoker {

    public Command command;

    public FileCommandInvoker(Command command) {
        this.command = command;
    }


    public void execute(){
        command.execute();
    }

    public void undo(){
        command.undo();
    }


    public void redo(){
        command.redo();
    }

}
