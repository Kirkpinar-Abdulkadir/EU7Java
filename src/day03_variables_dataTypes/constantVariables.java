package day03_variables_dataTypes;

public class constantVariables {

	public static void main(String[] args) {
		
		double PI=3.14;
		PI=5;
		
		
		PI=5;
		PI=100;
		
		System.out.println(PI); //run yapinca 100 yazar, cunku son 100 olarak assign edildi.
								// 100.0 seklinde yazacak cunku double yani kesirli
		
		//degistirlmemesini istiyorsak "final" kullanmaliyiz. yoksa hata verir
		
		//final double PI=3.14;
		
		final String BIRTHDAY="04/01/1979";
		final int capacity=50;
				

	}

}
