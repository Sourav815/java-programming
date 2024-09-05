class Phone{
    void ShowTime(){
        System.out.print("It is 10 o'clock...");
    }
    void On(){
        System.out.println("Turning on phone...");
    }
}
class SmartPhone extends Phone{
    void Music(){
        System.out.print("Playing music.");
    }
    void On(){
        System.out.println("Turning on Smartphone..."); // Override this method
    }
}

public class dynamicMethodDispatched{
    public static void main(String[] args) {
        Phone obj = new SmartPhone(); // THis is allowed 
        // SmartPhone obj = new Phone(); This is not allowed
        obj.ShowTime();
        SmartPhone obj2 = new SmartPhone();
        obj2.On();
        // obj.Music();// This will throw error because u can't play music using phone , this is the property of  SmartPhone
        
        /* super(method1, method2) ==>  subclass (method2 (Override), method3)

        Senario:1
            super 0bject = new sub(); right
            object.method2(); right , is called 
            object.method3(); not allowed
        
        senario:2
            subclass object = new superclass(); not allowed
        */
    }
}