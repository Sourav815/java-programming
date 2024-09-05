class A {
    int i;
    int j;

    void showij() {
        System.out.println("The value of i: " + i + " and j : " + j);
    }
}

class B extends A {
    int k;

    void showijk() {
        System.out.println("The value of i: " + i + " j: " + j + " and k: " + k);
    }

    void sum() {
        System.out.println("sum of three value (i,j,k) is : " + (i + j + k));
    }
}

public class practice1 {

    public static void main(String[] args) {
        // A obj1 = new A();
        B obj2 = new B();
        obj2.i = 10;
        obj2.j = 20;
        obj2.k = 30;
        System.out.println("Call class A object using class B object.");
        // Call class A object using class B object.
        obj2.showij();
        // Call class B object using class B object.
        System.out.println("Call class B object using class B object.");
        obj2.showijk();
        obj2.sum();

    }
}
