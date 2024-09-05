class Complex{
    int r1,i1,r2,i2;
    Complex(int r1,int i1,int r2,int i2){
        this.r1=r1;
        this.i1 = i1;
        this.r2 =r2;
        this.i2 = i2;
    }
    public void Addition(){
        System.out.println("Sum of two complex number "+r1+" + i"+i1+" and "+r2+" + i"+i2+" is equal to "+(r1+r2)+" + ("+(i1+i2)+")i");
    }
    public void substraction(){
        System.out.println("Substraction of two complex number "+r1+" + i"+i1+" and "+r2+" + i"+i2+" is equal to "+(r1-r2)+" + ("+(i1-i2)+")i");
    }
    public void multiplication(){
        System.out.println(" Multiplication two complex number "+r1+" + i"+i1+" and "+r2+" + i"+i2+" is equal to "+(r1*r2-i1*i2)+" + ("+(i1+i2)+")i");
    }
}

public class complexNumberAlgebra {
    public static void main(String[] args) {
        Complex c = new Complex(2, 3, 4, 5);
        c.Addition();
        c.substraction();
        c.multiplication();
    }
    
}
