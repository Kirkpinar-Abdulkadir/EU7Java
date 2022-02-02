package week4;

public class salary {

	
	//attributes: rate(how much you make an hour) 45-75 / asgari ücret 15 dolars
	//			weekly hour (int), taxRate
	//actions: setInfo() -> initialize your variables
	//			salary() rate*weeklyHour*52
	//			totalTax() salary*taxRate
	//			salaryAfterTax
	
	double rate;
	int weeklyHour;
	double taxRate;
	
		public void setInfo(double r, int h, double t) {
		rate=r;
		weeklyHour=h;
		taxRate=t;
		
		}
	
		public double salary(){
	        return rate * weeklyHour * 52;
	    }

	    public double taxTotal(){
	        return salary() * taxRate;
	    }

	    public double salaryAfterTax(){
	        return salary() - taxTotal();
	    }
	
	
}
