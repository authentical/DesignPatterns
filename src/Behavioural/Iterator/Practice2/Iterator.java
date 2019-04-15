package Behavioural.Iterator.Practice2;



// Iterates over Subjects

import java.util.List;

public interface Iterator {

    String first();

    String last();

    Object current();

    boolean hasNext();

    boolean hasPrev();

    Object next();

    Object prev();
}


class ArtsIterator implements Iterator {

    String[] arts;

    int pos=-1;  // Index

    int size;


    public ArtsIterator(String[] arts, int size) {
        this.arts = arts;
        this.size = size;
    }

    @Override
    public boolean hasNext() {

        if(arts[pos+1]==null) {

            return false;
        }

        return true;
    }

    @Override
    public boolean hasPrev() {

        if(arts[pos-1]==null) {

            return false;
        }

        return true;
    }

    @Override
    public Object next() {

        if(this.hasNext()) {
            pos++;

            return arts[pos];
        }else {

            throw new IndexOutOfBoundsException("No next element");
        }
    }

    @Override
    public String first() {

        if(arts.length>0){
            return arts[0];
        }

        return "Array empty";
    }

    @Override
    public String last() {
        if(size>0){
            return arts[size-1];
        }

        return "Array empty";
    }

    @Override
    public Object current() {
        if(pos>-1) {
            return arts[pos];
        }

        return "";
    }

    @Override
    public Object prev() {
        if(this.hasPrev()) {
            pos--;

            return arts[pos];
        }else {

            throw new IndexOutOfBoundsException("No previous element");
        }
    }
}

class ScienceIterator implements Iterator {

    List<String> science;

    int pos=-1;  // Index


    public ScienceIterator(List<String> science) {
        this.science = science;
    }

    @Override
    public boolean hasNext() {

        // Check if pos is {-1...array length-1}
        if(science.get(pos+1)==null) {

            return false;
        }

        return true;
    }

    @Override
    public boolean hasPrev() {


        if(science.get(pos-1)==null) {

            return false;
        }

        return true;
    }

    @Override
    public Object next() {

        if(this.hasNext()) {
            pos++;

            return science.get(pos);
        }else {

            throw new IndexOutOfBoundsException("No next element");
        }
    }

    @Override
    public String first() {

        if(science.size()>0){
            return science.get(0);
        }

        return "";
    }

    @Override
    public String last() {// Todo Fix
        if(science.size()>0){
            return science.get(science.size()-1);
        }

        return "";
    }

    @Override
    public Object current() {
        if(pos>-1) {
            return science.get(pos);
        }

        return "";
    }

    @Override
    public Object prev() {
        if(this.hasPrev()) {
            pos--;

            return science.get(pos);
        }else {

            throw new IndexOutOfBoundsException("No previous element");
        }
    }
}
