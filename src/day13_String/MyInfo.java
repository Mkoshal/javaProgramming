package day13_String;
import java.sql.SQLOutput;
import java.util.Scanner;

public class MyInfo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = scan.nextInt();

        System.out.println("Enter your gender");
        String gender = scan.next();

        scan.nextLine();

        System.out.println("Enter your full name");
        String fullName = scan.nextLine();//if the previous scanner' method that's used is not nextLine(), then we need

        System.out.println("Enter you phone number");
        long phone = scan.nextLong();

        System.out.println("Enter your zipcode");
        int zipcode = scan.nextInt();

        scan.nextLine();

        System.out.println("Enter your school name");
        String schoolName = scan.nextLine();

        System.out.println("Enter your city name");
        String city = scan.nextLine();

        System.out.println("Enter your state name");
        String state = scan.next();

        System.out.println("Enter your building number");
        int buildingNum = scan.nextInt();

        scan.nextLine();

        System.out.println("Enter your street name");
        String street = scan.nextLine();

        scan.close();

        System.out.println("Full name: " + fullName);
        System.out.println("Age: " +age);
        System.out.println("Gender: "+gender);
        System.out.println("Phone number: "+phone);
        System.out.println("Address: \n\t"+buildingNum+" "+street+"\n\t"+city+", "+state+" "+zipcode);
        System.out.println("School name: "+schoolName);

    }





}
