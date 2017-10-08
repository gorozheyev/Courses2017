package lecture_3;

/**
 * Created by Дима on 08.10.2017.
 */
public class PrintNumberInWord_HW {
    public static void main(String[] args) {

        int a = 5;
        if (a==1){
            System.out.println("ONE");
        }else if(a==2){
            System.out.println("TWO");
        }else if(a==3){
            System.out.println("THREE");
        }else if(a==4){
            System.out.println("FOUR");
        }else if(a==5){
            System.out.println("FIVE");
        }else if(a==6){
            System.out.println("SIX");
        }else if(a==7){
            System.out.println("SEVEN");
        }else if(a==8){
            System.out.println("EIGHT");
        }else if(a==9){
            System.out.println("NINE");
        }else{
            System.out.println("OTHER");
        }

//        using switch
        int b = 9;
        switch (b){
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
                case 4:
                System.out.println("FOUR");
                break;
                case 5:
                System.out.println("FIVE");
                break;
                case 6:
                System.out.println("SIX");
                break;
                case 7:
                System.out.println("SEVEN");
                break;
                case 8:
                System.out.println("EIGHT");
                break;
                case 9:
                System.out.println("NINE");
                break;
                default:
                    System.out.println("OTHER");
        }
    }
}
