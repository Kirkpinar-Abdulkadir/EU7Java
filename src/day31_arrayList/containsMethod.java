package day31_arrayList;

import java.util.ArrayList;

public class containsMethod {

	public static void main(String[] args) {
		
		ArrayList<String> list1 = new ArrayList<>();
		
		list1.add("Jan");
		list1.add("Feb");
		list1.add("Mar");
		list1.add("Apr");
		list1.add("May");
		
		System.out.println(list1);
		
		ArrayList<String> list2 = list1;
		
		//copy all values form list1
		ArrayList<String> months = new ArrayList<>(list1);
		months.add("Jun");
		months.add("July");
		months.add("August");
		System.out.println(months);
		
		System.out.println(months.contains("Jan"));
		System.out.println(months.contains("Dec"));
		
		//how to check if feb is in second pos.
		if(months.get(1).equals("Feb")){//bunu kullanmaya gerek yok. zaten equals metodu boolean dönüyor
			System.out.println(true);
		}else System.out.println(false);
		
		System.out.println(months.indexOf("Feb")==1);
		System.out.println(months.get(1).equals("Feb"));
		
		
		list1.add("Jan");
		System.out.println("List1 : "+list1); //list1 de iki Jan var. yine de inkluded sayiyor
		System.out.println("Months : "+months);
		
		if(months.containsAll(list1)) {
			System.out.println("Monts has all list1");
		}else {
			System.out.println("Some values are missing");
		}
		
		
		
	}
}
