package week6;

public class A02_ArraysExample {

	public static void main(String[] args) {
		
		// create an in array which has HTML stattus codes of:
		//200, 201, 204, 400,401,403,404,and 500 statusCodes.
		
		int[] statusCodes = {200,201,204,400,401,403,404,500};
		
		System.out.println("Size of my array: " + statusCodes.length);
		
		String[] responseTypes = {"OK", "Created", "No Content", "Bad Request", "Unauthorized",
									"Forbidden", "Not Found", "Internal Server Error"};
		
		//Loop through each element of these arrays, you have two options:
		// 1. with index numbers -- classic for(int i=0;.......) we know the size
		// 2. with forEach loop
		
		
		// 1. Example
		for(int i=0; i<statusCodes.length; i++) {
			System.out.println(statusCodes[i] + " Status Code : " + responseTypes[i]);
		}
		
		// 2. Example
		// for each loop can be used with collections and data structures(like array)
		// array, aaryList, List, Map, etc....
		// pro: easier syntax, no need to deal with index  -- cons: not reversible
		System.out.println("----------for each loop---------");
		int j = 0;
		for(String response : responseTypes) {
			System.out.println(statusCodes[j] + " Status Code : " + response);
			j++;
		}

		
	}

}
