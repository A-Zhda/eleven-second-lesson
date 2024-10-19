import java.util.Scanner;

public class T_5_27 {
    public static int result = 0;
    public static Scanner sn = new Scanner(System.in);
    public static boolean ConditionFullFill;
    public static void main(String[] args) {
        //5.27 (а,г)
        for (int i = 100; i <= 500; i++) {
            result += i;
        }
        System.out.println(result);
        result = 0;

        int a = sn.nextInt();
        int b = sn.nextInt();

        ConditionFullFill = b>=a ? true : false;
        if (ConditionFullFill){
            for (int i = a; i <= b; i++) {
                result += i;
            }
        } else {
            System.out.println("Услвоие не выполнено");
        }
        System.out.println(result);
        result = 1;
    }
}
