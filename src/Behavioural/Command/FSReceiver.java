package Behavioural.Command;


//Receiver - Knows exactly what to do
public interface FSReceiver{
    void openFile();
    void writeFile();
    void closeFile();
}
class UnixFSReceiver implements FSReceiver{

    @Override
    public void openFile() {
        System.out.println(this.getClass().getName() + " opened a file");
    }

    @Override
    public void writeFile() {
        System.out.println(this.getClass().getName() + " wrote a file");
    }

    @Override
    public void closeFile() {
        System.out.println(this.getClass().getName() + " closed a file");
    }
}
class WindowsFSReceiver implements FSReceiver{

    @Override
    public void openFile() {
        System.out.println(this.getClass().getName() + " opened a file");
    }

    @Override
    public void writeFile() {
        System.out.println(this.getClass().getName() + " wrote a file");
    }

    @Override
    public void closeFile() {
        System.out.println(this.getClass().getName() + " closed a file");
    }
}