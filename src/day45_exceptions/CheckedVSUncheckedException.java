package day45_exceptions;

public class CheckedVSUncheckedException {
    public static void main(String[] args)  {

        try {
            Thread.sleep(2000); //***** checked exception *****
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
