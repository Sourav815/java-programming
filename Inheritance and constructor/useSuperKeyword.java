class Base{
    Base(){
        System.out.println("This is default constructor in base class");
    }
    Base(int x){
        System.out.println("This is parameterized constructor in base class with value of x: "+ x);
    }
}
class Derived extends Base{
    void show (){
        System.out.println("Using of super keyword");
    }
    Derived(){
        System.out.println("This is default constructor in base class");
    }
    Derived( int x, int y){
        super(x);
        System.out.println("This is parameterized constructor in Derived class with value of x: "+ y);
    }
}

public class useSuperKeyword {
    public static void main(String[] args) {
        Derived d = new Derived(2,3);
        d.show();
    }
}
