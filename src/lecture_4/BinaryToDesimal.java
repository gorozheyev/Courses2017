package lecture_4;

/**
 * Created by Дима on 25.10.2017.
 */
public class BinaryToDesimal {

    public static void main(String[] args) {

        long binary = 1010111;
        int a =0;
        int tmp=0;
        long one;
        while(binary!=0){
            one =  binary%10;
            binary = binary/10;
            a = (int) (a + one*Math.pow(2, tmp));
            tmp++;
        }
        System.out.println(a);
    }
}
