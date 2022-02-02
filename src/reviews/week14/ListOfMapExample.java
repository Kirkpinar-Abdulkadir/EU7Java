package reviews.week14;

import java.util.*;

public class ListOfMapExample {
    public static void main(String[] args) {

        Map<String,String> empOneData = new LinkedHashMap<>(); //to keep the insertion order
        empOneData.put("EmpID","123");
        empOneData.put("EmpName","John");
        empOneData.put("JobTitle","SDET");
        empOneData.put("Salary","100_000");
        System.out.println(empOneData);

        Map<String,String> empTwoData = new LinkedHashMap<>(); //to keep the insertion order
        empTwoData.put("EmpID","124");
        empTwoData.put("EmpName","Mike");
        empTwoData.put("JobTitle","Dev");
        empTwoData.put("Salary","120_000");
        System.out.println(empTwoData);

        //I want to get Mike's salary.
        System.out.println(empTwoData.get("EmpName") + " gets $" + empTwoData.get("Salary"));
        System.out.println("************");

        //My goal is to put all employees infos together with Java collection

        List<Map<String,String>> employeesList = new ArrayList<>();
        employeesList.add(empOneData);
        employeesList.add(empTwoData);
        //employeesList.add(new HashMap<>());
        System.out.println(employeesList);

        for (Map<String, String> emp : employeesList) {
            if(emp.get("EmpName").equals("Mike")){
                System.out.println(emp.get("Salary"));
            }
        }

    }
}
