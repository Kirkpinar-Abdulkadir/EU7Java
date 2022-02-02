package day35_encapsulation;

public class EmployeeTest {
    public static void main(String[] args) {

        Employee e1 = new Employee();
        Employee e2 = new Employee("Mark",674532);
        Employee e3 = new Employee("Ted",394655,"Sales","Sales Person");

        System.out.println(e1.getName() + "|" + e1.getIdNumber() + "|" + e1.getDepartment() + "|" + e1.getPosition());
        System.out.println(e2.getName() + "|" + e2.getIdNumber() + "|" + e2.getDepartment() + "|" + e2.getPosition());
        System.out.println(e3.getName() + "|" + e3.getIdNumber() + "|" + e3.getDepartment() + "|" + e3.getPosition());

        e1.setName("mike");
        e1.setIdNumber(785689);
        e1.setDepartment("Accounting");
        e1.setPosition("VP");

        System.out.println(e1.getName() + "|" + e1.getIdNumber() + "|" + e1.getDepartment() + "|" + e1.getPosition());

        System.out.println(e2.toString());

    }
}
