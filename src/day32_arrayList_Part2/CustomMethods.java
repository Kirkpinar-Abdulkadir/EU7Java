package day32_arrayList_Part2;

import java.util.ArrayList;
import java.util.Random;

public class CustomMethods {

	public static void main(String[] args) {
		
		ArrayList<Integer> numsList = new ArrayList<>();
		numsList.add(10);
		numsList.add(10);
		numsList.add(7);
		numsList.add(8);
		numsList.add(8);
		numsList.add(3);
		numsList.add(4);
		numsList.add(8);
		
		printList(numsList);
		
		ArrayList<Double> doubleList = new ArrayList<>();
		doubleList.add(10.33);
		doubleList.add(1.22);
		doubleList.add(7.34);
		doubleList.add(3.53);
		doubleList.add(4.76);
		
		
		double sum = sumList(doubleList);
		System.out.println(Math.round(sum));
		
		//+++++++++++++++++++++++++
		
		ArrayList<Integer> list = getList(20);
		System.out.println(list.toString());
		
		//++++++++++++++++++++++++++
		
		ArrayList<Integer> rList = getRandomList(20);
		System.out.println(rList.toString());
		
		//++++++++++++++++++++++++++
		ArrayList<String> strNums = new ArrayList<>();
		strNums.add("123");
		strNums.add("33");
		strNums.add("12");
		
		ArrayList<Integer> converted = convertToIntList(strNums);
		System.out.println(converted);
	
		
	}
	
	public static void printList(ArrayList<Integer> nums) {
		
		for(Integer val : nums) {
			System.out.print(val+" ");
		}
		System.out.println();
	}
	
	public static double sumList(ArrayList<Double> n){
		
		double total = 0;
		
		for(Double val : n) {
			total = total+val;
		}
		return total;
	}
	
	public static ArrayList<Integer> getList(int size){
		
		ArrayList<Integer> newList = new ArrayList<>();
		
		for(int i=0; i<size; i++) {
			newList.add(i+1);
		}
		return newList;
	}
	
	public static ArrayList<Integer> getRandomList(int size){
		
		ArrayList<Integer> list = new ArrayList<>();
		Random rn = new Random();
		
		for(int i=0; i<size; i++) {
			list.add(rn.nextInt(101)); //autoboxing
		}
		return list;
		
	}
	
	public static ArrayList<Integer> convertToIntList(ArrayList<String> str){
		
		ArrayList<Integer> intList = new ArrayList<>();
		
		for(int i=0; i<str.size(); i++) {
			 
			intList.add(Integer.parseInt(str.get(i))); //valueOf da olur.
		}
		
	return intList;	
	}

}
