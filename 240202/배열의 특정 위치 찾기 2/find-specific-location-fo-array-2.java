import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int sum1 = 0;
        int sum2 = 0;

        for(int i = 0 ; i < 10; i++){
            
            int a = sc.nextInt();
            
            if(i % 2 == 0) {
                sum1 += a;
            } else {
                sum2 += a;
            }
        }

        System.out.println(sum1 > sum2 ? sum1 - sum2 : sum2 - sum1);
    }
}