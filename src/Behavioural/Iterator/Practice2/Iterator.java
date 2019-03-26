package Behavioural.Iterator.Practice2;



// Iterates over Subjects

public interface Iterator {

    String first();

    String last();

    Object current();

    boolean hasNext();

    boolean hasPrev();

    Object next();

    Object prev();
}

