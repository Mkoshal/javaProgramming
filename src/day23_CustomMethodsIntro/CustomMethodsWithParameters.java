package day23_CustomMethodsIntro;

public class CustomMethodsWithParameters {
    public static void main(String[] args) {
        //oddOrEven();//the method demands additional info to complete this task
        oddOrEven(10);

        ageOfPerson(2021);
    }
    //create a function that can check if a number is odd number of even number
    public static void oddOrEven(int number){
        if(number % 2 ==0){
            System.out.println(number+" is even number");

        }else{
            System.out.println(number+" is odd number");
        }

    }

    //create a function that can display the age of the person

    public static void ageOfPerson(int birthYear){
        int age = 2021 - birthYear;
        System.out.println("Your age is: "+age);

    }
}
