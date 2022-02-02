package day40_accessmodifiers_final_hiding;

public class FinalArray {
    public static void main(String[] args) {

        final int[] TEAMS = {11,11};
        System.out.println(TEAMS[0]);

        TEAMS[0] =15;
        System.out.println(TEAMS[0]);

        int[] nums = new int[]{20,45,67};
        nums = new int[] {28,65,34}; //final lmadigindan reference degistirilebilir.

        final int[] finalNums = {23,65,78};
        finalNums[0] = 120; //elements can be changed

        //finalNums = new int[]{54,76,1}; final oldugundan reference degistirilemez.





    }
}
