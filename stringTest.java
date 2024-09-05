interface A{
    static final float pi = 3.14f;
    public abstract void computation();
}
class circle implements A{
    float radius;
    circle(int r,int y){
        radius =(float) r;
    }
    public void computation(){
        System.out.println("Area of circle: "+(pi*radius*radius));
    }
}
class rectangle implements A{
    int l,b;
    rectangle(int l,int b){this.l=l;this.b=b;}
    public void computation(){
        System.out.println("Area of Rectangle: "+(l*b));
    }
    void greet(){System.out.println("HI I am from rectangle");}
}
public class stringTest {
    public static void main(String[] args) {
        A ref;
        rectangle r = new rectangle(5,6);
        circle c = new circle(5,6);
        // r.computation();
        // c.computation();
        ref = r;
        ref.computation();
       // ref.greet();        // this is dynamic method dispatch (Run-time polymorphism)
        ref = c;
        ref.computation();
        

    }
        
}
