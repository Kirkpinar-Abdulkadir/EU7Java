package assignments.StringsAndMethods;

import java.util.Scanner;

public class Question_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String start = sc.next();
        start = start.toUpperCase();
        String end = sc.next();
        end = end.toUpperCase();

        String route = "Aright > Bdown > Cleft > Dup > Aright > Bdown > Cleft";

        if(start.equals(end)){
            System.out.println(start + "found");
        }else{
            if(route.indexOf(start)<route.indexOf(end)){
                route = route.substring(route.indexOf(start),route.indexOf(end)-3);
            }else{
                route = route.substring(route.indexOf(start),route.lastIndexOf(end)-3);
            }
            for (int i = 0; i < route.length()-1; i++) {
                if(Character.isUpperCase(route.charAt(i))){
                    route = route.replace(route.charAt(i),' ');
                }
            }
            System.out.println(route + ": " + end + " found");
        }

    }
}
