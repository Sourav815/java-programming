
class A extends Thread{
    public void run(){
        for(int i=1; i<=10;i++){
            System.out.println("I am class A. i= "+i);
        }
        System.out.println("Exit from A");
    }
}
class B extends Thread{
    public void run(){
        for(int j=1; j<=10;j++){
            System.out.println("I am class B. j= "+j);
        }
        System.out.println("Exit from B");
    }
}
class C extends Thread{
    public void run(){
        for(int k=1; k<=10;k++){
            System.out.println("I am class C. k= "+k);
        }
        System.out.println("Exit from C");
    }
}
public class threadTest {
    public static void main(String[] args) {
        A a=new A();
        B b = new B();
        a.start();
        b.start();
        new C().start(); /* Anonymous simply means nameless. An object which has no reference is known as an anonymous object. It can be used at the time of object creation only.
        If you have to use an object only once, an anonymous object is a good approach.*/
        //a.run();   // if we directly call run method thread will not create and run method will run one after another object.
        // start method create thread and then thread will automatically call run because run method inbuilt in package
    }
}
