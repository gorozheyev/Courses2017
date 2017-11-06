package lecture_4;

import java.util.Arrays;

public class SortArrayFromMinToMax {

    public static void main(String[] args) {

        int arr[] = {1,5,66,-3,234, 23,15,-154};
        int min;
        for (int j =0; j<arr.length;j++){
        for (int i=0; i<arr.length-1; i++){
            if(arr[i+1]<arr[i]) {
                min = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = min;
            }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
