import java.util.Scanner;

public class T_233 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Количество мостов:");
        int kol_most = sn.nextInt();
        boolean isCrashed = false;

        for (int i = 1; i <= kol_most; i++) {
            System.out.println("Высота моста: ");
            int height = sn.nextInt();
            if (height <= 437) {
                System.out.println("Авария " + i);
                isCrashed = true;
                break;
            }
        }
        if (!isCrashed) {
            System.out.println("Без аварий");
        }
    }
}
