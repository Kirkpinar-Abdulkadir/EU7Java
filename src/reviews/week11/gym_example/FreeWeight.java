package reviews.week11.gym_example;

public class FreeWeight extends Lifting{


    @Override
    public void perform() {
        System.out.println("Lifting free weigths");
    }

    @Override
    public int getCaloriesCount(int minutes) {
        return 0;
    }

    @Override
    public void endLift() {
        System.out.println("Place the weights carefully");
    }
}
