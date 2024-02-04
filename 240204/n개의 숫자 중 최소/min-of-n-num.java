import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int minVal = Integer.MAX_VALUE;
        int n = sc.nextInt();
        int cnt = 0;

        for(int i = 0; i < 10; i++){
            
            int val = sc.nextInt();
            if(minVal >= val) {
                minVal = val;
                cnt++;
            }


        }
        
        System.out.println(minVal + " " + cnt);
    }
}