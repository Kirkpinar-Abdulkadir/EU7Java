package Week3;

public class ContinueAndBreakExamples {

	public static void main(String[] args) {
		
		for(int i=0; i<10; i++) {
			
			if(i==3 || i==7) {
				continue;
			}
			if(i==8) {
				break;
			}
			System.out.println(i);
		}
		
		System.out.println("------------------------------");
		
		outer: for (int i=0; i < 4 ; i++) {

            if (i==2) {
                continue;
            }

            inner: for (int j = 0; j < 4; j++) {

                if(j==2) {

                    continue outer;
                }

                if (i==1) {

                    break outer;

                }

                System.out.println("i : " + i + " j : "+ j);

            }



		}
	}
}


