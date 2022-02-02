package day22_StringManipulation_Part4;

public class String_isEmpty {

	public static void main(String[] args) {

//		String userName = "";
//		String password = "";
//		
//		if(userName.isEmpty()) {
//			System.out.println("Username field can not be empty");
//		}else {
//			System.out.println("Username is not empty");
//		}
//		
//		
//		if(userName.isEmpty() || password.isEmpty()) {
//			System.out.println("Username or password can not be empty");
//		}else {
//			System.out.println("Username or password is not empty");
//
//		}
		
		String b="rumble";
		b+=b.concat("4").substring(3,b.length()-1);
		System.out.println(b);
		
	}

}
