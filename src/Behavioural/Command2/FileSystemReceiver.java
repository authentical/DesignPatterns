package Behavioural.Command2;


// Will have impl for different OS's

public interface FileSystemReceiver {
    void openFile();
    void writeFile();
    void closeFile();
}


class UnixFileSystemReceiver implements FileSystemReceiver{

    @Override
    public void openFile() {

    }

    @Override
    public void writeFile() {

    }

    @Override
    public void closeFile() {

    }
}
class WindowsFileSystemReceiver implements FileSystemReceiver{

    @Override
    public void openFile() {

    }

    @Override
    public void writeFile() {

    }

    @Override
    public void closeFile() {

    }
}