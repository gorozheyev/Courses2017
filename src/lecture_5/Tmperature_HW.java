package lecture_5;

public class Tmperature_HW {

    public static void main(String[] args) {
        System.out.println("C to K = " + celsiusToKelvin(25));
        System.out.println("K to C = " + kelvinToCelsius(300));
        System.out.println("C to F = " + celsiusToFarengate(120));
        System.out.println("F to C = " + farengatToCelsius(15));
    }

    public static double celsiusToKelvin(int cel) {
        double k = cel + 273.16;
        return  k;
    }
       public static double kelvinToCelsius(int kel){
        double sel = kel - 273.16;
        return sel;
    }
    public static double celsiusToFarengate(int celsius){
        double F = 9./5*celsius + 32;
        return F;
    }
    public static double farengatToCelsius(int farengate) {
        double C = 5. / 9 * (farengate - 32);
        return C;
    }



}
