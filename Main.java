/*class Student{//defaut access modifier
    String name="harshita";
    void display(){
        System.out.println(name);
    }
}
public class Main {
    public static void main(String[] args) {
        Student s=new Student();
        s.display();
    }
}*/
class Employee{
    String name;
    Employee(String n){
        name=n;
    }
    void display(){
        System.out.println(name);
    }
}
public class Main {
    public static void main(String[] args) {
        Employee e1=new Employee("harshita");
        e1.display();
    }
}