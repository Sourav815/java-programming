class Average{
    int x,y,z,average;
    Average(int x,int y,int z){
        this.x =x;
        this.y =y;
        this.z = z;
    }
    public int calculate(){
        average = (x+y+z)/3;
        return average;
    }
}

public class avarageofThreeNumbers {
    public static void main(String[] args) {
        Average a = new Average(2,3,4);
        System.out.print("Average of these numbers is : "+a.calculate());
    }
    
}
