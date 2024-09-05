interface A{
    interface B{
        public void show();
    }
}
class C implements A.B{
    int x =10;
    public void show(){System.out.println("I am show method from nested interface");}
}

public class multithreadtest {
    public static void main(String[] args) {
    A.B b;
    C c = new C();
    b=c;
    b.show();
    

    }
}
