package infrastructure;

/**
 * Created by Дима on 08.10.2017.
 */
public class Configuration {
    public static void main(String[] args) {

//        тернарный оператор
        String browser = System.getenv("browserType") != null ? System.getenv("browserType") : "chrome";
        System.out.println(browser);

//        вызов метода getEnvirontmentVaribleOrDefault()
        String browser2 = getEnvirontmentVaribleOrDefault("browserType", "Chrome");
        System.out.println(browser2);
    }

    public static String getEnvirontmentVaribleOrDefault(String envVar, String defaultValue){
        return System.getenv(envVar) != null ? System.getenv(envVar) : defaultValue;
    }
}
