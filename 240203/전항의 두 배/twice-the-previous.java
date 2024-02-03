import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int[] arry = new int[11]; // 0 ~ 10

        arry[1] = sc.nextInt();
        arry[2] = sc.nextInt();

        for(int i = 3; i < 11 ; i++){

            arry[i] = 2*arry[i - 2] + arry[i - 1];

        }

        for(int i = 1 ; i < 11 ; i++){
            System.out.printf("%d ", arry[i]);
        }
    }
}