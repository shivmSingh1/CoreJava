package Basics;

public class Student {
    String name;
    int age;

    Student(String name, int age){
    this.name=name;
    this.age=age;
    }

    @Override
    public String toString() {
        return "student details{name: "+name+" ,age: "+age+"}";
    }

    public static void main(String[] args) {
        Student st= new Student("Shivam",19);
        System.out.println(st);
    }
}
