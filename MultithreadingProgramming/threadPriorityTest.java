class A extends Thread {
    public void run() {
        for (int i = 1; i <= 500; i++) {
            System.out.println("I am class A. i= " + i);
        }
        System.out.println("Exit from A");
    }
}

class B extends Thread {
    public void run() {
        for (int j = 1; j <= 500; j++) {
            System.out.println("I am class B. j= " + j);
        }
        System.out.println("Exit from B");
    }
}

class C implements Runnable {
    public void run() {
        for (int k = 1; k <= 500; k++) {
            System.out.println("I am class C. k= " + k);
        }
        System.out.println("Exit from C");
    }
}

public class threadPriorityTest {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        Thread c1 = new Thread(c);

        /*
         * set thread priority
         * setPriority(), getPriority() value should be between 1 to 10
         * priority constant
         * MIN_PRIORITY =1
         * NORM_PRIORITY = 5
         * MAX_PRIORITY = 10
         */
        a.setPriority(10);
        b.setPriority(a.getPriority()-5);
        c1.setPriority(1);
        a.start();
        b.start();
        c1.start();
        System.out.println("Exit from main");

    }
}
