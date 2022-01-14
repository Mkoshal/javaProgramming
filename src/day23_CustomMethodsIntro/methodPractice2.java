package day23_CustomMethodsIntro;

public class methodPractice2 {
    public static void main(String[] args) {

        helloWorld5Times();
        System.out.println("---------------------------------");
        helloCydeo5Times();
        System.out.println("-------------------------------------");
        evenNumbers();
    }

    public static void helloWorld5Times(){
        for (int i = 0; i <5 ; i++) {
            System.out.println("hello world");

        }

    }

    public static void helloCydeo5Times(){
        for (int i = 0; i < 5; i++) {
            System.out.println("hello Cydeo");

        }
    }
    // Create a function that can print all the even numbers from 1~10==>evenNumbers
    public static void evenNumbers(){
        for (int i = 1; i <11 ; i++) {
            System.out.println(i);

        }
    }
}
