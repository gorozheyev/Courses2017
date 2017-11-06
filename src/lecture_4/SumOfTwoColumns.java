package lecture_4;

public class SumOfTwoColumns {

    public static void main(String[] args) {
        int arr1[] = {1, 4, 6, 2, 12, 4, 5, 6, 7, 56};
        int arr2[] = {2, 3, 6, 89, 17, 4, 51, 6, 77, 55};

        if (arr1.length == arr2.length) {
            System.out.println("| row_1 | row_2 | row_3 |");
            for (int i=0; i<=arr1.length-1; i++){
                System.out.println("|  "+arr1[i]+"    |  "+arr2[i]+"    |  "+(arr1[i]+arr2[i])+"    |");
        }
        } else {
            if (arr1.length>arr2.length) {
                System.out.println("Column row_1 has bigger size");
            }else{
                System.out.println("Column row_2 has bigger size");
            }
        }
    }
}
