package Behavioural.Iterator.Practice2;


/*

                                           _
     /\                                   | |
    /  \   __ _  __ _ _ __ ___  __ _  __ _| |_ ___
   / /\ \ / _` |/ _` | '__/ _ \/ _` |/ _` | __/ _ \
  / ____ \ (_| | (_| | | |  __/ (_| | (_| | ||  __/
 /_/    \_\__, |\__, |_|  \___|\__, |\__,_|\__\___|
           __/ | __/ |          __/ |
          |___/ |___/          |___/

 */


import java.util.ArrayList;
import java.util.List;

public interface ISubject {

    Iterator createInstance();
    void addItem(String str);
}

// Concrete Aggregate
class Arts implements ISubject{

    String[] arts;

    static final int MAX_ITEMS=10;
    int size=0;

    public Arts() {
        this.arts = new String[MAX_ITEMS];
        addItem("Angry Painting");
        addItem("Classical B&W Cutouts");
        addItem("Futuristic Modeling");
    }

    @Override
    public Iterator createInstance() {
        return new ArtsIterator( arts);
    }

    public void addItem(String str){

        if(size >=MAX_ITEMS){
            System.out.println("Full");
            // ALLOCATE MORE SPACE
        } else {

            arts[size] = str;
            size++;
        }
    }

    class ArtsIterator implements Iterator {

        String[] arts;

        int pos=-1;  // Index


        public ArtsIterator(String[] arts) {
            this.arts = arts;
        }

        @Override
        public boolean hasNext() {

            // Check if pos is {-1...array length-1}
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
        public String last() {// Todo Fix
            if(arts.length>0){
                return arts[arts.length-1];
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

}

// Concrete Aggregate
class Science implements ISubject{

    List<String> science;

    static final int MAX_ITEMS=10;
    int size=0;

    public Science() {
        this.science = new ArrayList<>(MAX_ITEMS);  // Could use decorator to create new limit?
        addItem("Hyper-Transmorphism");
        addItem("Atomic Barometry");
        addItem("Stars and Galaxies");
    }

    @Override
    public Iterator createInstance() {
        return new ScienceIterator(science);
    }

    public void addItem(String str){

        if(size >=MAX_ITEMS){
            System.out.println("Full");
            // ALLOCATE MORE SPACE
        } else {

            science.add(size, str);
            size++;
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
}



















