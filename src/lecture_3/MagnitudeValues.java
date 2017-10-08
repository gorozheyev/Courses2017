package lecture_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Math.abs;

/**
 * Created by Дима on 08.10.2017.
 */
public class MagnitudeValues {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter first number");
        float a = Float.parseFloat(reader.readLine());
        System.out.println("Please enter second number");
        float b = Float.parseFloat(reader.readLine());

        if(abs(a)>abs(b)){
            System.out.println(a+" has biggest magnitude");
        }else {
            System.out.println(b+" has biggest magtitude");
        }
    }
}
