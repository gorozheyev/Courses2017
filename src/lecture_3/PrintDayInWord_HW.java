package lecture_3;

/**
 * Created by Дима on 08.10.2017.
 */
public class PrintDayInWord_HW {
    public static void main(String[] args) {

        int a = 3;
        if (a == 0) {
            System.out.println("Sunday");
        } else if (a == 1) {
            System.out.println("Monday");
        } else if (a == 2) {
            System.out.println("Tuesday");
        }else if(a==3){
            System.out.println("Wednesday");
        }else if(a==4){
            System.out.println("Thuersday");
        }else if(a==5){
            System.out.println("Friday");
        }else if(a==6){
            System.out.println("Saturday");
        }else {
            System.out.println("Not a valid day");
        }

        int b = 1;
        switch (b){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuersday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
                default:
                    System.out.println("Not a valid day");
        }
    }
}
