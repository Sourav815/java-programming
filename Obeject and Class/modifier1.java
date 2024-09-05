class Myemployee
{
    private int id;
    private String name;
    public void GetData(String n, int i) {
        this.id = i;
        this.name = n;
    }
    public int Identification() {
        return id;
    }
    public String Empname() {
        return name;
    }
}

public class modifier1
{
    public static void main(String[] args) {
        Myemployee E1 = new Myemployee();
        // E1.name = "Sourav"; --> we can't access name variable this will throw an error because name is private in Myemployee scope.

        E1.GetData("sourav",20);
        System.out.println("Employee ID is "+ (E1.Identification()));
        System.out.println("Employee name is "+(E1.Empname()));
    }
}
