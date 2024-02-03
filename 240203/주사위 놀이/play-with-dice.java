import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int[] countArry = new int[7];

        for(int i = 0; i < 10 ; i++){

            countArry[sc.nextInt()]++;

        }

        for(int j = 1 ; j < countArry.length ; j++){
            System.out.printf("%d - %d\n", j, countArry[j]);
        }
    }
}