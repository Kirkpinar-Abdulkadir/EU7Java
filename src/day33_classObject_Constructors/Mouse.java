package day33_classObject_Constructors;

public class Mouse {

    int numTeeth;
    int numWhiskers;
    int weigth;

    //1
    public Mouse(int weigth){
        this(30,weigth); // you are calling constructor
        this.weigth = weigth;
        System.out.println("JAVA");
    }

    //2
    public Mouse(int numTeeth, int weigth) {
        this(numTeeth,20,weigth);
        this.numTeeth = numTeeth;
        this.weigth = weigth;
        System.out.println("JS");
    }

    //3
    public Mouse(int numTeeth, int numWhiskers, int weigth) {
        this.numTeeth = numTeeth;
        this.numWhiskers = numWhiskers;
        this.weigth = weigth;
        System.out.println("C");
    }

    public void print(){
        System.out.println(weigth + " " + numTeeth + " " + numWhiskers);
    }
}
