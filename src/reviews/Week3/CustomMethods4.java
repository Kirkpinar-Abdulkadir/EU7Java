package Week3;

public class CustomMethods4 {
	
	/*create a method which will recieve two boolean parameters
	 * isUppercase : true print alphabet in uppercase
	 * goATOz : true print alphabet from A/a -> Z/z false z->a
	 * gelAllLetters
	 */

	

//	public static void main(String[] args) {
//		
//	getAllLetters(true,false);
//	}
//
//	private static void getAllLetters(boolean isUppercase, boolean goATOz) {
//		
//		if (isUppercase) {
//			
//			if(goATOz) {
//				
//				for(char i='A'; i<='Z'; i++) {
//					
//					System.out.print(i+" ");
//				}
//			}else {
//				for(char i='Z'; i<='A'; i--) {
//					
//					System.out.print(i+" ");
//				}
//			}
//		}
//			
//		
//	}
//
//}
	public static void main(String[] args) {
		
		
		System.out.println(getAllLetters(false,false));
		System.out.println(getAllLetters(true,false));
		System.out.println(getAllLetters(false,true));
		System.out.println(getAllLetters(true,true));
		
	}

	public static String getAllLetters(boolean isUpperCase, boolean goAtoZ) {
		
		char start;
		char finish;
		String result="";  // dummy variable
		
		
		if (isUpperCase) {
			start = 'A';
			finish = 'Z';
		}else {
			start = 'a';
			finish = 'z';
		}
		
		if(goAtoZ) {
			for( ; start<=finish;start++) {
				result+=start+ " ";
			}
		}else {
			for ( ; finish >= start; finish--) {
				result+=finish+ " ";
			}
		}
		
		
		return result;
	}
	
	
	
	
}