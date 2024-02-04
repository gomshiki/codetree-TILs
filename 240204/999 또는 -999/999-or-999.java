import java.util.Scanner;
import java.lang.Integer;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int max = 0;
        int min = Integer.MAX_VALUE;

        for(int i =0; i< 100 ; i++){
            int a = sc.nextInt();
            if(a == 999 || a == -999) break;
            if(max < a) max = a;
            if(min > a) min = a;
        }

        System.out.println(max + " " + min);
    }
}