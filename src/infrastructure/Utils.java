package infrastructure;

/**
 * Created by Дима on 08.10.2017.
 */
public class Utils {
    public static void main(String[] args) {

//        получение рандомного числа в диапозоне от 15 до 47
        int min = 15;
        int max = 47;
        int random = min + (int) (Math.random()*((max-min)+1));
        System.out.println(random);
    }
}
