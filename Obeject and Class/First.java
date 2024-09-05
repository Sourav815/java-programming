class Student{
    int id;
    String name;
    void show(){
        System.out.print("MY Student Id is " + id +" " );
        System.out.println("and name is " + name);
    }
}

public class First{
    public static void main(String[] args) {
        Student s = new Student();
        s.id = 12;
        s.name = "Sourav";
        s.show();
    }
}