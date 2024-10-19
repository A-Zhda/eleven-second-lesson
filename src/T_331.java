import java.util.Scanner;

public class T_331 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Введите время отправления: ");

        String a = sn.next();
        String[] time =a.split(":");

        int hour = Integer.parseInt(time[0]);
        int min = Integer.parseInt(time[1]);

        System.out.println("Введите время в пути: ");
        int hour1 = sn.nextInt();
        hour = hour + hour1;

        int min1 = sn.nextInt()+min;
        min1 = min1 % 60;
        hour = (hour + min / 60) % 24;
        System.out.println(hour+":"+min1);

    }
}
