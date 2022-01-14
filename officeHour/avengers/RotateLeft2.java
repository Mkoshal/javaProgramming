package avengers;

import java.util.Scanner;

public class RotateLeft2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter one word:");
        String word= scan.next();

      //  String word = "Hello";
        String temp=word.substring(2)+word.substring(0,2);
        System.out.println("temp= "+temp);

        String temp2="";
        for (int i = 0; i < 2; i++) {
            temp2+=word.charAt(i);

        }
        for (int i = 0; i <2 ; i++) {
            temp2+=word.charAt(i);

        }
        System.out.println("temp= "+temp2);

        //scan.close();


    }
}
