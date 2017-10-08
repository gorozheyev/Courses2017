package lecture_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Math.pow;
import static java.lang.StrictMath.sqrt;

/**
 * Created by Дима on 08.10.2017.
 */
public class QuadraticEquation {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter first number");
        float a = Float.parseFloat(reader.readLine());
        System.out.println("Please enter second number");
        float b = Float.parseFloat(reader.readLine());
        System.out.println("Please enter third number");
        float c = Float.parseFloat(reader.readLine());

        if (a == 0) {
            System.out.println("На 0 делить нельзя");
        } else if (pow(b, 2) - 4 * a * c < 0) {
            System.out.println("cannot take the square root of a negative number");
        } else {
            double root1 = (-1 * b + sqrt(pow(b, 2) - 4 * a * c)) / (2 * a);
            System.out.println(root1);
            double root2 = (-1 * b - sqrt(pow(b, 2) - 4 * a * c)) / (2 * a);
            System.out.println(root2);
        }
    }
}
