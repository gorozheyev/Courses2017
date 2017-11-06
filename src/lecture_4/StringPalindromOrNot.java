package lecture_4;

public class StringPalindromOrNot {

    public static void main(String[] args) {

        String s = "aassddssaa";
        String new_s = "";
        for (int i = s.toCharArray().length - 1; i >= 0; i--) {
            new_s = new_s + s.toCharArray()[i];
        }
        if (s.equals(new_s)) {
            System.out.println("String " + s + " is palindrome");
        } else
            System.out.println("String " + s + " is not palindrome");

//    Печать строки наоборот
        String s1 = "New string reverce";
        String new_s1 = "";
        for (int j = s1.toCharArray().length - 1; j >= 0; j--) {
            new_s1 = new_s1 + s1.toCharArray()[j];
        }
        System.out.println(new_s1);
    }
}
