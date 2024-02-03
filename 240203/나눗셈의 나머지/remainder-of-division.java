import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int[] countArry = new int[10];

        while(a >= 1){
            countArry[a % b]++;
            a = a / b;
        }

        int sum = 0;
        
        for(int i = 0 ; i < 10 ;i++){
            sum +=(countArry[i] * countArry[i]);
            
        }
        System.out.println(sum);
    }
}