package day05_Concetation;

public class FullName {
    public static void main(String[] args) {
        String firstName = "Makhabat";
        String lastName = "Koshalieva";
        int age = 32;
        String jobTitle = "SDET";
        String companyName = "Apple Inc";
        double salary = 100000.58;


        String fullName = firstName + " " + lastName;

        System.out.println(firstName + " " + lastName);
        System.out.println(fullName + " is " + age + " years old ");
        System.out.println(fullName + " is " + jobTitle + " at " + companyName + " , and " + fullName + " salary is " + salary );



    }
}
