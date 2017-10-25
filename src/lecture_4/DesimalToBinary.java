package lecture_4;

import java.util.ArrayList;

public class DesimalToBinary {

    public static void main(String[] args) {

        int desimal = 98;
        int binary;
        ArrayList<Integer> mas = new ArrayList<>();
        while (desimal != 0) {
            binary = desimal % 2;
            desimal = desimal / 2;
            mas.add(binary);
        }
            for (int i = mas.size() - 1; i >= 0; i--) {
                System.out.print(mas.get(i));
        }
        System.out.println();

        System.out.print(Integer.toBinaryString(22));
        System.out.println();
        System.out.print(Integer.toBinaryString(98));
    }
}




