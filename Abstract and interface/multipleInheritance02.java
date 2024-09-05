interface A {
    public void greet();
}

interface B {
    public void ask();
}

class AB {
    String name;

    AB(String name) {
        this.name = name;
    }

    public void showName() {
        System.out.println("Hi! " + name);
    }
}

class ABX extends AB implements A, B {
    int x ;
    ABX(String name , int x) {
        super(name);
        this.x = x;
    }

    public void greet() {
        System.out.println("Good Morning Welcome to A.I");
    }

    public void ask() {
        System.out.println("How can I help you sir...");
    }
    public void number(){System.out.println(x);}
}

public class multipleInheritance02 {
    public static void main(String[] args) {
        ABX obj = new ABX("Sourav",5);
        obj.showName();
        obj.greet();
        obj.ask();
        obj.number();

    }

}
