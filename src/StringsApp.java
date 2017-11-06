import java.util.Arrays;

/**
 * Created by Дима on 06.11.2017.
 */
public class StringsApp {

    public static void main(String[] args) {

        String str = "My String";
        String str1 = "My string";
        System.out.println(str==str1);

        System.out.println(str.equals(str1));
        System.out.println(str.equalsIgnoreCase(str1));
        System.out.println(str1.contains("stri"));
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.replace("tr", ""));
        System.out.println(str.replaceAll("t", "T"));
        System.out.println(str.charAt(5));
        System.out.println(str.indexOf("y"));
        System.out.println(str.codePointAt(2));
        System.out.println(Arrays.toString(str.split(" "))); // разбиваетстроку по заданному символу
        System.out.println(str.trim()); //обрезает пробелы в начале и в конце
    }
}
