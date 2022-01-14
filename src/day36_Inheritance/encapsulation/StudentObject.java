package day36_Inheritance.encapsulation;

public class StudentObject {
    public static void main(String[] args) {
        Student student1 = new Student("Maha", 32,'M','D',"MIT");
       student1.setAge(39);
        System.out.println(student1);
    }
}
