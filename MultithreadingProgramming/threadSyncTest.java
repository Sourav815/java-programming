class Table{
    synchronized void numTable(int n){
        for(int i=1;i<=n; i++){
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
// class Table {
//     synchronized void numTable(int n) {
//         for (int i = 1; i <= 10; i++) { 
//             try {
//                 Thread.sleep(1000);
//             } catch (Exception e) {
//             }
//             System.out.println(n + "*" + i + "=" + n * i);
//         }
//     }
// }

class thread1 extends Thread {
    Table t;

    thread1(Table x) {
        t = x;
    }

    public void run() {
        t.numTable(10);
    }
}

class thread2 extends Thread {
    Table t;

    thread2(Table x) {
        t = x;
    }

    public void run() {
        t.numTable(20);
    }
}

public class threadSyncTest {
    public static void main(String[] args) {
        Table t = new Table();
        thread1 t1 = new thread1(t);
        thread2 t2 = new thread2(t);
        t1.start();
        t2.start();
    }

}
