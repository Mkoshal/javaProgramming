package replits;

import java.util.Scanner;

public class UniqueArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for(int i=0; i < size; i++){
            nums[i] = scan.nextInt();

        }
        printUniqueNumbers(nums);
    }

    public static void printUniqueNumbers(int[] nums){
        //WRITE YOUR CODE HERE

            for (int num : nums) {
                int count = 0;
                for (int element : nums) {
                    if(num==element){
                        count++;
                    }
                }
                if(count==1){
                    System.out.println(num);
                }

            }




        }



    }

