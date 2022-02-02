package day14_Methods_Part2;

public class ValueReturn {

	public static void main(String[] args) {

		System.out.println(sum(2, 3));
		int v1 = sum(2, 3);
		System.out.println(v1*5);
		System.out.println(v1);
		
	}

	public static int sum(int num1, int num2) { /* void oldugunda herhangi bir dönüs yok.
		bu method dan bir cikti alacaksak o degiskenin tipi void yerine yaziliyor*/
		
		int result; //local variable 
		result=num1+num2; //5
		
		return result; /* sadece bu methodun icinde gecerli olan degiskenin
						baska bir yerde kullaninmasi icin kullanilan kod. method dan bir 
						return alinabilir. ARRAY modeli ile artilirir ama o sonraki konu.
						Return olan  deger method adina atanir*/
		
		
		
	}
	
	
	
}
