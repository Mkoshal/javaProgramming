package day07_Operators;

public class ShortHandOperators {

    public static void main(String[] args) {
        //assignment: =
        int number = 100;
        System.out.println("number = " + number);//100

        number = 200;

        System.out.println("number = " + number);//200


        String word = "Java Programming";

        System.out.println("word = " + word);//Java Programming

        word = "Wooden Spoon";
        System.out.println("word = " + word);


        System.out.println("------------------------------------");

        //Addition Assignment:
        int x = 100;
        System.out.println("x = " + x);

        System.out.println(x + 200);//300

        // x = x + 200;
        x += 200;
        System.out.println("x = " +x);

        String str = "Wooden";
        str +=" Spoon";
        System.out.println("str = " + str);

        double num1 = 2.5;
        System.out.println("num1 = " + num1);//2.5

        double availableBalance = 1000.50;

        //deposit 300$
        availableBalance +=300;
        System.out.println("availableBalance = " + availableBalance);


        System.out.println("-------------------------------------------------------");

        //withdrawing 500$
         availableBalance -= 500;
        System.out.println("availableBalance = " + availableBalance);
        // withdrawing 200$, then depositing 400$








    }



}
