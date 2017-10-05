package lesson_2;

/**
 * Created by gorozheyevd on 05.10.2017.
 */
public class EnvVar {
    public static void main(String[] args) {
        System.out.println(System.getenv(args[0]));
    }
}
