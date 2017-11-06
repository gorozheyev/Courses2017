package lecture_5;

import java.util.Arrays;

public class MethodApp {

    public static void main(String[] args) {
        int number = 4;
        System.out.println("3 id even: " + isEven(3));
        System.out.println("4 id even: " + isEven(number));

        System.out.println("6 is even to 3: " + isEven(6, 3));
        System.out.println("8 is even to 3: " + isEven(8, 3));

        int array[] = {1, 2, 3, 4, 5, 7, 9};
        System.out.println("Array sum = "+ arraySum(array));

        char word[] = {'j','a','v','a'};
        System.out.println(Arrays.toString(charsToCodes(word)));
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static boolean isEven(int numbe1, int number2) {
        return numbe1 % number2 == 0;
    }

    public static int arraySum(int[] array) {
        int sum =0;
        for (int i : array){
           sum = sum+i;
        }
        return sum;
    }

    public static int[] charsToCodes(char[] chars){
        int length = chars.length;
        int codes[] = new int[length];
        for (int i=0 ; i<length; i++){
            codes[i]= (int) chars[i];
        }
        return codes;
    }
}
