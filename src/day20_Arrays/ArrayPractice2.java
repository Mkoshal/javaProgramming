package day20_Arrays;

import java.util.Arrays;

public class ArrayPractice2 {

    public static void main(String[] args) {
        char[] letters= new char[26];
        for(char i = 'A', j=0 ; i<='Z' && j < letters.length; i++, j++) {
            letters[j]=i;
        }

        System.out.println(Arrays.toString(letters)); // [A-Z]

        System.out.println("------------------------------------------------------");

        char[] letters2 = new char[26];
        for(char i = 'Z', j=0 ; i >='A' && j < letters2.length;i--,j++){
            letters2[j]=i;


        }

        System.out.println(Arrays.toString(letters2));

        System.out.println("-------------------------------------------------------");

        int[] numbers2 = new int[100];
        for(int n = 0; n< numbers2.length;n++) {
            numbers2[n] = n+1;
        }
        System.out.println(Arrays.toString(numbers2));


        System.out.println("--------------------------------------------------------------");

        //2. create an array that has the numbers 100 to 1
        int[] numbers = new int[100];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]= numbers.length-i;
        }
        System.out.println(Arrays.toString(numbers));

        System.out.println("-----------------------------------------------------------");








    }

}
