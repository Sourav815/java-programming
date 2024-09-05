class Box{
    int width;
    int length;
    int height;
    String color;
    Box(int w,int l,int h){
        width = w;
        length = l;
        height = h;
    }
    int volumn(){
        return (width*length*height);
    }
}
class boxWeight extends Box{
    int weight;
    String color;
    boxWeight(int w,int l,int h,int we,String c1,String c2){
        super(w, l, h);
        super.color = c1;/* another use of super keyword super can also be used to call methods that are 
        hidden by a subclass.*/
        weight = we;
        color= c2;
    }
    void colorShow(){
    System.out.println("Box colors are "+super.color +", "+color);
    }
}
public class practice2{
    public static void main(String[] args) {
        boxWeight obj1 = new boxWeight(5, 10, 15, 20, "red","Yollow");
        System.out.println("The Weight of Box is: "+obj1.weight);
        System.out.println("The volumn of Box is: "+(obj1.volumn()));
        obj1.colorShow();
    }
}