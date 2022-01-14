package day21_ForEachLoop;
import java.util.Arrays;
import java.util.Scanner;

public class ArraysUtility {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};

        System.out.println(nums);//hashcode
        System.out.println(Arrays.toString(nums));//{1,2,3,4,5}

        System.out.println("-------------------------------------------");

        int[] numbers = {3, 6, 9, 12, 15, 18};
        for(int each : numbers) {
            System.out.println(each);
        }

    }
}
