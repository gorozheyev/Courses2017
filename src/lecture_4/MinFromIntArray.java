package lecture_4;

/**
 * Created by Дима on 25.10.2017.
 */
public class MinFromIntArray {

    public static void main(String[] args) {

        int arr[] = {2,5,65,123,0,6,-4,555};
        int min= 0;
        for (int i=0; i<arr.length; i++){
            if (arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
