import java.util.Scanner;

public class T_7_56 {
    public static double maxDistance = Double.MIN_VALUE;
    public static String cityName = "";

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Количество городов:");
        int kolCity = sn.nextInt();
        double km = 0;
        String gorod = "";
        for (int i = 0; i < kolCity; i++) {
            System.out.println("Введите расстояние и Название города");
                km = sn.nextDouble();
                gorod = sn.nextLine();
                if(km > maxDistance){
                    maxDistance = km;
                    cityName = gorod;
                }
        }
        System.out.println(maxDistance + " "+ cityName);
    }
}
