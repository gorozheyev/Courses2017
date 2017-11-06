package lecture_5;

import java.util.ArrayList;

public class Numeric_HW {
    public static void main(String[] args) {
        int array[] = {1, 1, 1, 0, 1, 0, 1, 1};
        String hex[] = {"3", "1", "F", "2"};

        System.out.println(desimalToBinary(50));
        System.out.println(convert(110010));
        System.out.println(decToHex(123));
        System.out.println(hexToDec(hex));
    }

    public  static ArrayList<Integer> desimalToBinary(int desimal){
        int binary;
         ArrayList<Integer> mas = new ArrayList<>();
         ArrayList<Integer> mas2 = new ArrayList<>();
        while (desimal != 0) {
        binary = desimal % 2;
        desimal = desimal / 2;
        mas.add(binary);
    }
            for (int i = mas.size() - 1; i >= 0; i--){
        mas2.add(mas.get(i));
    }
    return mas2;
    }

    public static int convert(long binary){
        int a =0;
        int tmp=0;
        long one;
        while(binary!=0){
            one =  binary%10;
            binary = binary/10;
            a = (int) (a + one*Math.pow(2, tmp));
            tmp++;
        }
        return a;
    }

    public static String decToHex(int num){
        int rem;
        String str="";
        char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

        while(num>0) {
            rem=num%16;
            str=hex[rem]+str;
            num=num/16;
        }
        return str;
    }

    public static int hexToDec(String[] hex){
        String arr16[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};
        int hexLength = hex.length;
        int pow = 1;
        int result = 0;

        for (int i = hexLength - 1; i >= 0; i--){
            for (int j = 15; j >= 0; j--){
                if (hex[i] == arr16[j]){
                    result = result + (pow * j);
                }
            }
            pow = pow * 16;
        }
        return result;
    }
}
