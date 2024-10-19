import java.util.Arrays;
import java.util.Scanner;

public class T_6_21_7_1 {
    public static Scanner sn = new Scanner(System.in);
    public static void main(String[] args) {
        //6.21
        int a=1;
        int[] arr = new int[100];
        //заполним массив числами Фибоначчи
        for (int i = 0; i < arr.length; i++) {
            if (i == 0 || i==1 ) {
                arr[i]=1;
            }else{
                arr[i]=arr[i-2]+arr[i-1];
            }
        }

        System.out.println(Arrays.toString(arr));
        int n = sn.nextInt();
        for (int i : arr){
            if(i>n){
                System.out.println(i);
                break;
            }
        }

        //7.1
        String Str = ",";
        for (int i = 100; i <= 200; i++) {
            if(i%3 == 0){
                if (i==198){
                    System.out.print(i+Str.replace(",",";"));
                }else{
                    System.out.print(i+Str);
                }
            }

        }
    }
}
