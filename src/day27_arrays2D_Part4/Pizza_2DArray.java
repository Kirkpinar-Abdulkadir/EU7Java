package day27_arrays2D_Part4;

import java.util.Arrays;


public class Pizza_2DArray {

	public static void main(String[] args) {
		
		String[][] pizzas = {
				
				{"pinneapple","pepperoni"}, 		 //row-0
				{"anchovies","mushroom","olives"},	 //row-1
				{"4 cheese"},
				{"chicken","tomatoes","onioons"},
				{"green peppers","zuccini","brocoli","spinach","shrimp"}
		};
		
		System.out.println(Arrays.toString(pizzas[0]));
		
		System.out.println("------------------------");
		
		for(String[] pizza : pizzas) {
			System.out.print(pizza.length + "-");
			System.out.println(Arrays.toString(pizza));
		}
		
		System.out.println("------------------------");
		
		System.out.println("###FOR ITERATOR LOOP###");
		for(int i=0;i<pizzas.length;i++) {
			System.out.print(pizzas[i].length);
			System.out.println(Arrays.toString(pizzas[i]));
		}
		
		System.out.println("------------------------");
		
		for(int i=0; i<pizzas[3].length; i++) {
			System.out.println(pizzas[3][i]);
		}
		
		System.out.println("-----------for each loop-------------");
		
		for(String pizza : pizzas[3]) {
			System.out.println(pizza);
		}
		
		System.out.println("***************************");
		
		int[][] students = {
				{4,5,6}, //each row is array int[] inside 2d array int[][]
				{12,5,7},
				{23,56,12,55,3}
				};
		
		for(int[] group : students) {
			for(int studentID : group ) {
				System.out.print(studentID + " ");
			}
			System.out.println();
		}
		
		
		
		
	}

}
