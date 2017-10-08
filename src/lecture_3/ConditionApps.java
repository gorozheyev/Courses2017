package lecture_3;


/**
 * Created by Дима on 08.10.2017.
 */
public class ConditionApps {
    public static void main(String[] args) {

        String browser = "chrome";

        switch (browser) {
            case "chrome":
                System.out.println("Google Chrome");
                break;
            case "firefox":
                System.out.println("Mozila Firefox");
                break;
            case "safari":
                System.out.println("Apple Safari");
                break;
                default:
                    System.out.println("No such browser");
        }
        System.out.println("End of program");
    }
}
