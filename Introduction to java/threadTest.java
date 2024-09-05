
class A extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            if(i==3)
                yield();
            System.out.println("I am from class A: i= " + i);
        }
        System.out.println("Exit from class A");
    }
}

class B extends Thread {
    public void run() {
        for (int j = 1; j <= 10; j++) {
            System.out.println("I am from class B: j= " + j);
        }
        System.out.println("Exit from class B");
    }
}

class threadTest {
    public static void main(String[] args) {
        new A().start();
        new B().start();
    }
}
