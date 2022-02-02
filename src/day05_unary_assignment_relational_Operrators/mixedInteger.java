package day05_unary_assignment_relational_Operrators;

public class mixedInteger {

	public static void main(String[] args) {
		
		int i1=5;
		int i2=10;
		float f1=15.5f;
		double d1=20.5;
		
		int res1=i1+12;
		float res2=i1+f1;//yapilan islemdeki en buyuk data tipine atanir.
		double res3= i2+d1;
		
		short firstNumber=10;
		short secondNumber=20;
		int thirdNumber=firstNumber+secondNumber;/*burda thirdNumber short olarak 
											tanimlanamaz. cunku islem yaparken 
											integer den kucuk olanlar (byte ve short)
											 integer olarak atanir. 
											 sonuc da integer (en az) olmalidir.
											  ya da typecasting yapilabilir*/
		short thirdNumber2=(short)(firstNumber+secondNumber);
		
		//byte b1=20;
		//byte b2=2;
		//int b3=b1*b2; veya byte b3=(byte)(b1*b2);
		
		
		int b1=126;
		int b2=1;
		byte res= (byte)(b1+b2); //casting required. Variable kullaniliyor.
		
		byte res4=126+1;//no casting required. degerler limit ici olduktan sonra sikinti yok.
		
		
		
		
	}

}
