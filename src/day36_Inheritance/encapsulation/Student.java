package day36_Inheritance.encapsulation;

public class Student {
    private String name;
    private int age;
    private char gender,grade;
    private String schoolName;



    public Student(String name, int age, char gender, char grade, String schoolName) {
        setName(name);
        setAge(age);
        setGender(gender);
        setGrade(grade);
        setSchoolName(schoolName);
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if( age < 5 || age > 90){
            return;//exits the method
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {

        if( ! (gender =='M'  || gender == 'F')){
            return;
        }
        this.gender = gender;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {

        if(!( grade =='A' || grade =='B' || grade =='C' || grade =='D' || grade =='F' )){
            return;
        }
        this.grade = grade;
    }

    public String getSchoolName() {
        return schoolName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", grade=" + grade +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;


    }
}
/*private variables:
        name, age, gender, grade, schoolName

        Encapsulate all the fileds (at leat encapsulate two fields manually)
        Encapsulate all the fileds (at least encapsulate two fields manually)
        requirments:
        1. age should not be set less than 5 or greater than 90
        2. gender should not be set to any chanarcter other than: 'M' and 'F'
@@ -23,3 +23,28 @@ warmup tasks:
        toString()


        Encapsulation: hiding the fileds by giving private access modifiers

        use getter/setter to read/write the private data


        Getter (Read Only): public instance method
        Return type is not void
        Return type must match with private instance variable' data type
        Does not pass any parameter
        Returns the private instance variables value

        Setter (Write Only): public instance method
        Return type is void
        Passes a parameter
        Parameter' data type must match with private instance variable' data type
        reassigns the private instance variable to given argument

         use the data:
        1. read
        2. write */
