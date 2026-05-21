class Animals{
    void eat(){
        System.out.println("Animal is eating");
    }
}
class Dogs extends Animals{
    void bark()
    {
        System.out.println("Dog is barking");
    }
}
class Cat extends Animals{
      void meow()
    {
        System.out.println("cat is meowing");
    }

}
class D3p5{
    public static void main(String args[]){
        Dogs d=new Dogs();
        Cat c=new Cat();
        d.bark();
        c.meow();
        d.eat();
        c.eat();

    }
}