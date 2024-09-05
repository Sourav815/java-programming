class A implements Runnable {
    public void run() {
        for (int i = 1; i <= 20; i++) {
            System.out.println("I am thread A. i = " + i);
        }
        System.out.println("Exit from A");
    }
}
class B implements Runnable {
    public void run() {
        for (int j = 1; j <= 20; j++) {
            System.out.println("I am thread B. j = " + j);
        }
        System.out.println("Exit from B");
    }
}
public class runnableThreadTest {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);
        
        t1.start();
        t2.start();

        System.out.println("Exit from main");
    }
}
