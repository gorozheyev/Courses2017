package lecture_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Дима on 08.10.2017.
 */
public class DividesTwoNumbers {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter first number");
        int a = Integer.parseInt(reader.readLine());
        System.out.println("Please enter second number");
        int b = Integer.parseInt(reader.readLine());
        if(b==0) {
            System.out.println("На 0 делить нельзя");
        }else if(a%b ==0){
                System.out.println("Evenly number = "+ a/b);
            }else{
                System.out.println("First number does not divide into second one evenly");
            }

    }
}
