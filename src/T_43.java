import java.util.Scanner;

public class T_43 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        String numbers = sn.next();

        char[] Chars = numbers.toCharArray();

        int m = 0;
        int max = 0;
        for (char ch: Chars) {
            if (ch == '0'){
                m++;
            }else{
                m = 0;
            }
            if(max<m){
                max = m;
            }
        }
        System.out.println(max);
    }
}
