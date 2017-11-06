package lecture_5;

public class Weight_HW {
    public static void main(String[] args) {
        System.out.println("Pounds to kiloggram = "+poundsToKilogram(123.6));
        System.out.println("Kilograms to pound = "+kilogramToPound(12));
    }
    public static double poundsToKilogram(double pound){
        double kg = pound/2.2046;
        return kg;
    }
    public static double kilogramToPound(double kilo){
        double po = kilo*2.2046;
        return po;
    }
}
