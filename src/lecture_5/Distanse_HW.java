package lecture_5;

public class Distanse_HW {
    public static void main(String[] args) {
        System.out.println("Meters to inches = "+ metersToInches(12.0));
        System.out.println("Inches to meters = "+ inchesToMeters(35.5));
        System.out.println("Miles to kilometers = "+ milesToKilometres(100));
        System.out.println("Kilometers to meters = "+ kilometersToMeters(5));
    }

    public static double metersToInches(double meters){
        double inch = meters*39.37;
        return inch;
    }
    public static double inchesToMeters(double inches){
        double meters = inches/39.37;
        return meters;
    }
    public static double milesToKilometres(double miles){
        double kilom = miles*1.609;
        return kilom;
    }
    public static double kilometersToMeters(double kilom){
        double meters = kilom*1000;
        return meters;
    }
}
