package lecture_4;

import java.util.Scanner;

/**
 * Created by Дима on 25.10.2017.
 */
public class DecimalToHex {

    public static void main(String[] args) {
        int decimal = 123;
        System.out.println(Integer.toHexString(decimal));

//        второй способ
        Scanner input = new Scanner( System.in );
        System.out.print("Enter a decimal number : ");
        int num =input.nextInt();

        int rem;
        String str="";
        char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

        while(num>0) {
            rem=num%16;
            str=hex[rem]+str;
            num=num/16;
        }
        System.out.println("Method 2: Decimal to hexadecimal: "+str);
    }
}
