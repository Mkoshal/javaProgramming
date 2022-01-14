package day20_Arrays;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {

        // create a variable that's capable enough to contain 5 names
        String[] myGroup = new String[9];
        myGroup[0] = "Gunay";
        myGroup[1] = "Neira";
        myGroup[2] = "Suat";
        myGroup[3] = "Hulya";
        myGroup[4] = "Muhtar";


        //System.out.println(myGroup);//hashcode-wrong way printing array
        System.out.println(Arrays.toString(myGroup));//["Gunay", "Neira", "Suat", "Hulya", "Muhtar"


        System.out.println("------------------------------------------------------------");


        String[] months = {"January", "February", "March", "April", "May", "June", "July","August","September","October","November","December" };

        System.out.println(Arrays.toString(months));
        int number =13;
        if(number<1 || number>12){
            System.err.println("Invalid number");
            System.exit(0);
        }
        System.out.println(months[number-1]);
    }
}

