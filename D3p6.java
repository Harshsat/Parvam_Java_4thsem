class Vehicle{
    String color="Red";
    Vehicle(){
        System.out.println("Vehicle constructor called");
    }
    void display(){
        System.out.println("this is Vehicle class");
    }
}
class Car extends Vehicle{
    String color="Blue";
    Car(){
        super();
        System.out.println("Car constructor called");
    }
    void show(){
        System.out.println("parent color:"+super.color);
        super.display();
        System.out.println("child color:"+color);
    }
}
public class D3p6{
    public static void main(String args[]){
        Car c=new Car();
        c.show();


    }
}