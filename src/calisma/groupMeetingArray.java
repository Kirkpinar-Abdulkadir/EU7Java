import java.util.Arrays;

public class groupMeetingArray {

	public static void main(String[] args) {
		
		 int[]  arr = {1,3,2,100,3,4,56,5,98,45,100,100};

	        //to print an array
	        for (int i=0;i<arr.length;i++){
	            System.out.print(arr[i]);
	        }
	        for (int each:arr) {
	            System.out.print(each);

	        }
	        System.out.println(Arrays.toString(arr));
	        System.out.println("-----------------------------------------");
	       
	        //Arrays class
	        Arrays.sort(arr);
	        System.out.println(Arrays.toString(arr));

	        // String Class
	        String str="Hello world";
	        String[] s = str.split(""); //split with empty string and get a string
	        char[] chars = str.toCharArray(); // use toCharArray
	        
	        System.out.println(Arrays.toString(s));
	        System.out.println(Arrays.toString(chars));

	        //extra notes
	        char char1='a'; //
	        char char2='b';
	        System.out.println(char1 + char2); // this will give us a number
	        System.out.println(""+char1+char2);//ab
	        str.contains(""+char1); //convert a char to a string


	        // average
	        // frequency of 100
	        // uniques in the array
	        //most frequent one --- hard question

	    
		
	}

}
