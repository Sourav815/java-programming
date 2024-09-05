public class stringBuffer {
    public static void main(String args[]){
        StringBuffer s = new StringBuffer("java Programming");
        String s1 = new String(" Language");
        StringBuffer s2 = new StringBuffer("is ");
        // s.setLength(40);
        s.replace(4, 5, s1);
        System.out.println(s);

    }
    
}
