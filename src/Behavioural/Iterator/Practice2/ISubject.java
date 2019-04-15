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
        addItem("Classical B&W Cutouts of People's Shoes");
        addItem("Futuristic Modeling");
    }

    @Override
    public Iterator createInstance() {
        return new ArtsIterator( arts, size);
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
}



















