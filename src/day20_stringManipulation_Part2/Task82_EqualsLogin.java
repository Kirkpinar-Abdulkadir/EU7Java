package day20_stringManipulation_Part2;

import java.util.Scanner;

public class Task82_EqualsLogin {

	public static void main(String[] args) {
		
		/*LoginFunctionalityLogic
		UserName,Password
		--- > Program will ask to enter username and password 
		--- > If both username and password are blank
		"UserName and Password Fields cannot be empty" 
		--- > If userName is blank and password is not blank
		"UserName cannot be empty"
		--- > If userName is not blank and password is blank
		"Password cannot be empty"
		--- > If the username or password is not valid
		"UserName or password is not valid. Please verify" 
		--- > If the username and password are both valid
		"User Logged in successfully"*/

		String userNameSaved = "ali";
		String passwordSaved = "veli";
		int i=0;
		boolean login=false;
		
		while(!login) {
			
			if(i==3) {
				System.out.println("Your account is locked!!");
				break;
			}
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter username");
			String username = sc.nextLine();
			System.out.println("Enter password");
			String password = sc.nextLine();
			if(username.equals("") && password.equals("")) {
				System.out.println("Username and Password Fields can not be empty");
			}else if(username.equals("") && !password.equals("")) {
				System.out.println("Username can not be empty");
			}else if(!username.equals("") && password.equals("")) {
				System.out.println("Password can not be empty");
			}else if(!username.equals(userNameSaved) || !password.equals(passwordSaved)) {
				System.out.println("UserName or password is not valid. Please verify");	
			}else if(username.equals(userNameSaved) && password.equals(passwordSaved)){
				System.out.println("User Logged in succesfully");
				login=true;
			}
			i++;
		}
	}

}
