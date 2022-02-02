package day31_arrayList;

import java.util.ArrayList;

public class arrayListExample {

	public static void main(String[] args) {
		
		//languages
		//Print size arrayList
		////read couple of elements
		
		ArrayList<String> languages = new ArrayList<>();
		
		languages.add("German");
		languages.add("English");
		languages.add("Turkish");
		languages.add("French");
		languages.add("Arabic");
		
		System.out.println(languages.size());
		
		System.out.println(languages.get(0));
		System.out.println(languages.get(3));
		
		
		System.out.println(languages.toString());
		
		languages.remove(0);
		System.out.println(languages.toString());

		languages.add(1, "Kurdish");
		System.out.println(languages.toString());


	}

}
