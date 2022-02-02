package day34_Constructors;

public class Ligth {

    int numberOfWatts;
    boolean indicator;
    String location;

    //1
    public Ligth(){
       this(0,false);
        System.out.println("returning form no-argument cons no.1");
    }

    //2
    public Ligth(int watt, boolean ind){
        this(watt,ind,"X");
        System.out.println("returning form cons no.2");

    }

    public Ligth(int numberOfWatts, boolean indicator, String location) {
        this.numberOfWatts = numberOfWatts;
        this.indicator = indicator;
        this.location = location;
        System.out.println("returning form cons no.3");

    }
}
