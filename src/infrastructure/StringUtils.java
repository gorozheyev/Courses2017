package infrastructure;

/**
 * Created by Дима on 06.11.2017.
 */
public class StringUtils {

    public static void main(String[] args) {

        System.out.println(randomString("alpha", 10));
        System.out.println(randomString("numeric", 10));
        System.out.println(randomString("alphanumeric", 10));
        System.out.println(randomString("hex", 16));
    }

//    метод для генерации рандомной строки с числами, цифрами и числами+цифры
    public static String randomString(String mode, int length){
        String alphabet;
        switch (mode){
            case "alpha":
                alphabet = "abcdefghijklmnopqrstuvwxyz";
                break;
            case "numeric":
                alphabet = "0123456789";
                break;
            case "alphanumeric":
                alphabet = "abcdefghijklmnopqrstuvwxyz0123456789";
                break;
            case "hex":
                alphabet = "0123456789abcdef";
                break;
                default:
                    alphabet = "";
        }

        String result = "";
        for (int i=0; i<length;i++){
            int index = (int)(Math.random()*alphabet.length());
            result = result + alphabet.charAt(index);
        }

        return result;
    }
}
