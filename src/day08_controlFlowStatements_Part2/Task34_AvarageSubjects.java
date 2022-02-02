package day08_controlFlowStatements_Part2;

public class Task34_AvarageSubjects {

	public static void main(String[] args) {
		
		double math=81;
		double chem=80;
		double bio=80;
		
		double avg=(math+chem+bio)/3;
		
		if (avg>=90 && avg<=100) {
			System.out.println("Your grade is A with Average = "+avg);
			
		}else if(avg>=80 && avg<=89) {
			System.out.println("Your grade is B with Average = "+avg);
			
		}else if(avg>=70 && avg<=79) {
			System.out.println("Your grade is C with Average = "+avg);
			
		}else if(avg>=60 && avg<=69) {
			System.out.println("Your grade is D with Average = "+avg);
			
		}else if(avg>=0 && avg<=59) {
			System.out.println("Your grade is F with Average = "+avg);
			
		}else {
			System.out.println("You do not have a valid grade"+avg);
			
		}

	}

}
