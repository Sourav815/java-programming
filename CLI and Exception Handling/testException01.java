public class testException01 {
    public static void main(String[] args) {
        int x=3,y=5,z=5,s=1;
        int arr[]= new int[5];
        try{
            arr[6]=5;
        }
        catch(NullPointerException e){
            System.out.println("Type of exception "+e);
        }
        catch(ArithmeticException e){
            System.out.println("Type of exception "+e);
        }
        System.out.println("The value of s is: "+s);
        System.out.println("MY name is sourav...");
    }
    
}
