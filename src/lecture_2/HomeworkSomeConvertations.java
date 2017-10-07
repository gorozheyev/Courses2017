package lecture_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by gorozheyevd on 06.10.2017.
 */
public class HomeworkSomeConvertations {
    //    Enter test data from command line and calculate the value
//    Formulas:
//    Celsius = 5/9 (F - 32)
//    Kelvin = C + 273.16
//   Convert Celsius to Fahrenheit
//   Convert Fahrenheit to Celsius
//   Convert Celsius to Kelvin

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        Convert Celsius to Fahrenheit
        System.out.println("Enter a Celsius");
        double celsius = Double.parseDouble(reader.readLine());
        double F = 9./5*celsius + 32;
        System.out.println(celsius+ " °C = "+ F + " °F" );
//        Convert Fahrenheit to Celsius
        System.out.println("Enter a Fahrenheit");
        double farengate = Double.parseDouble(reader.readLine());
        double C = 5./9*(farengate -32);
        System.out.println(farengate+ " °F = "+ C + " °C" );
//        Convert Celsius to Kelvin
        System.out.println("Enter a Celsius");
        double cel = Double.parseDouble(reader.readLine());
        double K = cel + 273.16;
        System.out.println(cel+ " °C = "+ K + " K" );

//        Formulas:
//        1m = 39.37in
//        1mi = 1.609km
//        1kg = 2.2046lb
//        1km/hr = 0.6214mi/hr
//        Convert meters to inches. And reverse
        System.out.println("Enter meters");
        double m = Double.parseDouble(reader.readLine());
        double inch = m*39.37;
        System.out.println(m+ " meters = "+inch+ " inches");

        System.out.println("Enter inches");
        double in = Double.parseDouble(reader.readLine());
        double met = in/39.37;
        System.out.println(in+ " meters = "+met+ " meters");

//        Convert miles to kilometres. And reverse
        System.out.println("Enter miles");
        double mi = Double.parseDouble(reader.readLine());
        double kilom = mi*1.609;
        System.out.println(mi+ " miles = "+kilom+ " kilometres");

        System.out.println("Enter kilometers");
        double ki = Double.parseDouble(reader.readLine());
        double miles = ki/1.609;
        System.out.println(ki+ " kilometers = "+miles+ " miles");

//        Convert kilograms to pounds. And reverse
        System.out.println("Enter kilograms");
        double kilogr = Double.parseDouble(reader.readLine());
        double po = kilogr*2.2046;
        System.out.println(kilogr+ " kilograms = "+po+ " pounds");

        System.out.println("Enter pounds");
        double pou = Double.parseDouble(reader.readLine());
        double kg = pou/2.2046;
        System.out.println(pou+ " pounds = "+kg+ " kilograms");

//        Convert speed km/hr to mi/hr. And reverse
        System.out.println("Enter km/hr");
        double km = Double.parseDouble(reader.readLine());
        double milesHour = km*0.6214;
        System.out.println(km+ " km/hr = "+milesHour+ " mi/hr");

        System.out.println("Enter mi/hr");
        double mileH = Double.parseDouble(reader.readLine());
        double kmH = mileH/0.6214;
        System.out.println(mileH+ " mi/hr = "+kmH+ " km/hr");
    }


}
