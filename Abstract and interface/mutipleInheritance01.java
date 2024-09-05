interface A{
    static final int x = 10;
    public void showA(); 
}
interface B{
    float y = 15.5f;
    public void showB();
}
class AB implements A,B{
    int z;
    AB(int z){
        this.z = z;
    }
    public void showA(){
        System.out.println("Hi! I am from A. x= " +x);
    }
    public void showB(){System.out.println("Hi! I am from B. y= "+y);}
    void showAB(){System.out.println("Hi! I am from AB. z= "+z);}

}
public class mutipleInheritance01 {
    public static void main(String[] args) {
        AB obj = new AB(20);
    obj.showA();
    obj.showB();
    obj.showAB();
    }
    
}
