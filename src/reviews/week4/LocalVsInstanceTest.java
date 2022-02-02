package reviews.week4;

public class LocalVsInstanceTest {

	public static void main(String[] args) {
		
		week4.LocalVsInstance obj = new week4.LocalVsInstance();

		System.out.println(" -----local variable-------");
		obj.showDifference();
		
		System.out.println("------instance variable-------");
		obj.a=10;
		System.out.println(obj.a);

	}

}
