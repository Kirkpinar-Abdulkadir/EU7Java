package reviews.week4;

public class ScrumTeam {

	
	public String companyName;
	int developers;
	int testers;
	double developerSalary;
	double testerSalary;
	double companyRevenue;

	public double costOfTheTeam() {
		return developers*developerSalary+testers*testerSalary;
	}
	
	public double returnOfInvestment() {
		return companyRevenue/costOfTheTeam();
	}
	
	public void createCompany(String name, int devNums, int tesNums) {  // setter method
		companyName = name;
		developers = devNums;
		testers = tesNums;
	}


	public String toString() {
		return "ScrumTeam [companyName=" + companyName + ", developers=" + developers + ", testers=" + testers
				+ ", developerSalary=" + developerSalary + ", testerSalary=" + testerSalary + ", companyRevenue="
				+ companyRevenue + "]";
	}
	
	
}
