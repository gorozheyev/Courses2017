package lecture_6;

import java.util.Arrays;

/**
 * Created by Дима on 07.11.2017.
 */
public class modifySomeTexts_HW {

    public static void main(String[] args) {

        String str = "Это удобный способ проверить регулярные выражения, когда вы их пишете в";
        String word = "help";
        String code = "AX6BYU56UX6CV6BNT7NM 287430";

        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(upperLowerCaseChange(str));

        System.out.println("In this text "+countWordsInSomeText(str)+" words");
        System.out.println("Count words with length six simboils - " + countNumberOfWordsEachLength(str, 6));
        System.out.println("Count the single character in text - " + countSingleCaracters(str));
        System.out.println(removeLetterFromSomeText(str, 'о'));

        squareWordPattern(word);

        productCodeValidation(code);
    }

    public static String upperLowerCaseChange(String str){
        String str1[] = str.split(" ");
        String s = "";
        String s2 = "";
        for (int i=0; i<str1.length; i++){
               s = str1[i].toUpperCase();
               s = s.charAt(0)+ s.substring(1).toLowerCase();
               s2 = s2 +s +" ";
            }
        return s2.trim();
    }

    public static int countWordsInSomeText(String str){
        String count[] = str.split(" ");
        return count.length;
    }

    public static int countNumberOfWordsEachLength(String str , int length) {
        int a = 0;
        String count[] = str.split(" ");
        for (int i = 0; i < count.length; i++) {
            String s = count[i];
            if (s.length() == length) {
                a++;
            }
        }
        return a;
    }

    public static int countSingleCaracters(String str){
        String s[] = str.split(" ");
        int a=0;
        for(int i =0; i<s.length; i++){
            if(s[i].length() == 1){
                a++;
            }
        }
        return a;
    }

    public static String removeLetterFromSomeText(String str, char s){
        String s1 ="";
        for(int i=0; i<str.length(); i++){
                if(str.charAt(i)!=s){
                   s1 = s1 + str.charAt(i);
                }
            }
        return s1;
    }

    public static void squareWordPattern(String word){
        char mas[] = word.toCharArray();
        for (int i =0; i<mas.length; i++){
            for (char newMass : mas){
                System.out.print(newMass);
            }
            System.out.println();
            for(int j=0; j<mas.length-1;j++) {
                char letter = mas[j];
                mas[j] = mas[j + 1];
                mas[j + 1] = letter;
            }
        }
    }

    public static void productCodeValidation(String code){
        String mass[] = code.split(" ");
        char letters[] = mass[0].replaceAll("\\d+", "").trim().toCharArray();
        char digitsFrompartOne[] = mass[0].replaceAll("\\D+", "").trim().toCharArray();
        char digitsFromPartTwo[] = mass[1].toCharArray();
        for (int i=0; i<letters.length;i++){
            if(!Character.isUpperCase(letters[i])){
                System.out.println("All letters must be in uppercase");
            }
        }
        if (!(digitsFrompartOne.length == 6)){
            System.out.println("In first part must be six digits");
        }

        for(int i=0; i<digitsFromPartTwo.length; i++){
            if (!Character.isDigit(digitsFromPartTwo[i])){
                System.out.println("In second part must be only digits");
            }
        }
        
    }
}
