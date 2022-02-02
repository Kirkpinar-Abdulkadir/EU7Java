package day41_abstract_class;

public abstract class Bird extends Animal{
    //First concrete  class must have the implementation.
    //if it is also abstract, don't need to have the implementation of abstract methods. (OPTIONAL)

    /*@Override
    public void eat() {
        System.out.println("Bird is eating food");
    }*/

    @Override
    public void breathe() {
        System.out.println("Bird is breathing");
    }

    public abstract void fly();
}
