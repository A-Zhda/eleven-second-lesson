import java.util.Scanner;

public class T_7_26 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int LowTemp = 0;
        for (int i = 0; i < 31; i++) {
       //ввести букву дабы прервать цикл
            if (sn.hasNextInt() || sn.hasNextDouble()){
                if(sn.nextDouble() < 0){
                    LowTemp++;
                }
            }else break;
        }
        System.out.println(LowTemp);
    }
}
