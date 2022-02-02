package day43_polymorphism;

public class AppleStore {
    public static void main(String[] args) {

        AppleDevice mac = new Mac();
        mac.use();
        //mac.code();  **Reference Type decides what is accessible.**

        Mac myMac = new Mac();
        myMac.use();
        myMac.code();

        AppleWatch watch = new AppleWatch();
        watch.use();
        watch.wear();



    }
}
