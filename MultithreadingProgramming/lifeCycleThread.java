class A extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            // if(i==3){
            //     // super.run();
            //     // yield();
            // }
            System.out.println("I am class A. i= " + i);
        }
        System.out.println("Exit from A");
    }
}

class B extends Thread {
    public void run() {
        for (int j = 1; j <= 10; j++) {
            if (j == 5)
                stop();
            System.out.println("I am class B. j= " + j);
        }
        System.out.println("Exit from B");
    }
}

class C extends Thread {
    public void run() {
        for (int k = 1; k <= 10; k++) {
            if (k == 2)
            
                try {
                    sleep(10000);
                } catch (Exception e) {
                }
            System.out.println("I am class C. k= " + k);
        }
        System.out.println("Exit from C");
    }
}

public class lifeCycleThread {
    public static void main(String[] args) {
        A a=new A();
        B b = new B();
        a.start();
        b.start();
        new C().start();
    }
}
