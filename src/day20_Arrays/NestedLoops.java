package day20_Arrays;

public class NestedLoops {
    public static void main(String[] args) {
        String str = "aabcccd";
        String result = "";//a2b1c3d1

        for (int j = 0; j < str.length(); j++) {


            char ch = str.charAt(j); //'a'
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                char each = str.charAt(i);//each character of string
                if (ch == each) {
                    count++;
                }
            }
            System.out.println(count);
        }


    }

}
