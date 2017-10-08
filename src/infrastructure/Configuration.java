package infrastructure;

/**
 * Created by Дима on 08.10.2017.
 */
public class Configuration {
    public static void main(String[] args) {

//        тернарный оператор
        String browser = System.getenv("browserType") != null ? System.getenv("browserType") : "chrome";
        System.out.println(browser);
    }
}
