package lecture_5;

import java.util.Arrays;

import static java.lang.Math.pow;
import static java.lang.StrictMath.sqrt;

public class QuadraticEquation_HW {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(quadraticEquation(8,23,4)));
    }

    public static double[] quadraticEquation(int a, int b, int c){
        double arr[] = new double[2];
        if (a == 0) {
            System.out.println("На 0 делить нельзя");
        } else if (pow(b, 2) - 4 * a * c < 0) {
            System.out.println("cannot take the square root of a negative number");
        } else {
            double root1 = (-1 * b + sqrt(pow(b, 2) - 4 * a * c)) / (2 * a);
            arr[0] = root1;
            double root2 = (-1 * b - sqrt(pow(b, 2) - 4 * a * c)) / (2 * a);
            arr[1] = root2;
        }
        return arr;
    }
}
