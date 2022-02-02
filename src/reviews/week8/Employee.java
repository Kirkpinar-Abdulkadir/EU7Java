package reviews.week8;

public class Employee {

    public String name;
    public String jobTitle;
    public int ID;
    double salary;

    public static String compName = "Microsoft"; // static variable, same copy for all my objects

    public Employee(String name, String jobTitle, int ID, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.ID = ID;
        this.salary = salary;
    }


    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", ID=" + ID +
                ", salary=" + salary +
                '}';
    }
}
