package reviews.week8;

public class Login {
    public static void main(String[] args) {
        Credentials credentials = new Credentials();
        //System.out.println(credentials.userName); Not reachable

        System.out.println(credentials.getPassWord());
        System.out.println(credentials.getUserName());

        credentials.setPassWord("nebucadnezar33");
        System.out.println(credentials.getPassWord());


    }

}
