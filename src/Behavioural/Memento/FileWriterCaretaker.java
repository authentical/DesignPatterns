package Behavioural.Memento;

import java.util.Stack;

public class FileWriterCaretaker {

    private static Stack<Object> mementos;


    // Get fileWriter to return it's Memento as object
    public static void save(FileWriterUtil fileWriter){

        mementos.push(fileWriter.save());
    }

    // Send Memento object back to fileWriter
    public static void restore(FileWriterUtil fileWriter){

        if(!(mementos.size()==1)) {
            fileWriter.restore(mementos.pop());
        } else{
            fileWriter.restore(mementos.peek());
        }
    }

    // Todo if Im going to do multiple state save/restore, I need
    // a method to check to see if  there are any states left.
    // First state to be saved perhaps should be peeked only

    // Still thinking over if this really breaks the pattern tho since...
    // Well I suppose if you just store  a single memento... private Obbject obj...
    // the last memento you saved will still be there and is never "deleted" until
    // a new memento is saved.
}
