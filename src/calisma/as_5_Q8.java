import java.util.Scanner;

public class as_5_Q8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int upperBound=sc.nextInt();
		int num=1;
		int sum=0;

			while(num<=upperBound) {

				if(num==1) {

					System.out.print(num);
					sum=sum+num;
					num++;
					

				}

				System.out.print(" + "+num);				
				sum+=num;
				num++;

		}
		System.out.println(" = "+sum);

	}

}
