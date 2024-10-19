import java.util.Scanner;

public class T_5_28_72 {
    public static int result = 0;
    public static Scanner sn = new Scanner(System.in);
    public static boolean ConditionFullFill;

    public static void main(String[] args) {

        //5.28 (а,г)
        for (int i = 8; i <= 15 ; i++) {
            result*=i;
        }
        System.out.println(result);
        result = 1;

        int a = sn.nextInt();
        int b = sn.nextInt();

        ConditionFullFill = b>=a ? true : false;
        long resultL = 1L;
        if (ConditionFullFill){
            for (int i = a; i <= b; i++) {
                resultL *= i;
            }
        } else {
            System.out.println("Услвоие не выполнено");
        }
        System.out.println(resultL);
        System.out.println();

        //5.8
        double funt = 0;
        for (double i = 1; i <= 10; i++) {
            funt = i*1000/453;
             System.out.println(i + " кг = "+String.format("%.3f",funt) + " фунтов");
        }
        System.out.println();

        //5.72
        b = 1;
        a = 0;
        double a1 = 10;
        while (b<=10){
            a1 += a1 *0.1;
            System.out.println("Пробег лыжника за " + b + " день : "+String.format("%.2f",a1)+" км");
            if(b<=7){
                a+=a1;
            }
            b++;
        }
        System.out.println("Cуммарный путь за первые 7 дней тренировок: "+a);
    }
}
