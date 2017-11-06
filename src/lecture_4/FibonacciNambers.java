package lecture_4;

public class FibonacciNambers {

    public static void main(String[] args) {
        int fib = 10;
        int f1=0;
        int f2=1;
        int res;
        for (int i= 0; i<=fib; i++){
           if (i==0){
               System.out.println(0);
               continue;
           }
           if (i==1){
               System.out.println(1);
               continue;
           } else {
               res= f1+f2;
               f1=f2;
               f2=res;
               System.out.println(res);
           }
        }
    }
}
