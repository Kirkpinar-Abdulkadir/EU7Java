package day41_abstract_class;

public class Dog extends Animal{ //First concrete class

    @Override
    public void eat(){ //extend edilen classda eat() oldugundan burda da olmak ZORUNDA.
        System.out.println("Dog is eating food");
    }

    @Override
    public void breathe() {
        System.out.println("Dog is breathing");
    }
}
