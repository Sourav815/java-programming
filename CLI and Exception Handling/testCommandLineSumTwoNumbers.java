public class testCommandLineSumTwoNumbers {
    public static void main(String[] args) {
        int x,y,z;
        if(args.length!=2){
            System.out.println("Please Enter only two numbers...");
        }
        else{
            x = Integer.parseInt(args[0]);
            y = Integer.parseInt(args[1]);
            z = x+y;
            System.out.println(x+" + "+y+" = "+z);
        }
    }
}
