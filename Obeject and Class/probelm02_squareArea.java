class square{
    int a;
    public int Area(){
        return a*a;
    }
    public int perimeter(){
        return 4*a;
    }
}

public class probelm02_squareArea {
    public static void main(String[] args) {
        square s = new square();
        s.a=3;
        System.out.println("Area of this Square: "+s.Area());
        System.out.print("Perimeter of this Square: "+s.perimeter());

    }
    
}
