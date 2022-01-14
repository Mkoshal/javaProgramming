package replits;
import java.util.Arrays;
import java.util.Scanner;
public class Main {


        public static boolean isAnagram(String word1, String word2) {
            word1 = word1.toLowerCase();
            word2 = word2.toLowerCase();
            char[] w1 = word1.toCharArray();
            char[] w2 = word2.toCharArray();
            Arrays.sort(w1);
            Arrays.sort(w2);
            return Arrays.equals(w1, w2);




        }

        // Do not touch below


        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println(isAnagram(in.nextLine(), in.nextLine()));
        }

    }

