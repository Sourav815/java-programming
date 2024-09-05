import java.util.Scanner;

class Employee {
    int salary;
    String name;
    int id;

    void getdata(int s, int i, String n) {
        salary = s;
        id = i;
        name = n;
    }

    void setdata() {
        System.out.println("Employee Name\t Employee Id \t Salary");
        System.out.print(""+ name + "\t\t" + id + "\t " + salary);
    }

}

    public class problem01{

    public static void main(String[] args) {
        Employee e1 = new Employee();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee Details: ");
        // System.out.println("Name: "+ name +);
        String name = sc.nextLine();
        int id = sc.nextInt();
        int salary = sc.nextInt();
        e1.getdata(salary, id, name);
        e1.setdata();
        sc.close();
    }

}
