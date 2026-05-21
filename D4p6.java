interface Animaal{
    void sound();
}
class Doog implements Animaal{
    public void sound(){
        System.out.println("Dog barks");
    }
}

public class D4p6{
    public static void main(String args[]){
        Doog d=new Doog();
        d.sound();
    }
}