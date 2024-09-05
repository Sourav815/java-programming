import java.util.Vector;

class test1 {
    public static void main(String[] args) {
        Vector v = new Vector();
        int length = args.length;
        System.out.print(length);
        for(int i=0; i<length;i++){
            v.addElement(args[i]);
        }
        v.addElement("sourav");
        int size = v.size();
        String[] str = new String(size);
        v.copyInto(str);
        for(int i=0;i<size;i++){
            System.out.print(str);
        }
    }
}
