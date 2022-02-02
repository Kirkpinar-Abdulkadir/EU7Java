package day10_ControlFlowStatements_Part4;

public class TernaryOperator {

	public static void main(String[] args) {
		String result;
		int score=88;
		
//		if (score>60) {
//			result="Pass";
//		}else {
//			result="fail";
//		}

		result = score>60 ? "pass" : "fail"; //üstteki ifade ile ayni
		
		
		int x=5;
		System.out.println(x>2 ? x<4 ? 10 : 8 : 7); //alttaki ile ayni (nested)
		
//		if (x>2) {
//			if (x<4) {
//				System.out.println(10);
//			}else {
//				System.out.println(8);
//			}
//		} else {
//			System.out.println(7);
//		}
	}

}
