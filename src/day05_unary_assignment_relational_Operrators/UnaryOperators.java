package day05_unary_assignment_relational_Operrators;

public class UnaryOperators {

	public static void main(String[] args) {
		
		int i1=10;
		int i2=-100;
		int i3=-(i1+i2);
		
		System.out.println("i1 = "+i1);
		System.out.println("i2 = "+i2);
		System.out.println("i3 = "+i3);
		
		boolean flag=false;
		System.out.println(!flag); //tersi
		System.out.println(!!flag);//iki defa cevirir
		
		int i=10, j=5;
		System.out.println(i++); //10
		System.out.println(i);   //11
		System.out.println(--j); //4
		System.out.println(j);   //4
		//önce ise ayni satirda, sonra ise sonraki satirdan itibaren gecerli
		
		
		i++; //i=i+1
		--j; //j=j-1
		System.out.println("i = "+i);
		System.out.println("j = "+j);
		
		//i=11, j=4
		int res= i++ + --j; // artirim bu satirda gecerli degil
		System.out.println("res = "+res);
		
	}
	
	

}
