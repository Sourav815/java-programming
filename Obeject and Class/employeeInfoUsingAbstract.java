import java.util.Scanner;

abstract class Information {
    public abstract void employeeInfo();
}

class employee extends Information {
    String name, id;
    int salary;
    static String companyName = "Wipro";

    public void employeeInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee details (Name,Eid,salary respectively): ");
        name = sc.nextLine();
        id = sc.nextLine();
        salary = sc.nextInt();
    }

    public void Showdata() {
        System.out.println(name + "\t" + id + "\t\t" + salary + "\t\t" + companyName);
    }
}

public class employeeInfoUsingAbstract {
    public static void main(String[] args) {

        employee em = new employee();
        employee em1 = new employee();
        employee em2 = new employee();
        em.employeeInfo();
        em1.employeeInfo();
        em2.employeeInfo();
        System.out.println("===================================================");
        System.out.println("Employee Name\tEmployeeID\tSalary(PA)\tCompany Name");

        em.Showdata();
        em1.Showdata();
        em2.Showdata();
    }
}
