public class T_8_1 {
    public static void main(String[] args) {
        //a
        for (int i = 0; i < 4; i++) {
            System.out.println();
            for (int j = 0; j < 6; j++) {
                System.out.print(5 + " ");
            }
        }
        System.out.println();
        //б
        for (int i = 0; i < 4; i++) {
            System.out.println();
            for (int j = 1; j <= 10; j++) {
                System.out.print(j + " ");
            }
        }
        System.out.println();

        //в
        int n = 41;
        for (int i = 0; i < 4; i++) {
            System.out.println();
            for (int j = n; j <= (n+9); j++) {
                System.out.print(j + " ");
            }
            n=n+10;
        }
    }
}
