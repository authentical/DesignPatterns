package Behavioural.ChainOfResponsibility2;

enum MessagePriority {NORMAL, HIGH};

class Message {

    private String text;
    private MessagePriority priority;

    public Message(String text, MessagePriority priority) {
        this.text = text;
        this.priority = priority;
    }

    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
    public MessagePriority getPriority() {
        return priority;
    }
    public void setPriority(MessagePriority priority) {
        this.priority = priority;
    }
}


interface IReceiver {

    void setNextChain(IReceiver nextChain);   // Next implementation of ErrorChain to pursue
    boolean handleError(Message message);

}

class IssueRaiser{

    public IReceiver firstReceiver;

    public IssueRaiser(IReceiver firstReceiver) {
        this.firstReceiver = firstReceiver;
    }

    public void raiseError(Message message){

        if (firstReceiver != null) {

            firstReceiver.handleError(message);
        }

    }
}
//
//class FaxError implements ErrorChain {
//
//    private ErrorChain errorChain;
//
//    public FaxError(ErrorChain errorChain) {
//        this.errorChain = errorChain;
//    }
//
//    @Override
//    public void setErrorChain(ErrorChain nextChain) {
//        this.errorChain.setErrorChain(nextChain);
//    }
//
//    @Override
//    public void handleError(Message message) {
//        if(message !=COMM_ERROR.FAX_ERROR){
//
//        }
//    }
//}
//class EmailError implements ErrorChain {
//
//    private ErrorChain errorChain;
//
//    public EmailError(ErrorChain errorChain) {
//        this.errorChain = errorChain;
//    }
//
//    @Override
//    public void setErrorChain(ErrorChain nextChain) {
//        this.errorChain.setErrorChain(nextChain);
//    }
//
//    @Override
//    public void handleError(Message message) {
//
//    }
//}
//
//
//
//








public class ChainOfResponsiblityMain {
    public static void main(String[] args) {

    }
}
