package day45_exceptions;

public class TryCatch2 {
    public static void main(String[] args) {

        int[] nums = {36,6,34,12};

        try {
            System.out.println(nums[6]);
        }catch (Exception e){
            //System.out.println("Wrong index");
            //e.printStackTrace();
            System.out.println(e.getMessage());
        }

        try {
            int j=100;
            int n=j/0;
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }



    }
}
