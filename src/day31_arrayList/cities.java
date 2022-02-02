package day31_arrayList;

import java.util.ArrayList;



public class cities {

	public static void main(String[] args) {
		
		ArrayList<String> cities = new ArrayList<>();
		
		cities.add("London");
		cities.add("Virginia");
		cities.add("DC");
		cities.add("Baku");
		cities.add("Berlin");
		cities.add("Baku");
		
		System.out.println(cities.toString());
		
		
		//print each city by using for each loop
		
		for(String city : cities) {
		System.out.println(city);
		}
		
		System.out.println("---------------------------");
		//Print each city by using for-iterator loop
		
		for(int i=0; i<cities.size(); i++) {
			System.out.println(cities.get(i));
		}
		
		//Removing Baku
		cities.remove("Baku"); //String oldugundan dolayi bir object tir.. ondan direk yazdik.
		cities.remove("New York"); //new york yok hata vermez bisey yapmaz
		
		System.out.println(cities.toString());
		
		System.out.println("---------------------------");
		
		cities.add(0, "Arlington");
		cities.add(1, "Istanbul"); //istenilen yere koyup gerisini kaydiriyor
		
		System.out.println(cities.toString());
		
		
		int idx = cities.indexOf("Istanbul");
		System.out.println(idx);
		
		System.out.println(cities.indexOf("Bursa")); //listede olmadigindan -1 döner
		
		cities.clear();
		boolean empty=cities.isEmpty();
		System.out.println(empty);
	}

}
