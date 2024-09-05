interface Area{
    float pi = 3.14f;
    float areaCalculate();

}
class rectangle implements Area{
    int x,y ;
    rectangle(int x, int y){
        this.x=x;
        this.y = y;
    }
    public void showC(){System.out.println("I am from Rectangle.");}
    public float areaCalculate(){
        return (x*y);
    }
}
class circle implements Area{
    int r;
    circle(int r){
        this.r = r;
    }
    public void showD(){System.out.println("I am from Circle.");}
    public float areaCalculate(){
        return (pi*r*r);
    }
}

public class runTimePolymorphismUsingInterface {
    public static void main(String[] args) {
        circle c = new circle(10);
        rectangle r = new rectangle(10,20);

        System.out.println("Area of Rectangle is : "+c.areaCalculate());
        System.out.println("Area of circle is : "+r.areaCalculate());

        // Implementation of run time polymorphism take decision at rumtime which method will invoke

        Area a; // this is not an object
        a = c;
        a =r;
        System.out.println("Area of Rectangle is : "+a.areaCalculate());
        System.out.println("Area of circle is : "+a.areaCalculate());

        // a.showC(); this will throw error because a is refference of interface Area it only knows about the methods in Area interface its actually a pointer poits the address of Area

    }
    
}
