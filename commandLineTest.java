public class commandLineTest {
    public static void main(String[] args) {
        int x,y,z=0;
        if(args.length != 2){
            System.out.println("Enter exactly two number!");
        }
        else{
            x= Integer.parseInt(args[0]);
            y=Integer.parseInt(args[1]);
            z= x+y;
            System.out.println("sum of "+x+" and "+y+" is :"+z);
        }
    }
}
