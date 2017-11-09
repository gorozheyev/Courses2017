package lecture_6;

/**
 * Created by Дима on 07.11.2017.
 */
public class modifySomeTexts_HW {

    public static void main(String[] args) {

        String str = "Это удобный способ проверить регулярные выражения, когда вы их пишете";
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(upperLowerCaseChange(str));
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
}
