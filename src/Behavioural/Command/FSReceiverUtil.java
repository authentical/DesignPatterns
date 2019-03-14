package Behavioural.Command;

public class FSReceiverUtil {

    public static FSReceiver getSystemOS(){

        String os = System.getProperty("os.name");

        System.out.println("OS is: " + os);

        if(os.contains("Windows")){
            return new WindowsFSReceiver();
        } else {
            return new UnixFSReceiver();
        }
    }
}
