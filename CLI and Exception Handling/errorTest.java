public class errorTest {
    public static void main(String[] args) {
        int name[];
        String s = "abc";
        name = new int [5];
        name[2]= 10;
        // name[7]=5;  Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 5
        // at errorTest.main(errorTest.java:5)
        // System.out.println("The number is "+name[7]); 
        System.out.println("The number is "+name[2]);

        // x=Integer.parseInt(s);  Exception in thread "main" java.lang.NumberFormatException: For input string: "abc"
        // int x;
        // System.out.print(x);  

        /* Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "<local4>" is null
        at errorTest.main(errorTest.java:15) */
        // String A = null;
        // System.out.println(A.length());

        /*Exception in thread "main" java.lang.ArithmeticException: / by zero
        at errorTest.main(errorTest.java:21)*/
        // int x ;
        // x = 100/0;
        // System.out.println(x);

    }
    
}
