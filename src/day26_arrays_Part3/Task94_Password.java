package day26_arrays_Part3;

import java.util.Arrays;

public class Task94_Password {

	public static void main(String[] args) {
		
		String info1 = "This info is used for creation password : xxxCD132Gxxx . Please do not share with anyone";
		String info2 = "This info is used for creation password : xxx00ABC!xxx . Please do not share with anyone";
	
	
//		String[] infoArray1=info1.split("xxx");
//		System.out.println(Arrays.toString(infoArray1));
//		
//		String[] infoArray2=info2.split("xxx");
//		System.out.println(Arrays.toString(infoArray2));
	
		String pass1=info1.split("xxx")[1];
		System.out.println(pass1);
		
		String pass2=info2.split("xxx")[1];
		System.out.println(pass2);
		
		String password = pass1 + pass2;
		System.out.println(password);
	
	}

}
