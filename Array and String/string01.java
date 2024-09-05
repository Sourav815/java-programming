public class string01 {
    public static void main(String[] args) {
        String name = new String("My name is Sourav");
        System.out.println(name);  // String is immutible can't change it

        // use of length method to determine string length
        System.out.println(name.length());

        // use toLowercase and toUpperCase
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        // use of trim method to remove space before and after string
        String name1 = ("   Sourav ");
        System.out.println(name1);
        System.out.println(name1.trim());

        // use of substring method to print substring (like 3 to 5 index) from string
        System.out.println(name.substring(5));

        // use of substring using starting and ending index
        // But it will print in Substring from starting index to (ending - 1) index , note that index start from 0.
        System.out.println(name.substring(1,5));

        // use of replace method
        // replacement is case sensetive
        System.out.println(name.replace('S', 'g'));

        // use of startwith to check starting character
        // casesensetive 
        System.out.println(name.startsWith("my"));
        System.out.println(name.endsWith("rav"));

        // use of chatAt to return character at a particular index
        System.out.println(name.charAt(4));

        // use of indexOf to return index no for a particular character if does not match it will return -1
        System.out.println(name.indexOf("s"));
        // System.out.println(name.indexOf("ZS"));

        // use of equals to check equallity
        System.out.println(name.equals("My name is Sour"));

        // use of equalIgnoreCase to check equallity
        System.out.println(name.equalsIgnoreCase("my name is sourav"));

        // escape sequence character
        System.out.println("I am escape sequence \" double quote");
    }
}
