package Behavioural.Memento;

import java.util.Stack;

// Originator
public class FileWriterUtil {

    private String filename;
    private StringBuilder content;

    public FileWriterUtil(String filename) {
        this.filename = filename;
        this.content = new StringBuilder();
    }


    // Get Set
    @Override
    public String toString() {
        return this.content.toString();
    }
    public void write(String str){

        content.append(str);
    }


    // Memento Save Restore
    public Memento save(){

        return new Memento(this.filename, this.content);
    }
    public void restore(Object obj){

        Memento memento = (Memento) obj;
        this.filename = memento.filename;
        this.content = memento.content;
    }



    // MEMENTO - A copy of outer object state
    private class Memento{

        private String filename;
        private StringBuilder content;

        public Memento(String filename, StringBuilder content) {
            this.filename = filename;
            // Deep copy the StringBuilder or else you're holding on
            // to a changing object
            this.content = new StringBuilder(content);
        }
    }

}
