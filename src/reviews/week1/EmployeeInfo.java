package week1;

public class EmployeeInfo {

	public static void main(String[] args) {
		
		/* benim yazdigim
		 * String name,companyName,jobTitle,gender,salary,employeeID,hasBenefits,maritalstatus;
		 
		name="Abdulkadir";
		companyName="Cybertek";
		jobTitle="SDET student";
		gender="Male";
		salary="3000€";
		employeeID="647363546";
		hasBenefits="Y";
		maritalstatus="Y";
		
		System.out.println("Name        : "+name);
		System.out.println("Cybertek    : "+companyName);
		System.out.println("Job Titel   : "+jobTitle);
		System.out.println("Gender      : "+gender);
		System.out.println("Salary      : "+salary);
		System.out.println("Employee ID : "+employeeID);
		System.out.println("Benefits    : "+hasBenefits);
		System.out.println("Marital Stat.: "+maritalstatus);
		*/
		
		//Oscarin yazdigi
		String name = "Oscar";
		String companyName = "Cybertek";
		String jobTitle = "SDET";
		String gender = "Male";
		int salary = 100_000;
		int employeeID = 12345;
		boolean hasBenefits = true;
		boolean isMarried = true;
		
		System.out.println(name+" "+companyName+" "+jobTitle+ "\n "
				+ gender+ " "+ salary+" TL\n "+ 
				"Employee ID :\t"+ employeeID+
				"hasBenefits :\t" + hasBenefits+
				"\nis he married:\t "+ isMarried);
		
		
	}

}
