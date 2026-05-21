class Student{
    String name;
    Student(String name){
        this.name=name;
    }
    void display(){
        System.out.println("Student name:"+name);
    }
}
public class d2Main2{
    public static void main(String[] args) {
        Student s1=new Student("harshita");
        s1.display();
    }
}