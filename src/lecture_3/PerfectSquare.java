package lecture_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.StrictMath.sqrt;

/**
 * Created by Дима on 08.10.2017.
 */
public class PerfectSquare {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter first number");
        int a = Integer.parseInt(reader.readLine());

        int b =  (int)sqrt(a);
        if(b*b == a){
            System.out.println(a + " is a perfect square");
        }else {
            System.out.println(a + " is not a perfect square");
        }
    }
}
