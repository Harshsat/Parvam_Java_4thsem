class Grandfather{
    void land(){
        System.out.println("Grandfather has land");
    }
}
class father extends Grandfather{
    void bike(){
    System.out.println("father has bike");
    }
}
class Son extends father{
    void laptop(){
        System.out.println("Son has laptop");
    }
}
public class D3p4{
    public static void main(String args[]){
        Son s=new Son();
        s.land();
        s.bike();
        s.laptop();

    }
}