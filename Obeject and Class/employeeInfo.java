class Employee{
    String name,YOJ,city;
    int salary;
    
    Employee(String name,String YOJ,int salary, String city){
        this.name = name;
        this.YOJ = YOJ;
        this.salary = salary;
        this.city = city;
    }
    void Show(){
        System.out.println(name+"\t"+YOJ+"\t"+salary+"\t"+city);
    }
}

public class employeeInfo {
    public static void main(String[] args) {
        Employee e1 = new Employee("Sourav Bhunia", "22/05/2012", 50000, "Medinipur");
        Employee e2 = new Employee("Sujay Roy", "27/05/2012", 10000, "Kolkata");
        Employee e3 = new Employee("Sangeet Ghosh", "05/01/2016", 44045, "Kharagpur");
        System.out.println("Employee Name"+"\tYear of Joining"+"\tSalary"+"\tCity");
        System.out.println("================================================================");
        e1.Show();
        e2.Show();
        e3.Show();
    }
    
}
