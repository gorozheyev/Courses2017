package lecture_4;

public class ResultForSinus {

    public static void main(String[] args) {

        for (int sin =0; sin<=360; sin=sin+10){
            System.out.println("Sin("+sin+") = "+ Math.sin(Math.toRadians(sin)));
        }
    }
}
