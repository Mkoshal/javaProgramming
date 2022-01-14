package day20_Arrays;
import java.util.Arrays;

import java.util.*;

public class Task_MaxNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int num[] = new int[10];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        String th = "";

        for (int i = 0; i < num.length; i++) {
            th = (i==0)?"st":(i==1)?"nd":"th";
            System.out.println("Enter "+(i+1)+th+" number : ");
            num[i] = s.nextInt();
            max = (num[i]>max)?num[i]:max;
            min = (num[i]<min)?num[i]:min;
        }
        System.out.println("Max number: "+max+"\nMin number: "+min+"\n\n"+ Arrays.toString(num));


        System.out.println("------------------------------------------------------");

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 10 number");
        int[] number = {scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt()};
        int max1 = -2000000000;
        int min1 = 2000000000;

        for (int i = 0; i < number.length; i++) {
            if (number[i] > max1) {
                max1 = number[i];
            }
            if (number[i] < min1) {
                min1 = number[i];
            }


        }

        System.out.println("max is: " + max1);
        System.out.println("min is: " + min1);

    }
}