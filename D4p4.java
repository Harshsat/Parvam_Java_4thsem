class Animal{


}
class Dog extends Animal{

}
public class D4p4{
    public static void main(String args[]){
        Dog d=new Dog();
        System.out.println(d instanceof Dog);
        System.out.println(d instanceof Animal);
    }
}