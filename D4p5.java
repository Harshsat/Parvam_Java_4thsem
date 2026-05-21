abstract class Vehicles{
    abstract void move();
    void start(){
        System.out.println("Vehicle is starting");
    }
}
class Cars extends Vehicles{
    void move(){
        System.out.println("Car moves on road");
    }
}
public class D4p5{
    public static void main(String args[]){
        Cars obj=new Cars();
        obj.start();
        obj.move();



    }
}