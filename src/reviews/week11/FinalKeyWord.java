package reviews.week11;

public class FinalKeyWord {

    final String name; //instance variable (initialize yapilmali--> farkli sekillerde yapilabilir.)
    final int age;
    final static String color; //can be initialized at the same line or in static block

    public FinalKeyWord(String name) {
        this.name = name;
        //this.color = color; not possible
    }

    { //init block
        this.age = 28;
    }

    static {
        color = "black";
    }

    public static void main(String[] args) {

        final int x; //local variable
        x = 10;
        // x = 20; final oldugundan.
        System.out.println(x);

    }
}
