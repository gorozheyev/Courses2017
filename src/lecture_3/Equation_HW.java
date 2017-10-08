package lecture_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Дима on 08.10.2017.
 */
public class Equation_HW {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter first number");
        int a = Integer.parseInt(reader.readLine());
        System.out.println("Please enter second number");
        int b = Integer.parseInt(reader.readLine());

        if (a!=0) {
            double x = (double)-b / a;
            System.out.println("x = "+x);
        }else{
            System.out.println("Деление на ноль");
        }
    }
}
