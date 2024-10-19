public class T_8_3 {
    public static void main(String[] args) {
        //а
        System.out.println(1);
        for (int i = 2; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }

        //б
        System.out.println();
        for (int i = 5; i < 10; i++) {
            for (int j = 10 - i; j > 0; j--) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        //в
        System.out.println();
        for (int i = 10; i <= 50; i=i+10) {
            for (int j = 0; j < (i/10); j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }

        //г;
        System.out.println();
        for (int i = 5; i < 30; i += 5) {
            for (int j = 0; j < 6 - i / 5; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
