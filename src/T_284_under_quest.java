import java.util.Scanner;

public class T_284_under_quest {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Введите количество элементов в массиве а от 1 до 1000");

        int a = sn.nextInt();
        int[] array = new int[a];
        if (a<1 || a>1000){
            System.out.println("Введено некорректное число!");
        }else{
            for (int i = 0; i < array.length; i++) {
                array[i] = sn.nextInt();
            }
        }

        System.out.print("Введите количество подмассивов: ");
        int m = sn.nextInt();
        for (int i = 0; i < m; i++) {
            int start = sn.nextInt();
            int end = sn.nextInt();
            if (start >= 1 && end <= a) {
                for (int j = start; j <= end; j++) {
                    System.out.print(array[j-1] + " ");
                }

                System.out.println();
            } else {
                System.out.println("Введены неверные значения");
            }
        }
    }
}
