package reviews.week11.gym_example;

public class AtTheGym {
    public static void main(String[] args) {

        FreeWeight freeWeight = new FreeWeight();
        freeWeight.start();

        System.out.println("I lifted weigth for 30 minutes: " + freeWeight.getCaloriesCount(30) + " Calories");




    }
}
