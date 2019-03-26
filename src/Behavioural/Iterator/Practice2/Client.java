package Behavioural.Iterator.Practice2;

public class Client {

    public static void main(String[] args) {



        ISubject arts = new Arts();

        ISubject science = new Science();

        Iterator artIter = arts.createInstance();

        Iterator sciIter = science.createInstance();


        System.out.println(sciIter.hasNext());

        System.out.println(artIter.last());



    }

}
