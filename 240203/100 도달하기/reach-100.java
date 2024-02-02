import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arry = new int[50];

        arry[2] = n;
        arry[1] = 1;
        System.out.printf("%d %d ", arry[1], arry[2]);

        for(int i = 3; i < 50 ; i++){
            arry[i] = arry[i-1] + arry[i-2];
            System.out.printf("%d ", arry[i]);
            if(arry[i] > 100) break;
        }
    }
}