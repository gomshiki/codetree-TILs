import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(); // 1000
        int b = sc.nextInt(); // 4

        int[] countArry = new int[10];

        while(a > 1){
            countArry[a % b]++; // 1000 % 4 = 0; ... 3 % 4 = 3
            a = a / b; // 1000 / 4 = 250 = a; ... 3 / 4 = 0 = a
        }

        int sum = 0;
        
        for(int i = 0 ; i < 10 ;i++){
            sum += (countArry[i] * countArry[i]);
            
        }
        System.out.println(sum);
    }
}