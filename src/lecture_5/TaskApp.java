package lecture_5;

public class TaskApp {

    public static void main(String[] args) {

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j <= 8; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
        System.out.println("________________________");

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
        System.out.println("________________________");

        for (int i = 0; i < 8; i++) {
            for (int j = i; j < 8; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
        System.out.println("_________________________");

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (j < i) {
                    System.out.print("  ");
                } else {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
        System.out.println("_________________________");


        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (j >=7 - i) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("__________________________");



        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (i==0 || j==0||i==7||j==7) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("__________________________");


        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (i==0 || i==7||i==j) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("__________________________");


        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (i==0 || i==7||i==7 - j) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("__________________________");
    }
}
